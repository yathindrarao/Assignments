package week5;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class dispfile{
	public static void main(String []args) throws IOException
	{
	 
		Files.list(Paths.get(".")).forEach(System.out::println);

		File directoryPath = new File("C:\\Users\\adity\\OneDrive\\Desktop\\week3");
	      //List of all files and directories
	      File filesList[] = directoryPath.listFiles();
	      System.out.println("List of files and directories in the specified directory:");
	      for(File file : filesList) {
	         System.out.println("File name: "+file.getName());
	         
	         
		
	}
	}
}

