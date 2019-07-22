package calq.pakage.ca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class Arquivos {

	public static void main(String[] args) throws IOException {
		Path path=Paths.get("C:/Java Pojeto/files/Contas.txt");

ArrayList<Conta> armazenandoContas=new ArrayList<>();
Charset utf8=StandardCharsets.UTF_8;
try(BufferedWriter b=Files.newBufferedWriter(path,utf8)){
for (Conta conta : armazenandoContas) {
	 b.write(conta.nome+conta.saldo);
}

	}
try(BufferedReader readera=Files.newBufferedReader(path,utf8)){
	String linhas=null;
	while((linhas=readera.readLine())!=null){
	System.out.println(linhas);
	}
}
	}

}
