package สตั้5;

public class Machine {

	void checkBag(Goods goods) throws DangerException {		
		if(goods.isDanger()){
			throw new DangerException();
		}
	}
	
}

