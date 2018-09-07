/**
 * 
 */
package jdbc;

import java.sql.Connection;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class ConnectionPoolMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DataSource dataSource = new DataSource();
			
			for(int index=0; index<10; index++) {
				Connection connection = dataSource.getConnection();
				System.out.println(connection);
				
				dataSource.releaseConnection(connection);
			}

	}

}
