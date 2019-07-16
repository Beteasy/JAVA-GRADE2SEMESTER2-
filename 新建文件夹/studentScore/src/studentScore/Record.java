package studentScore;

public class Record {
	public String no;
	public String name;
	public double yuwen;
	public double shuxue;
	
	public Record(String no, String name, double yuwen, double shuxue) {
		this.no = no;
		this.name = name;
		this.yuwen = yuwen;
		this.shuxue = shuxue;
	}
	
	public double total() {
		return this.yuwen + this.shuxue;
	};
}
