package genericityInterface;

interface Computer<E, F>{
	void makeChorus(E x, F y);
}

class Chorus<E,F> implements Computer<E,F>{
	public void makeChorus(E x, F y) {
		x.toString();
		y.toString();
	}
}

class Instrument{
	public String toString() {
		System.out.println("我是乐器");
		return "";
	}
}

class Singer{
	public String toString () {
		System.out.println("我是歌手");
		return "";
	}
}

public class Example13_13_2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instrument instrument = new Instrument();
		Singer singer = new Singer();
		
		Chorus<Instrument,Singer> chorus = new Chorus<Instrument,Singer>();
		chorus.makeChorus(instrument, singer);
	}

}
