package handleLargeNumber;

public class HandleLargeNumber {
	public static void main(String[] args) {
		int[] a = {0,9,9,7,9,4,5,6,7,2,3,4,5,6,4,7,8,9,8,7,6,9};
	    int[] b = {0,0,5,9,1,6,4,5,6,2,3,4,5,7,2,1,3,4,0,3,2,9};
	    int[] c = new int[a.length];
	    int k=0;
	    int sum=0;
	    
	    for(int i=0; i<a.length; i++) {
	    	if(a[i] != 0) {
	    		k=i;
	    		break;
	    	}
	    }
	    for(int i=k; i<a.length; i++) {
	    	System.out.print(a[i]);
	    }
	    System.out.println();
	    System.out.println("����:");
	    
	    for(int i=a.length-1; i>=0; i--) {
	    	sum = a[i]+b[i];
	    	if(sum>=10) {
	    		c[i] = sum%10;
	    		a[i-1] += 1;
	    	}
	    	else {
	    		c[i] = sum;
	    	}
	    	
	    }
	    
	    
	    for(int i=0; i<b.length; i++) {
	    	if(b[i] != 0) {
	    		k = i;
	    		break;
	    	}
	    }
	    for(int i=k; i<b.length; i++) {
	    	System.out.print(b[i]);
	    }
	    System.out.println("����:");
	    
	    for(int i=0; i<c.length; i++) {
	    	if(c[i] !=0) {
	    		k = i;
	    		break;
	    	}
	    }
	    for(int i=k; i<c.length; i++) {
	    	System.out.print(c[i]);
	    }
	    
	}
	
}
