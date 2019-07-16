package example4_8;

public class Lader {
	double upLader;	//实例变量
	double height;	//类变量
	static double downLader;
	void setUpLaderr(double a) {
		upLader = a;
	}
	
	void setDownLader(double b) {
		downLader = b;
	}

	double getUpLader() {
		return upLader;
	}
	
	double getDownLader() {
		return downLader;
	}
}
