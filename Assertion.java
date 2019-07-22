package erros.java.xti;

import java.util.Scanner;

public class Assertion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("n de 1  a 10");
int n=s.nextInt();
assert(n<=0&&n>=10):"invalido";
	}

}
