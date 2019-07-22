package calq.pakage.ca;

public class Matematicabiqtest {
public Matematicabiqtest(int a,int b,int c){
	int b2=b;
	System.out.print(a+"y.y+"+b+"y+"+c+"\n");
	System.out.print("b2-4.a.c\n"+b2*b2+"-"+4+"."+a+"."+c+"\n");
	System.out.println(b2*b2+"-"+4*a*c+"\n");
	int delta=(b2*b2)-(4*a*c);
	System.out.println(delta);
	if(delta>0){
		Matematicabiq das=new Matematicabiq();
		System.out.println("-b±rdelta\n2.a");
		System.out.println(-b2+"±"+"RAIZ"+delta+"\n"+"2."+a);
		System.out.println(-b2+"±"+"RAIZ"+delta+"\n"+2*a);
		System.out.println(-b2+"±"+das.Pell(delta)+"\n"+2*a);
		int pell=das.Pell(delta);
		System.out.println(-b2+"+"+das.Pell(delta)+"="+(-b2+pell)+"/"+2*a+"="+(-b2+pell)/2*a+"\n"+2*a);
	    int final1=(-b2+pell)/2*a;
	    int final2=(-b2-pell)/2*a;
		int finall=das.Final(final1,final2);
System.out.println(-b2+"-"+das.Pell(delta)+"="+(-b2-pell)+"/"+2*a+"="+(-b2-pell)/2*a+"\n"+2*a);
	System.out.println(finall);
	}
	if (delta<0){
		System.out.println("&");
	}
	

}
}

