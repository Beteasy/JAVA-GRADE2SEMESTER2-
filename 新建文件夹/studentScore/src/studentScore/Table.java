package studentScore;

public class Table {
	public String name;
	private Record[] records;
	
	public Table(String name, Record[] rs) {
		this.name = name;
		this.records = rs;
	}
	public double totalAvg() {
		Record[] rs = this.records;
		double total = 0;
		for(int i=0; i<rs.length; i++) {
			total += rs[i].total();
		}
		return total/rs.length;
	};
	/*public String[] getStudents() {
		Record[] 
		return 
	};*/

}
