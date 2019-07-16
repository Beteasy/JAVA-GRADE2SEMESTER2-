package DBConnect;

import java.sql.*;

public class DBConnect {	
	//这里可以设置数据库名称
    private static String URL = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=factory";
    private static final String USER="sa";
    private static final String PASSWORD="admin";
    
    private static Connection conn=null;
       
    //测试用例
    public static void main(String[] args) throws Exception{
    	try {
            //1.加载驱动程序
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                       
            //2.获得数据库的连接
            conn=(Connection)DriverManager.getConnection(URL,USER,PASSWORD);
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        //3.得到连接conn后，获取可执行sql语句的Statement对象
        Statement stmt = conn.createStatement();
        
        //4. Statement对象执行查询数据库的SQL语句，返回一个结果集（ResultSet）对象。
        ResultSet rs = stmt.executeQuery("select * from employee");
        
        while(rs.next()){//如果对象中有数据，就会循环打印出来
            System.out.print(rs.getString("number")+",");
            System.out.print(rs.getString("name")+", ");
            System.out.print(rs.getDate("birthday")+",");
            System.out.println(rs.getFloat("salary"));
        }
    }
}