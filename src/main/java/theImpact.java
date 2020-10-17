import java.io.FileWriter;
import java.io.IOException;

public class theImpact {
        public static void main(String[] args) {
            try {
                FileWriter myWriter = new FileWriter("filename.txt");
                myWriter.write("hello");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
