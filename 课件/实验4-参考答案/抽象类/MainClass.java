package ʵ��4;

public class MainClass{
	
	   public static void main(String args[]) {
	      Geometry[] tuxing=new Geometry[29]; //������29��Geometry����
	      
	      //29��Geometry����ֳ����࣬����Geometry�����е�ÿһ��Geometry����Ԫ��
	      for(int i=0;i<tuxing.length;i++) {   
	          if(i%2==0)
	              tuxing[i]=new Rect(16+i,68);
	          else if(i%2==1)
	              tuxing[i]=new Circle(10+i);
	      } 
	      
	      TotalArea areaComputer=new TotalArea(tuxing);	        
	      System.out.printf("����ͼ�ε����֮��:\n%f",areaComputer.computeTotalArea());
	   }
	   
}