package theVariableArgumentList;

public class TheVariableArgumentList {
	public static void main(String[] args) {
		int maxnum = getMax(10,200,50,10000,6);
		System.out.println(maxnum);
	}
	
	public static int getMax(int ... arr) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

}
