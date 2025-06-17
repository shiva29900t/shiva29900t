import java.io.*;
class fileDemo{
	public static void main(String [] args)
	{
		try
		{
			BufferedWriter writer= new BufferedWriter(new FileWriter("student.txt"));
			writer.write("prasanna \nprasanth \npraveen");
            writer.close();
			BufferedReader reader= new BufferedReader(new FileReader("student.txt"));
			String line;
			System.out.println("Student Names:");
			while((line=reader.readLine())!=null)
			{
				System.out.println(line);
			}
			reader.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}

