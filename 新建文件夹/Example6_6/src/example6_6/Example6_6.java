package example6_6;

public class Example6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoBoat ship = new CargoBoat();
		ship.setMaxContent(1000);
		int m = 600;
		try {
			ship.loading(m);	//未超重
			
			m=400;
			ship.loading(m);	//未超重
			
			m=367;
			ship.loading(m);	//超重   从此中断
			
			m=555;
			ship.loading(m); 	//超重  
		}
		catch(DangerException e){
			System.out.println(e.warnMess());
			System.out.println("无法再装载重量是"+m+"吨的集装箱");
		}
		finally {
			System.out.println("货船将正点起航");
		}
	}

}
