package Java�߼����181902.ʵ��3;

public class Test{
	public static void main(String[] args) throws Exception {
		
		new DBUtil();
		UserDao userDao=new UserDao();		
		userDao.queryAll();
		
		//���һ���û�
		User user=new User();
		user.setID("006");
		user.setName("����");
		user.setPassword("abcde");
		userDao.add(user);
				
		//ͨ��������ѯ�û�
		userDao.queryByName("����");
		
		//�޸����û�������
		userDao.updatePassword("����","56789");
		userDao.queryByName("����");
		
		//ͨ������ɾ���û�
		userDao.deleteByName("����");		
		userDao.queryAll();	
		
		DBUtil.closeConnection();              
	}
}
