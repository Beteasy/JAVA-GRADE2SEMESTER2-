package no8;

import java.io.*;
import java.util.*;

public class Registration {
	String regex1 = "[a-zA-Z]+";
	String regex2 = "[0-9]+";
	String userName;
	String password;
	String str;
	Scanner readUserName = new Scanner(System.in);
	Scanner readPassword = new Scanner(System.in);
	
	File userInformation = new File("UserInformation.txt");
	try {
		userInformation.createNewFile();
	}
	catch(IOException e) {}
	
	FileReader freader = new FileReader(userInformation);
	FileWriter fwriter = new FileWriter(userInformation);
	BufferedReader bufreader = new BufferedReader(freader);
	BufferedWriter bufwriter = new BufferedWriter(fwriter);
	bufread
	while()
}