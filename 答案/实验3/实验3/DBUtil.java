package Java高级编程181902.实验3;

import java.sql.*;

//数据库连接类，需要连接数据库时使用该类
public class DBUtil {	
	//设置数据库参数
	String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=information";
    private static final String USER="sa";
    private static final String PASSWORD="12345";    
    private static Connection conn=null;
    
    //补充建立连接的代码
    {    	
    	try {
    		//1. 加载驱动    	
			Class.forName(driver);		
    	
			//2.使用driverManager获取数据库链接，获取connection代表了java程序和数据库的链接  
			conn = DriverManager.getConnection(URL, USER, PASSWORD);  
        
			
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

    //getConnection方法返回所建立的数据库连接，即：Connection对象
    public static Connection getConnection(){
    	return conn;
    }
    
    public static void closeConnection() {
    	try {
    		if(conn!=null)
    			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }    
}
