package shiyan5;

public class Machine {
	
	public void checkBag(Goods goods) throws DangerException{
		if(goods.isDanger) {
			throw new DangerException("����Σ��Ʒ!");
		}
	}
}
