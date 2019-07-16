package example14_1;

import java.sql.*;
public class Example14_1 {
   public static void main(String args[]) {
     //设置数据库参数
     String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=factory";
     final String USER="sa";
     final String PASSWORD="admin";    
      Connection con;		//数据库连接
      Statement sql; 		
      ResultSet rs;
      
      try{//1.加载驱动程序            
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      } catch(ClassNotFoundException e) {
            System.out.print(e);
      }
	   try {
	   	//2.获得数据库的连接 
      	con=(Connection)DriverManager.getConnection(URL,USER,PASSWORD);

	    	//3.得到连接conn后，获取可执行sql语句的Statement对象
          sql=con.createStatement();          

      	//4. Statement对象执行查询数据库的SQL语句，返回一个结果集(ResultSet)对象。
          rs=sql.executeQuery("SELECT * FROM employee WHERE salary>1900");
          
          //5. 操作结果集
          while(rs.next()) {
             String number=rs.getString(1);
             String name=rs.getString(2);
             Date date=rs.getDate("birthday");
             double salary=rs.getDouble("salary");
             System.out.printf("%10s",number);
             System.out.printf("%-6s",name);		//'-'表示显示在占位的前面6位
             System.out.printf("%-15s",date.toString()); 
             System.out.printf("%6s\n",salary);//表示格式化的字符串输出时占6个字宽度，且显示在在占位的前面后6位
          }
		  con.close(); 		//关闭数据库连接
      } catch(SQLException e) { 
         System.out.println(e);
      }
  }
}


      
