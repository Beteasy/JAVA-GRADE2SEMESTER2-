package ʵ��_Java�߼����.ʵ��5;

public class StrategyOne implements GroupStrategy {
	public void group(int n) {
		System.out.printf("��1-%d����ż���ֳ�����:",n);
		System.out.printf("\nż����:");
		for(int i=1;i<=n;i++){
			if(i%2==0)
				System.out.printf("%4d",i) ;
		}
		System.out.printf("\n������:");
		for(int i=1;i<=n;i++){
			if(i%2==1)
				System.out.printf("%4d",i) ;
		}
		System.out.println();
	}
}
