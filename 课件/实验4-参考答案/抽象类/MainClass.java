package 实验4;

public class MainClass{
	
	   public static void main(String args[]) {
	      Geometry[] tuxing=new Geometry[29]; //创建有29个Geometry数组
	      
	      //29个Geometry对象分成两类，创建Geometry数组中的每一个Geometry对象元素
	      for(int i=0;i<tuxing.length;i++) {   
	          if(i%2==0)
	              tuxing[i]=new Rect(16+i,68);
	          else if(i%2==1)
	              tuxing[i]=new Circle(10+i);
	      } 
	      
	      TotalArea areaComputer=new TotalArea(tuxing);	        
	      System.out.printf("各种图形的面积之和:\n%f",areaComputer.computeTotalArea());
	   }
	   
}