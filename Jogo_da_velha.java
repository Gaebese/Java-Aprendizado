package calq.pakage.ca;

import java.util.Scanner;

public class Jogo_da_velha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String i="|1|2|3\n|4|5|6\n|7|8|9";
	Scanner s2=new Scanner(System.in);
	Scanner s=new Scanner(System.in);

int is=0;
while(is<=9){
	System.out.println("escolha o lugar apetando de 1 a 9\n |1 |2 |3\n |4 |5 |6\n |7 |8 |9");
	String se=s.next();
	System.out.println(se+" escolhido!\n |1 |2 |3\n |4 |5 |6\n |7 |8 |9");
	String fase=String.valueOf(se);
	System.out.println("qal voce escolhe? X ou O");
	String sa=String.valueOf(s2);
	String f=s2.next();
	String fasz=i.replace(fase,f);
	System.out.println(fasz);
	
is++;
}

}
}