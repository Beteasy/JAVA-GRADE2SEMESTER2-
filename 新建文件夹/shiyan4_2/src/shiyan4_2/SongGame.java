package shiyan4_2;

public class SongGame implements AverageComputer{
	double sum=0.0;
	double aver;
	double max;
	double min;
	//����ƽ����
	public double average(double[] x) {
		//���������С���ǵ�һ��
		max = x[0];
		min = x[0];
		
		for(int i=0; i<x.length; i++) {
			sum += x[i];
			if(max<x[i]) {
				max = x[i];		//Ѱ�����ֵ
			}
			if(min>x[i]) {
				min = x[i];		//Ѱ����Сֵ
			}
		}
		aver = (sum-max-min)/(double)(x.length-2);
		return aver;
	}
}
