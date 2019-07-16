package handleLargeNumber;



public class HandleLargeNumber {

	public static void main(String[] args) {
		int[] a = {0,9,9,7,9,4,5,6,7,2,3,4,5,6,4,7,8,9,8,7,6,9};
		int[] b = {0,0,5,9,1,6,4,5,6,2,3,4,5,7,2,1,3,4,0,3,2,9};
		int[] c = new int[a.length];
		for(int i=a.length-1; i>=0; i--){
			c[i] += a[i]+b[i];
			if(c[i]>=10){
				int geWei = c[i] % 10;	//取个位放入C[i]
				c[i] = geWei;
				c[i-1] += 1;	//进位到c[i-1]
			}
		}
		for(int j=0; j<a.length; j++)
		{
			int flag = 0;
			if(a[j] != 0) {
				flag = 1;
			}
			if(flag == 1) {
				for(int k=j; k<a.length; k++)
				{
					System.out.print(a[k]);
				}
				break;
			}
		}
		System.out.println("\n加上：");
		for(int j=0; j<b.length; j++)
		{
			int flag = 0;
			if(b[j] != 0) {
				flag = 1;
			}
			if(flag == 1) {
				for(int k=j; k<b.length; k++)
				{
					System.out.print(b[k]);
				}
				break;
			}
		}
		System.out.println("\n等于：");
		for(int j=0; j<c.length; j++)
		{
			int flag = 0;
			if(c[j] != 0) {
				flag = 1;
			}
			if(flag == 1) {
				for(int k=j; k<c.length; k++)
				{
					System.out.print(c[k]);
				}
				break;
			}
		}
	}

}
