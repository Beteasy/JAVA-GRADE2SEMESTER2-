package Java�߼����181902.ʵ��3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {
	String sql; 
	Connection conn=null;
	Statement stat;

	//���췽��
	public UserDao() {
		conn=DBUtil.getConnection();
		
		//3. ʹ��conncetion����һ��statement����  
		try {
			stat = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}    
	}

	//���һ�����û�
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
	
	//ͨ������ɾ���û�
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
	
	//�޸����û�������
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
	
	//ͨ��������ѯ�û�
	public boolean queryByName(String name) {
		boolean exist=false;
		String select="select * from userInfo ";
		String where="where name=\'"+name+"\'";
		sql = select+where;
		System.out.println(sql);	
		
		//4. ִ��sql���  
		try {
			ResultSet rs = stat.executeQuery(sql);
			if(rs!=null) {
				exist=true;
			}
			//���������  
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
	
	//��ѯ�����û�
	public void queryAll() {		
		try {
			//4. ִ��sql���  
			ResultSet rs = stat.executeQuery("select * from userInfo");  
    
			//���������  
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
