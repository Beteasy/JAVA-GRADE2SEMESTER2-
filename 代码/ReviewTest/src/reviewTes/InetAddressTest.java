package reviewTes;

import java.net.*;
public class InetAddressTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			System.out.println(inetAddress.toString());
			System.out.println(inetAddress.getHostName().toString());
			System.out.println(inetAddress.getHostAddress().toString());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
