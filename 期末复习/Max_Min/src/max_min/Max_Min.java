package max_min;

public class Max_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cha;
		double[] array = {1,3,5,6,8,10};
		cha = range(array);
		System.out.println(cha);
	}
	
	static double range(double[] x) {
		double max = x[0];
		double min = x[0];
		for(int i=0; i<x.length; i++) {
			if(min > x[i]) {
				min = x[i];
			}
			if(max < x[i]) {
				max = x[i];
			}
		}
		return max-min;
	}

}
