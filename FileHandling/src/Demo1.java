import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//1) Write a program that reads a text file line by line and counts the
// number of lines in the file
public class Demo1 {
    public static void main(String[] args) throws IOException {

        //reading a file
        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        String line="";
        int count=0;
        while((line = reader.readLine())!=null)
        {
            System.out.println(line);
            count++;
        }
        System.out.println("Number of line " + count);
        reader.close();
    }
}
