package shiyan3;

import java.sql.*;
import java.util.Scanner;

/**
 * *
 * @author MR.JOHN
 *UserDao.java, ��רΪUser����Ƶ����ݷ�����
 *����ʹ��JDBC����ṩ���ݵ�����ɾ�ĵķ���
 *������Ҫ�������ݿ��sql���������ڸ�����
 */
public class UserDao {
	
	private Connection conn;
	private Statement stat;
	private ResultSet rs;

	UserDao(Connection conn){
		
		this.conn = conn;
		try {
			stat = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//���һ���û�����Ϣ��User���У�����û��Ѿ��������ظ����
	public boolean add(User user){
		//flag�����ж��û��Ƿ��ظ�
		boolean flag = false;
		String sql = "select username from users where username='"+user.username+"'";
		String sql2 = "insert into users values('"+user.username+"',"+"'"+user.password+"')";
		try {
		 	rs = stat.executeQuery(sql);
		 	if(rs.next()) {
		 		flag = false;
		 	}
		 	else {
		 		stat.executeUpdate(sql2);
		 		flag = true;
		 	}
		 	conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	//���û����������û��������Ը��������ֶβ�ѯ�û�
	public User query(String name) {
		//user�������ز�ѯ�õ��Ķ������������򷵻�null
		User user = null;
		String sql = "select * from users where username='"+name+"'";
		try {
			rs = stat.executeQuery(sql);
			if(rs.next()) {
				user = new User();
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
	//ɾ��һ���û���¼�����磺�����û�������ɾ��ĳ���û�
	public int delete(String name) {
		int result=0;
		String sql = "delete from users where username ='"+name+"'";
		try {
			result = stat.executeUpdate(sql);		//�������α������洢���ؽ������������
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	//�����û���Ϣ�����磺�޸�����
	public int update(String name, String password) {
		//�޸�ָ���û�������
		int result = 0;
		String sql = "update users set password='"+password+"'where username='"+name+"'";
		try {
			result = stat.executeUpdate(sql);
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	//��������ʾ�����û���Ϣ
	public ResultSet queryAll() {
		String sql = "select * from users";
		try {
			rs = stat.executeQuery(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}
