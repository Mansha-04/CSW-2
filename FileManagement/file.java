import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.Scanner;
public class filehandling {
	static File myfile=new File("my.txt");
	public static void createAndWrite() {
		if(myfile.exists()) {
			System.out.println(myfile.getName()+" already exists");		
		}
		else {
			try {
				myfile.createNewFile();
				System.out.println(myfile.getName()+" created");
			}
			catch(IOException e) {
				System.err.println(e);
			}
		}
		try {
			FileWriter wri=new FileWriter(myfile);
			wri.write("hello this is file handling\n");
			wri.write("UHV ganda hai faltu\n");
			wri.close();
			System.out.println("data written successfully");
		}
		catch(IOException e) {
			System.err.println(e);
		}
		
	}
	public static void read() {
		try {
			FileReader reader=new FileReader(myfile);
			Scanner sc=new Scanner(reader);
			while(sc.hasNextLine()) {
				String line=sc.nextLine();
				System.out.println(line);
			}
			reader.close();
			sc.close();
			System.out.println("data read successfully");
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	public static void append() {
		try {
			FileWriter writer=new FileWriter(myfile,true);
			writer.write("CSW is ok :)");
			writer.close();
			System.out.println("data appended successfully");
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	public static void delete() {
		if(!myfile.exists()) {
			System.out.println("file doesnt exist");
			return;
		}		
		if(myfile.delete()) {
			System.out.println(myfile.getName()+" deleted successfully");
		}
		else {
			System.out.println("error deleting");
		}
	}
	public static void listAndDirectories() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter directory path:");
		String direcPath=sc.nextLine();
		File my=new File(direcPath);
		if(!my.exists()|| !my.isDirectory()) {
			System.out.println("directory does not exist or not in direcotry");
			return;
		}
		System.out.println("listing files and directories");
		String[] filelist=my.list();
		if(filelist!=null) {
			for(String file:filelist) {
				System.out.println(file);
			}

		}
		sc.close();
	}
	public static void filterAndListTxtFile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter directory path to filter");
		String direcPath=sc.nextLine();
		File myfile=new File(direcPath);
		if(!myfile.exists()||!myfile.isDirectory()) {
			System.out.println("directory doest not exist or not in directory");
			return;

		}
		System.out.println("listing .txt files: ");
		File[] files=myfile.listFiles();
		if(files!=null) {
			for(File file:files) {
				System.out.println(file.getName());
			}
		}
	}
	public static void copy() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter source file path: ");
		String sourcepath=sc.nextLine();
		System.out.println("enter destination file path: ");
		String destPath=sc.nextLine();
		
		Path source=Paths.get(sourcepath);
		Path destination=Paths.get(destPath);
		
		try {
			if(Files.exists(destination)) {
				System.out.println("destination file already exists Overwrite?(y/n)");
				String ans=sc.nextLine();
				if(!ans.equalsIgnoreCase("y")){
					System.out.println("copying cancelled");
					return;
				}
				
			}
			Files.copy(source, destination,StandardCopyOption.REPLACE_EXISTING);
			System.out.println("file copied ");
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	public static void rename() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter new name");
		String newName=sc.nextLine();
		File newFile=new File(newName);
		if(!myfile.exists()) {
			System.out.println("file doesnt exist");
			return;
		}
		if(myfile.renameTo(newFile)) {
			System.out.println("file renamed successfully");
		}
		else {
			System.out.println("file couldnt be renamed");
		}
	}
	public static void displaymetadata() {
		if(!myfile.exists()) {
			System.out.println("files doesnt exist");
			return;
		}
		System.out.println("file metadata: ");
		System.out.println("size: "+myfile.length()+" bytes");
		System.out.println("last modified: "+new Date(myfile.lastModified()));
	}
	public static void recursivedirectorylisting() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter directory path: ");
		String direcPath=sc.nextLine();
		File myfile=new File(direcPath);
		if(!myfile.exists()||!myfile.isDirectory()) {
			System.out.println("directory doesnt exist or not in directory");
			return;
		}
		System.out.println("recursive:");
		listDirectory(myfile,0);
	}
	private static void listDirectory(File myfile,int level) {
		if(!myfile.isDirectory()) {
			return;
		}
		File[] files=myfile.listFiles();
		if(files!=null) {
			for(File file:files) {
				for(int i=0;i<level;i++) {
					System.out.print(" ");				
				}
				System.out.println(myfile.getName());
				if(myfile.isDirectory()) {
					listDirectory(file,level+1);
				}
			}
		}
	}
	public static void main(String[] args) {
		while(true) {
			System.out.println("1 create&write 2 read 3 append 4 listdirec 5 filterlisttxtfile 6 delete 7 copy 8 rename 9 metadata 10 recursive directory listing");
			Scanner sc=new Scanner (System.in);
			System.out.println("enter choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				createAndWrite();
				break;
			case 2:
				read();
				break;
			case 3:
				append();
				break;
			case 4:
				listAndDirectories();
				break;
			case 5:
				filterAndListTxtFile();
				break;
			case 6:
				delete();
				break;
			case 7:
				copy();
				break;
			case 8:
				rename();
				break;
			case 9:
				displaymetadata();
				break;
			case 10:
				recursivedirectorylisting();
				break;
			case 11:
				System.exit(0);
			default:
				System.out.println("invalid choice");
			}

		}
	}

}
