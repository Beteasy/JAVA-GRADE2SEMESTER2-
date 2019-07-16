package Java高级编程181902.实验3;

public class Test{
	public static void main(String[] args) throws Exception {
		
		new DBUtil();
		UserDao userDao=new UserDao();		
		userDao.queryAll();
		
		//添加一个用户
		User user=new User();
		user.setID("006");
		user.setName("张三");
		user.setPassword("abcde");
		userDao.add(user);
				
		//通过姓名查询用户
		userDao.queryByName("张三");
		
		//修改新用户的密码
		userDao.updatePassword("张三","56789");
		userDao.queryByName("张三");
		
		//通过姓名删除用户
		userDao.deleteByName("张三");		
		userDao.queryAll();	
		
		DBUtil.closeConnection();              
	}
}
