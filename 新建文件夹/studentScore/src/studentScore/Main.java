package studentScore;

public class Main {
	public static void main(String[] args) {
		//�����ɼ���¼����
		Record[] rs = new Record[3];

		//����������¼����
		rs[0]= new Record("1000","�ŷ�",60,70);
		
		rs[1] = new Record("1001","����",30,80);
		
		rs[2] = new Record("1002","����",80,50);

		//rs[2].total(80,50);
		//����һ���ɼ������
		Table table = new Table("�ɼ���",rs);
				
				
		//���ܳɼ�
		double avg  = table.totalAvg();
		System.out.println("��ƽ���ɼ���:" + avg);
	}

}
