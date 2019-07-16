package shiyan2;

public class Computer {
	int[] data;
	CD includeCD;
	
	public void putCD(CD cd) {
		includeCD = cd;
		int size = cd.getSize();
		data = new int[size];
	}
	
	public void copyToComputer() {
		data = includeCD.getContent();
		/*int[] b = includeCD.getContent();
		int min=Math.min(data.length, b.length);
		 for(int i=0; i<min; i++) {
			 data[i] = b[i];
		 }*/
		/*for(int i=0; i<includeCD.getSize(); i++) {
			data[i] = includeCD.content[i];
		}*/
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
		for(int i:data) {
			System.out.print(i+" ");
		}
	}
	
}
