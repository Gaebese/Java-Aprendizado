package calq.pakage.ca;


public class Matematicabiq {
	int Pell(int delta){
	int impa=1;
	int qantidade=0;
	while(delta>=impa) {
	delta-=impa;
    impa+=2;		
    ++qantidade;
	}
	return qantidade;
	}
	int Final(int delta,int delta2){
	    int final1=Pell(delta);
	    int final2=Pell(delta2);
    return final1+0+final2;
	}
	public static void main(String[] args) {
Matematicabiqtest ns=new Matematicabiqtest(1,6,-2);
	
	}
}
	


