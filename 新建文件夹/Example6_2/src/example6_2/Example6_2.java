package example6_2;

public class Example6_2 {
	public static void main(String[] args) {
		Speak speak = new Speak() {
			public void speakHello() {
				System.out.println("��Һã�ף��ҹ���˳��");
			}
		};
		
		speak.speakHello();
		
		Student stu = new Student();
		stu.f(new Speak() {
			public void speakHello() {
				System.out.println("i am a studnt");
			}
		});
	}

}


abstract class Speak{
	public abstract void speakHello();
}

class Student{
	void f(Speak sp) {
		sp.speakHello();
	}
}