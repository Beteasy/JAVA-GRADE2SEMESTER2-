package example_4_3;

public class Example_4_3 {
	public static void main(String[] args) {
		XiyoujiRenwu zhubajie = new XiyoujiRenwu();
		XiyoujiRenwu sunwukong = new XiyoujiRenwu();
		zhubajie.name = PersonName.�˽�;
		zhubajie.height = 1.83f;
		zhubajie.weight = 86f;
		zhubajie.head = "��ͷ";
		sunwukong.name = PersonName.���;
		sunwukong.height = 1.66f;
		sunwukong.weight = 1000f;
		sunwukong.head = "��ͷ";
		zhubajie.speak(zhubajie.name+"����Ȣϱ��");
		System.out.println(zhubajie.name+"���ڵ�ͷ"+zhubajie.head);
		sunwukong.speak(sunwukong.name+"����"+sunwukong.weight+"����,��ƭ�˽䱳��");
		System.out.println(sunwukong.name+"���ڵ�ͷ"+sunwukong.head);
	}

}
