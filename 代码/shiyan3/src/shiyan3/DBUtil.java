package shiyan3;

import java.sql.*;

public class DBUtil {

	private static final String URL="jdbc:sqlserver://localhost:1433;DatabaseName=Information";
	private static final String USER="sa";
	private static final String PASSWORD="admin";
	private static Connection conn=null;

	public DBUtil() {
		
		try {
			//加载驱动程序
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}
		catch(ClassNotFoundException e) {
			System.out.print(e);
		}
		
		try {
			//建立连接
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		}
		catch(SQLException e) {
			System.out.print(e);
		}
	}
	
	//getConnection方法返回所建立的数据库连接，即：Connection对象
	public static Connection getConnection() {
		return conn;
	}
	
}
