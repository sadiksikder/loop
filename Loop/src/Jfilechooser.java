import java.io.File;

import javax.swing.JFileChooser;


public class Jfilechooser {
	//public static final string name;
	
	public static void main(String[] args) {
		// JFileChooser-Objekt erstellen
        JFileChooser jfc = new JFileChooser();
        // Dialog zum Oeffnen von Dateien anzeigen
       
        
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        jfc.showOpenDialog(null);
       
       
      
      analyzePath(jfc.getSelectedFile().getAbsolutePath());
	}
	
	
	
	
	public static void analyzePath(String path){
	//String path1= "C:\\Users\\Samsuddin\\Desktop";
	File name = new File(path);
	if(name.exists()){
		System.out.println(name.getName());
		System.out.println("absolute: "+name.getAbsolutePath());
		System.out.println("directory: "+name.isDirectory());
		System.out.println("File: "+name.isFile());
		System.out.println("list:"+name.list());
	}
	
	if(name.isDirectory()){
		
		System.out.println( "\n\nDirectory contents:\n" );
		for ( String directoryName : name.list() )
			System.out.println( directoryName );
	

	}
}

}
