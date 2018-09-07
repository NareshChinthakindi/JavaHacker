/**
 * 
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class JdbcConnectionPool {

	
	private List<Connection> idleConnections = new LinkedList<Connection>();
	
	private static final Integer MAX_POOL_SIZE = 4;
	
	
	public JdbcConnectionPool() {
		initializeConnectionPool();
	}


	private void initializeConnectionPool() {
		
		while(!isMaxPoolSizeReached()) {
			idleConnections.add(createNewConnection());
			
		}
		
	}


private Connection createNewConnection() {
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc://mysql://localhost:3306/bootdb", "root", "root123$");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return connection;
	}


	private boolean isMaxPoolSizeReached() {
		return idleConnections.size() > MAX_POOL_SIZE;
	}
	
	public synchronized Connection getConnection() {
		Connection connection = null;
		if(idleConnections.size() > 0) {
			connection = idleConnections.remove(0);
		}
		
		return connection;
	}
	
	public synchronized void releaseConnection(final Connection connection) {
		idleConnections.add(connection);
	}


}
