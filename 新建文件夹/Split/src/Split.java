import java.util.Arrays;

public class Split {
	public static void main(String[] argv) {
		int i;
		String str = "this_is_an_example";
		String str2 = "welcome to  111 China";
		String str3 = "姓名：张三，抓举成绩：106kg，挺举成绩：189kg. ";
		String strArray[];
		String regex = "\\D+";
		
		/*strArray = str.split("_");
		for(i=0; i<strArray.length; i++) {
			System.out.println("the length of the str is:" + strArray[i].length() + "   the str is : " + strArray[i]);
		}
		
		strArray = str2.split(" ");
		for(i=0; i<strArray.length; i++) {
			System.out.println("the length of the str is:" + strArray[i].length() + "   the str is : " + strArray[i]);
		}
		*/
		strArray = str2.split(regex);
		for(i=0; i<strArray.length; i++) {
			//System.out.println("the length of the str is:" + strArray[i].length() + "   the str is : " + strArray[i]);
			//System.out.println(Double.parseDouble(strArray[i]));
			System.out.println(strArray[i]);
		}
	}

}
