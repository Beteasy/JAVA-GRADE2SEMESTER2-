package shiyan5;

public class Machine{
	public void checkBag(Goods goods) throws DangerException{ //�˴������׳��쳣
		if(!goods.getIsDanger()) {
			throw new DangerException("����Σ��Ʒ!");
		}
		else {
			System.out.println(goods.getName()+","+"���ͨ��\n");
		}
	}
}
