package shiyan5;

public class Machine{
	public void checkBag(Goods goods) throws DangerException{ //此处忘记抛出异常
		if(!goods.getIsDanger()) {
			throw new DangerException("属于危险品!");
		}
		else {
			System.out.println(goods.getName()+","+"检查通过\n");
		}
	}
}
