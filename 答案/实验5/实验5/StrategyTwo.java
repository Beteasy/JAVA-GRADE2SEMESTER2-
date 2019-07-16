package 实验_Java高级编程.实验5;

public class StrategyTwo implements GroupStrategy {
	public void group(int n) {
		System.out.printf("\n将1-%d用3求余分成三组:",n);
		System.out.printf("\n被3除尽的组:");
		for(int i=1;i<=n;i++){
			if(i%3==0)
				System.out.printf("%4d",i) ;
		}
		
		System.out.printf("\n被3除余1的组:");
		for(int i=1;i<=n;i++){
			if(i%3==1)
				System.out.printf("%4d",i) ;
		}
		
		System.out.printf("\n被3除余2的组:");
		for(int i=1;i<=n;i++){
			if(i%3==2)
				System.out.printf("%4d",i) ;
		}
	}
}
