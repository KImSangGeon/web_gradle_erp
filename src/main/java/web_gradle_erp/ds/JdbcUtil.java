package web_gradle_erp.ds;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {	
	
public static Connection getConnection() {
	
//	웹에선 테스트 못한다/
		
		Connection con = null;		
			try {
				String url = "jdbc:mysql://localhost:3306/native_jdbc?useSSL=false";
				String id = "user_native_jdbc";				
				String passwd = "rootroot";
				
				con = DriverManager.getConnection(url, id, passwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}	

		return con;
	}
}
