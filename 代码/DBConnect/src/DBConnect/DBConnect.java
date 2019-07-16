package DBConnect;

import java.sql.*;

public class DBConnect {	
	//��������������ݿ�����
    private static String URL = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=factory";
    private static final String USER="sa";
    private static final String PASSWORD="admin";
    
    private static Connection conn=null;
       
    //��������
    public static void main(String[] args) throws Exception{
    	try {
            //1.������������
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                       
            //2.������ݿ������
            conn=(Connection)DriverManager.getConnection(URL,USER,PASSWORD);
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        //3.�õ�����conn�󣬻�ȡ��ִ��sql����Statement����
        Statement stmt = conn.createStatement();
        
        //4. Statement����ִ�в�ѯ���ݿ��SQL��䣬����һ���������ResultSet������
        ResultSet rs = stmt.executeQuery("select * from employee");
        
        while(rs.next()){//��������������ݣ��ͻ�ѭ����ӡ����
            System.out.print(rs.getString("number")+",");
            System.out.print(rs.getString("name")+", ");
            System.out.print(rs.getDate("birthday")+",");
            System.out.println(rs.getFloat("salary"));
        }
    }
}