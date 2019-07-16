package shiyan2_2;

public class Computer {
	int[] data;
	CD includeCD;
	
	public void putCD(CD cd) {
		includeCD = cd;
	}
	
	public void copyToComouter() {
		data = new int[includeCD.getSize()];
		includeCD.getContent(data);
	}
	
	public void addData(int m) {
		for(int i=0; i<data.length; i++) {
			data[i] += m;
		}
	}
	
	public void copyToCD() {
		includeCD.setContent(data);
	}
	
	public void showData() {
		for(int i=0; i<data.length; i++) {
			System.out.print(+ data[i]+" ");
		}
	}
}
