package 实验2;

//User.java
public class User {
	public static void main(String args[]) {
		int b[] ={1,2,3,4,5,6,7,8};	//CD对象的初始数据内容
		
		//创建CD类对象
	    CD dataCD = new CD();	      
	    dataCD.setSize(b.length);
	    dataCD.setContent(b);
	    
	    int a[]=dataCD.getContent();
	    System.out.println("dataCD上的内容：");
	    for(int i=0;i<a.length;i++)
	    	System.out.printf("%3d",a[i]); 
	    System.out.println();
	    
	    
	    Computer computerIMB = new Computer();
	    
	    //computerIMB调用putCD(CD cd)方法,将dataCD的引用传递给cd
	    System.out.println("\n将dataCD的数据复制到计算机:computerIMB.");
	    computerIMB.putCD(dataCD);
	      
	    //computerIMB调用copyToComputer()方法
	    computerIMB.copyToComputer();
	    System.out.println("computerIMB上的内容：");
	    computerIMB.showData();
	    
	    //修改computerIMB的数据，并将修改后的数据复制到dataCD
	    int m=12; 
	    System.out.println("\ncomputerIMB将每个数据增加"+m+"；");
	    computerIMB.addData(m);
	    System.out.println("数据修改后，computerIMB上的内容：");
	    computerIMB.showData();
	    System.out.println();
	    
	    System.out.println("\ncomputerIMB将增值后的数据复制到CD:dataCD");	    
	    computerIMB.copyToCD();	//computerIMB调用copyToCD()方法
	    System.out.println("dataCD上的内容：");
	    a=dataCD.getContent();
	    for(int i=0;i<a.length;i++){
	    	System.out.printf("%3d",a[i]); 
	    }
	}
}
