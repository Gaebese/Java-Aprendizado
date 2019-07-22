package calq.pakage.ca;

public class Game_engine {
	String nome;
	int dano;
	int especial;
	int vida;
	String escolha5;
	String escolha6;
	int n1;
	int vida1;
	int vida2;
	public Game_engine(){}
public Game_engine(String nome,int dano,int especial,int vida){
	this.nome=nome;
	this.dano=dano;
	this.especial=especial;
	this.vida=vida;
}
int metodoEscolha(int escolha,int escolha2){
	switch(escolha){

	case 1:
		Game_engine PersonagemLaufs=new Game_engine("Laufs",500,600,1000);
 	System.out.println("Nome:"+ PersonagemLaufs.nome);
 	System.out.println("Dano:"+PersonagemLaufs.dano);
 	System.out.println("Especial:"+PersonagemLaufs.especial);
 	System.out.println("Vida:"+PersonagemLaufs.vida+"\n VS");
 	escolha5="Laufs";
 	this.vida1=1000;
	break;
	case 2:
		Game_engine PersonagemRoxe=new Game_engine("Roxe",400,600,1400);
	 	System.out.println("Nome:"+PersonagemRoxe.nome);
	 	System.out.println("Dano:"+PersonagemRoxe.dano);
	 	System.out.println("Especial:"+PersonagemRoxe.especial);
	 	System.out.println("Vida:"+PersonagemRoxe.vida+"\n VS");
	 	escolha5="Roxe";	 	
this.vida1=1400; 					
break;
	case 3:
		Game_engine PersonagemFolk=new Game_engine("Folk",300,600,1100);
	 	System.out.println("Nome:"+PersonagemFolk.nome);
	 	System.out.println("Dano:"+PersonagemFolk.dano);
	 	System.out.println("Especial:"+PersonagemFolk.especial);
	 	System.out.println("Vida:"+PersonagemFolk.vida+"\n VS");
	 	escolha5="Folk";
	 	this.vida1=1100;
		break;

default:
	System.out.println("Numero Inválido");
	break;
}

	
	 switch(escolha2){

	 	case 1:
	 		Game_engine PersonagemLaufs=new Game_engine("Laufs",500,600,1000);
	 	 	System.out.println("Nome:"+ PersonagemLaufs.nome);
	 	 	System.out.println("Dano:"+PersonagemLaufs.dano);
	 	 	System.out.println("Especial:"+PersonagemLaufs.especial);
	 	 	System.out.println("Vida:"+PersonagemLaufs.vida+"\n VS");	
	 	 	escolha6="Laufs";
	 	 	n1++;
	 	 	this.vida2=1000;
	 	 	break;
	 	case 2:
			Game_engine PersonagemRoxe=new Game_engine("Roxe",400,600,1400);
		 	System.out.println("Nome:"+PersonagemRoxe.nome);
		 	System.out.println("Dano:"+PersonagemRoxe.dano);
		 	System.out.println("Especial:"+PersonagemRoxe.especial);
		 	System.out.println("Vida:"+PersonagemRoxe.vida+"\n");
	 	 	escolha6="Roxe";
	 	 	n1++;
	 	 	this.vida2=1400;
	  					break;
	 	case 3:
			Game_engine PersonagemFolk=new Game_engine("Folk",300,600,1100);
		 	System.out.println("Nome:"+PersonagemFolk.nome);
		 	System.out.println("Dano:"+PersonagemFolk.dano);
		 	System.out.println("Especial:"+PersonagemFolk.especial);
		 	System.out.println("Vida:"+PersonagemFolk.vida+"\n");
	 	 	escolha6="Folk";
	 	 	n1++;
	 	 	this.vida2=1100;
	 		break;
	 default:
	 	System.out.println("Numero Inválido");
	 	break;
	 }	  
	return escolha+escolha2;
}

}
