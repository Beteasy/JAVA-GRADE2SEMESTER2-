package shiyan2_2;

import java.util.Scanner;
public class CD {
	int[] content;
	int size;
	
	CD(){
		size = 8;
		content = new int[size];
		for(int i=0; i<size; i++) {
			content[i] = i+1;
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public void getContent(int[] content_computer) {
		for(int i=0; i<content.length; i++) {
			content_computer[i] = content[i];
		}
	}
	
	public void setContent(int[] b) {
		for(int i=0; i<b.length; i++) {
			content[i] = b[i];
		}
	}
	
	public void setContent() {
		for(int i=0; i<content.length; i++) {
			Scanner input = new Scanner(System.in);
			content[i] = input.nextInt();
			
		}
		//input.close();
		
	}
	
	
}
