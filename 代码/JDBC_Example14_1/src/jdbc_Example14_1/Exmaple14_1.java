package jdbc_Example14_1;

import java.sql.*;

public class Exmaple14_1 {
	
	private static String URL = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=factory";
    private static final String USER="sa";
    private static final String PASSWORD="admin";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Connection con = null;
		Statement stmt;
		ResultSet rs;
		
		//加载驱动
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}
		catch(ClassNotFoundException e) {
			System.out.print(e);
		}
		
		//建立连接
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String sql = "select * from employee";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String number = rs.getString("number");
				String name = rs.getString("name");
				System.out.println(number+","+name);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
