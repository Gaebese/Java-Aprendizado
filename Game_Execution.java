package calq.pakage.ca;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Game_Execution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	
		Game_engine Jogo=new Game_engine();
	System.out.println("Bem vindo ao game\n Escolha seu personagem\n1-Laufs\n2-Roxe\n3-Folk");
	Scanner s= new Scanner(System.in);
System.out.println("Agora escolha seu adversario\n1-Laufs\n2-Roxe\n3-Folk");
Scanner s2= new Scanner(System.in);
int escolha=s.nextInt();
int escolha2=s2.nextInt();
Jogo.metodoEscolha(escolha,escolha2);
 	if (Jogo.n1==1){
		System.out.println("OK! Para iniciar o jogo digite INICIAR");
	Scanner sd=new Scanner(System.in);
	String sds=sd.nextLine();
 	
		if("INICIAR".equalsIgnoreCase(sds)){
			System.out.print(Jogo.escolha5+" VS "+Jogo.escolha6);
			while(Jogo.vida1>0){
				
				Scanner s1=new Scanner(System.in);
				
			}
 	}
	
		else{
			System.out.println("Comando INICIAR não reconhecido.Obs:Escreva do mesmo modo que está escrito");
		}
 	}
}

}
