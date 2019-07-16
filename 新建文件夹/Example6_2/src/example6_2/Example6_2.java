package example6_2;

public class Example6_2 {
	public static void main(String[] args) {
		Speak speak = new Speak() {
			public void speakHello() {
				System.out.println("大家好，祝大家工作顺利");
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