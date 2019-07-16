package shiyan3;

import java.sql.*;
import java.util.Scanner;

/**
 * *
 * @author MR.JOHN
 *UserDao.java, 是专为User类设计的数据访问类
 *该类使用JDBC编程提供数据的增查删改的服务
 *所有需要操作数据库的sql语句均包含在该类中
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
	
	//添加一个用户的信息到User表中，如果用户已经存在则不重复添加
	public boolean add(User user){
		//flag用来判断用户是否重复
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
	
	//按用户姓名查找用户，还可以根据其他字段查询用户
	public User query(String name) {
		//user用来返回查询得到的对象，若不存在则返回null
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
	
	//删除一个用户记录，比如：根据用户名或编号删除某个用户
	public int delete(String name) {
		int result=0;
		String sql = "delete from users where username ='"+name+"'";
		try {
			result = stat.executeUpdate(sql);		//定义整形变量来存储返回结果，后期利用
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	//更新用户信息，比如：修改密码
	public int update(String name, String password) {
		//修改指定用户的密码
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
	
	//遍历并显示所有用户信息
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
