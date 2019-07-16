package 实验_Java高级编程.实验5;

public class StrategyOne implements GroupStrategy {
	public void group(int n) {
		System.out.printf("将1-%d按奇偶数分成两组:",n);
		System.out.printf("\n偶数组:");
		for(int i=1;i<=n;i++){
			if(i%2==0)
				System.out.printf("%4d",i) ;
		}
		System.out.printf("\n奇数组:");
		for(int i=1;i<=n;i++){
			if(i%2==1)
				System.out.printf("%4d",i) ;
		}
		System.out.println();
	}
}
