import java.io.*;
class File1{
	public static void main(String args[]){
		File myFile = new File("Example.txt");
		if(myFile.exists()){
			System.out.println("File Exists"+myFile.getName());
		}
		else{
			System.out.println("File doesn't exist");
		}
	}
}
