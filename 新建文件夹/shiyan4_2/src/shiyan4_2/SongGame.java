package shiyan4_2;

public class SongGame implements AverageComputer{
	double sum=0.0;
	double aver;
	double max;
	double min;
	//计算平均分
	public double average(double[] x) {
		//假设最大最小都是第一个
		max = x[0];
		min = x[0];
		
		for(int i=0; i<x.length; i++) {
			sum += x[i];
			if(max<x[i]) {
				max = x[i];		//寻找最大值
			}
			if(min>x[i]) {
				min = x[i];		//寻找最小值
			}
		}
		aver = (sum-max-min)/(double)(x.length-2);
		return aver;
	}
}
