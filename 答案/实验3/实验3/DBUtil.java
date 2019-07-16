package Java�߼����181902.ʵ��3;

import java.sql.*;

//���ݿ������࣬��Ҫ�������ݿ�ʱʹ�ø���
public class DBUtil {	
	//�������ݿ����
	String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=information";
    private static final String USER="sa";
    private static final String PASSWORD="12345";    
    private static Connection conn=null;
    
    //���佨�����ӵĴ���
    {    	
    	try {
    		//1. ��������    	
			Class.forName(driver);		
    	
			//2.ʹ��driverManager��ȡ���ݿ����ӣ���ȡconnection������java��������ݿ������  
			conn = DriverManager.getConnection(URL, USER, PASSWORD);  
        
			
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

    //getConnection�������������������ݿ����ӣ�����Connection����
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
