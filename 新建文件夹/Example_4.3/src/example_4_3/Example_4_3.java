package example_4_3;

public class Example_4_3 {
	public static void main(String[] args) {
		XiyoujiRenwu zhubajie = new XiyoujiRenwu();
		XiyoujiRenwu sunwukong = new XiyoujiRenwu();
		zhubajie.name = PersonName.八戒;
		zhubajie.height = 1.83f;
		zhubajie.weight = 86f;
		zhubajie.head = "猪头";
		sunwukong.name = PersonName.悟空;
		sunwukong.height = 1.66f;
		sunwukong.weight = 1000f;
		sunwukong.head = "猴头";
		zhubajie.speak(zhubajie.name+"我想娶媳妇");
		System.out.println(zhubajie.name+"现在的头"+zhubajie.head);
		sunwukong.speak(sunwukong.name+"我重"+sunwukong.weight+"公斤,想骗八戒背我");
		System.out.println(sunwukong.name+"现在的头"+sunwukong.head);
	}

}
