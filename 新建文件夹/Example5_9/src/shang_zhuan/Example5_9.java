package shang_zhuan;

public class Example5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People people = new People();
		Anthropoid monkey = people;		//monkey��people�������ת�Ͷ���
		monkey.crySpeak("I love this game!");		//��ͬ��people������д��crySpeak����
		//monkey.n = 100;		//�Ƿ�����Ϊn�����������ĳ�Ա��������ת�����ж�ʧ
		//monkey.compuer(12,19);		//�Ƿ�����Ϊcomputer()�����������ķ�������ת�����ж�ʧ
		System.out.println(monkey.m);	//�������������ص�m������ͬ��people.m
		System.out.println(people.m);	//���������m
		People zhang  = (People)monkey;		//����ת�Ͷ���ǿ��ת��Ϊ����Ķ���
		zhang.computer(55, 33);
		zhang.m = 'T';		//�������������ĳ�Ա����m
		System.out.println(zhang.m);
	}

}
