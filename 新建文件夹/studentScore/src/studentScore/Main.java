package studentScore;

public class Main {
	public static void main(String[] args) {
		//创建成绩记录数组
		Record[] rs = new Record[3];

		//创建三条记录对象
		rs[0]= new Record("1000","张飞",60,70);
		
		rs[1] = new Record("1001","关羽",30,80);
		
		rs[2] = new Record("1002","刘备",80,50);

		//rs[2].total(80,50);
		//创建一个成绩表对象
		Table table = new Table("成绩表",rs);
				
				
		//求总成绩
		double avg  = table.totalAvg();
		System.out.println("总平均成绩是:" + avg);
	}

}
