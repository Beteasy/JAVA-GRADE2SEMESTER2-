
public class ArrayStudent {
	public static void main(String[] argv) {
		int sum = 0;
		int i;
		double average;
		int Student[] = new int[]{80, 100, 95, 72, 66, 59, 43};
		for(i=0; i<Student.length; i++) {
			sum = sum + Student[i];
		}
		for(i=0; i<Student.length; i++) {
			if(Student[i] > 90) {
				System.out.println(Student[i]);
			}
		}
		average = (double)sum / Student.length;
		System.out.println(sum);
		System.out.println(average);
	}

}
