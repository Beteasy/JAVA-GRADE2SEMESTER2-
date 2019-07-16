package Java高级编程181902.实验3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {
	String sql; 
	Connection conn=null;
	Statement stat;

	//构造方法
	public UserDao() {
		conn=DBUtil.getConnection();
		
		//3. 使用conncetion创建一个statement对象  
		try {
			stat = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}    
	}

	//添加一个新用户
	public void add(User user) {
		String id = user.getID();
		String name =user.getName();
		String password =user.getPassword();
		sql = "insert into dbo.userInfo values('"+id+"', '"+name+"\', \'"+password+"\')";
		System.out.println(sql);	
		
		try {
			int rowNum=stat.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		System.out.println();	
	}
	
	//通过姓名删除用户
	void deleteByName(String name){
		String delete="delete userInfo ";
		String where="where name=\'"+name+"\'";
		sql = delete+where;
		System.out.println(sql);	
		
		try {
			int rowNum=stat.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		
	}
	
	//修改新用户的密码
	void updatePassword(String name, String newPassword){
		String update="update userInfo ";
		String set="set password="+newPassword;
		String where=" where name=\'"+name+"\'";
		sql = update+set+where;
		System.out.println(sql);
		
		try {
			int rowNum=stat.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//System.out.println();
		
	}
	
	//通过姓名查询用户
	public boolean queryByName(String name) {
		boolean exist=false;
		String select="select * from userInfo ";
		String where="where name=\'"+name+"\'";
		sql = select+where;
		System.out.println(sql);	
		
		//4. 执行sql语句  
		try {
			ResultSet rs = stat.executeQuery(sql);
			if(rs!=null) {
				exist=true;
			}
			//遍历结果集  
			while(rs.next()){  
				System.out.print(rs.getString("ID")+", ");
				System.out.print(rs.getString("name")+", ");
				System.out.println(rs.getString("password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		} 
		System.out.println();
		
		return exist;
	}
	
	//查询所有用户
	public void queryAll() {		
		try {
			//4. 执行sql语句  
			ResultSet rs = stat.executeQuery("select * from userInfo");  
    
			//遍历结果集  
			while(rs.next()){  
				System.out.print(rs.getString("ID")+", ");
				System.out.print(rs.getString("name")+", ");
				System.out.println(rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 	
		
		System.out.println();		
	}
	
}
