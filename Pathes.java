package calq.pakage.ca;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Pathes   {
	
	public static void main(String[] args) throws IOException {
	
FileSystem fs=FileSystems.getDefault();
		for (FileStore fodase:fs.getFileStores()){
			System.out.println("Unidade:"+fodase.toString());
			System.out.println("Espaço "+fodase.getTotalSpace()+" bytes");
			System.out.println("Disponivel "+fodase.getUsableSpace()+" bytes");
			System.out.println("Utilizada "+(fodase.getTotalSpace()-fodase.getUsableSpace()+" bytes"));
		}
}
}

