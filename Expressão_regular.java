package calq.pakage.ca;

import java.util.Scanner;


public class Expressão_regular {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
String n="(falaebroderblz)(jae entao)";
String fs=n.replaceAll(n,"$1,$2");
System.out.println(fs);
	}

}
