import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

/**
 * Java IO File and Path Operations
 * */
public class File_Class {

	public static void main(String[] args) throws IOException {
	/*	Scanner mys = new Scanner(System.in);
		System.out.println("enter file or directory name:");
		analyzePath(mys.nextLine());*/
		
		
		/*for(String des : f.list()){
			System.out.println(des);
		}*/
		
		/*Scanner mys = new Scanner(System.in);
		System.out.println("enter file or directory name:");
		String input = mys.nextLine();
		File f = new File("C:\\Users\\Samsuddin\\Desktop\\"+input);
		System.out.println(f.exists());*/
		
		/*File f = new File("C:\\Users\\Samsuddin\\Desktop\\");
		for (String s : f.list()){
			System.out.println(s);
		}*/
		
	}
	/*public static void analyzePath(String path){
		//String path1= "C:\\Users\\Samsuddin\\Desktop";
		File name = new File("C:\\Users\\Samsuddin\\Desktop\\");
		if(name.exists()){
			System.out.println(name.getName());
			System.out.println("absolute: "+name.isAbsolute());
			System.out.println("directory: "+name.isDirectory());
			System.out.println("File: "+name.isFile());
			System.out.println("list:"+name.list());
		}
		
		if(name.isDirectory()){
			String[] directory = name.list();	
			System.out.println( "\n\nDirectory contents:\n" );
			for ( String directoryName : directory )
				System.out.println( directoryName );
		
	
		}
	}*/
}
