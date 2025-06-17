import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Scan{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("data.txt"));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
