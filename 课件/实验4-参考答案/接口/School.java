package �������������.ʵ��4.�ӿ�;

public class School implements CompurerAverage {
	
	public double average(double[] x) {
		double sum=0.0;
		for(double d:x) {
			sum += d;
		}
		
		return sum/x.length;
	}	   
}

