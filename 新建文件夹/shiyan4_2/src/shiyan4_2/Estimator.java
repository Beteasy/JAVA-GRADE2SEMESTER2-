package shiyan4_2;

public class Estimator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double aver_mark;
		double aver_weight;
		SongGame singer = new SongGame();
		School student = new School();
		double[] mark= {9.89,9.88,9.99,9.12,9.69,9.76,8.97};	//���
		double[] weight= {56,55.5,65,50,51.5,53.6,70,49,66,62,46};	//ѧ������
		aver_mark = singer.average(mark);
		aver_weight = student.average(weight);
		System.out.printf("���ֵ�ƽ���ɼ�Ϊ(����С�������λ):%.2f\n",aver_mark);
		System.out.printf("ѧ����ƽ������Ϊ(����С�������λ):%.2f\n",aver_weight);
	}

}
