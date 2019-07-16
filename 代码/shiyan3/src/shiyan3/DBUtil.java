package shiyan3;

import java.sql.*;

public class DBUtil {

	private static final String URL="jdbc:sqlserver://localhost:1433;DatabaseName=Information";
	private static final String USER="sa";
	private static final String PASSWORD="admin";
	private static Connection conn=null;

	public DBUtil() {
		
		try {
			//������������
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}
		catch(ClassNotFoundException e) {
			System.out.print(e);
		}
		
		try {
			//��������
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		}
		catch(SQLException e) {
			System.out.print(e);
		}
	}
	
	//getConnection�������������������ݿ����ӣ�����Connection����
	public static Connection getConnection() {
		return conn;
	}
	
}
