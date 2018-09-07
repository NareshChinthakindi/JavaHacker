/**
 * 
 */
package jdbc;

import java.sql.Connection;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class DataSource {
	
	
	public static JdbcConnectionPool pool = new JdbcConnectionPool();
	
	public Connection getConnection() {
		return pool.getConnection();
	}
	
	
	public void releaseConnection(final Connection connection) {
		pool.releaseConnection(connection);
	}

}
