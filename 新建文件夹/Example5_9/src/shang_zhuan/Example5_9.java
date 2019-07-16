package shang_zhuan;

public class Example5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People people = new People();
		Anthropoid monkey = people;		//monkey是people对象的上转型对象
		monkey.crySpeak("I love this game!");		//等同于people调用重写的crySpeak方法
		//monkey.n = 100;		//非法，因为n是子类新增的成员变量，上转过程中丢失
		//monkey.compuer(12,19);		//非法，因为computer()是子类新增的方法，上转过程中丢失
		System.out.println(monkey.m);	//操作被子类隐藏的m，不等同于people.m
		System.out.println(people.m);	//操作子类的m
		People zhang  = (People)monkey;		//把上转型对象强制转化为子类的对象
		zhang.computer(55, 33);
		zhang.m = 'T';		//操作子类声明的成员变量m
		System.out.println(zhang.m);
	}

}
