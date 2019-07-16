package 预习5;
import java.io.* ;

import java.util.*;
public class Register
{

	public static void main(String[] args)
	{
		File  user=new File("C:\\Users\\lenovo\\Desktop\\学\\Aser.txt");
		String regex1="[a-zA-Z]+";
		String regex2="[0-9]+";
		String regex3=":";
		Scanner inone=new Scanner(System.in);
		Scanner intwo=new Scanner(System.in);
		String n,p,m;
		String s="UserName:";
		String s1="PassWord:";
		System.out.println("请输入用户名:");
		n=inone.nextLine();
		Boolean	flag1=true;
		while(flag1)
		{	boolean flag=true;
			if(user.exists()&&user.length()!=0)
			{
			
			try {
				FileReader One=new FileReader(user);
				BufferedReader Two=new BufferedReader(One);
				String a=null;
				
				int i=0;
				try {
					while((a=Two.readLine())!=null)//判断是否重复                                                                   
					{
						String b[]=a.split(regex3);
						for(i=0;i<b.length;i++)
						{
							if(n.equals(b[i]))
							{
								flag=false;
								
							}
							
						}
					}
				} catch (IOException e) {
					
					e.printStackTrace();
					
				}
			} catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
			}
			}
			if(!flag)
			{
				System.out.println("用户名已存在，请重新输入");
				n=inone.nextLine();
			}
			while(!n.matches(regex1))
			{
				System.out.println("格式错误，请重新输入用户名");
				n=inone.nextLine();
			}
			System.out.println("请输入密码:");
			p=intwo.nextLine();
			while(!p.matches(regex2))
			{
				System.out.println("格式错误,请重新输入密码");
				p=intwo.nextLine();
			}	
			
			if(p.matches(regex2)&&n.matches(regex1)&&flag)
			{
				System.out.println("注册成功!");
				flag1=false;
			
				try {
					FileWriter f=new FileWriter(user,true);
					BufferedWriter out=new BufferedWriter(f);
					out.append(s);//追加
					out.append(n);
					out.newLine();
					out.close();
				
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			try 
				{
					FileWriter f=new FileWriter(user,true);
					BufferedWriter out=new BufferedWriter(f); 
					out.append(s1);
					out.append(p);
					out.newLine();
					out.close();
				} catch (IOException e) 
				{
					
					e.printStackTrace();
				}
			
			}
		
		}
	}

}

