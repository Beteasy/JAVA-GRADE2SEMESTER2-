package chicken;

public class Chicken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y,z;
		for(x=1; x<100; x++) {
			for(y=1; y<100; y++) {
				for(z=1; z<100; z++) {
					if(x+y+z==100 && 5*x+3*y+z/3==100 && z%3==0) {
						//System.out.println(x+','+y+','+z);
						System.out.printf("%d,%d,%d", x,y,z);
						System.out.println();
					}
				}
			}
		}
	}

}
