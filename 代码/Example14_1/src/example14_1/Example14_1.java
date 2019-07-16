package example14_1;

import java.sql.*;
public class Example14_1 {
   public static void main(String args[]) {
     //�������ݿ����
     String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=factory";
     final String USER="sa";
     final String PASSWORD="admin";    
      Connection con;		//���ݿ�����
      Statement sql; 		
      ResultSet rs;
      
      try{//1.������������            
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      } catch(ClassNotFoundException e) {
            System.out.print(e);
      }
	   try {
	   	//2.������ݿ������ 
      	con=(Connection)DriverManager.getConnection(URL,USER,PASSWORD);

	    	//3.�õ�����conn�󣬻�ȡ��ִ��sql����Statement����
          sql=con.createStatement();          

      	//4. Statement����ִ�в�ѯ���ݿ��SQL��䣬����һ�������(ResultSet)����
          rs=sql.executeQuery("SELECT * FROM employee WHERE salary>1900");
          
          //5. ���������
          while(rs.next()) {
             String number=rs.getString(1);
             String name=rs.getString(2);
             Date date=rs.getDate("birthday");
             double salary=rs.getDouble("salary");
             System.out.printf("%10s",number);
             System.out.printf("%-6s",name);		//'-'��ʾ��ʾ��ռλ��ǰ��6λ
             System.out.printf("%-15s",date.toString()); 
             System.out.printf("%6s\n",salary);//��ʾ��ʽ�����ַ������ʱռ6���ֿ�ȣ�����ʾ����ռλ��ǰ���6λ
          }
		  con.close(); 		//�ر����ݿ�����
      } catch(SQLException e) { 
         System.out.println(e);
      }
  }
}


      
