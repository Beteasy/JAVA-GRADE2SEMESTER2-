package 面向对象程序设计.实验4.接口;

public class School implements CompurerAverage {
	
	public double average(double[] x) {
		double sum=0.0;
		for(double d:x) {
			sum += d;
		}
		
		return sum/x.length;
	}	   
}

