package shiyan4_2;

public class School implements AverageComputer {
	double sum=0;
	double aver;

	@Override
	public double average(double[] x) {
		// TODO Auto-generated method stub
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		aver = sum/(double)x.length;
		return aver;
	}

}
