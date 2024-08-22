import java.io.*;

//Write a Java program that takes user input from the console
// and writes it to a text file.
public class Demo2 {

    public static void main(String[] args) throws IOException {

        //read input from console
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        System.out.println("Enter some text ");
        String read = reader.readLine();
        System.out.println(read);
        reader.close();

        //write in a file
        //data is overwrite in file if file exist or creating new file and add data in it if file not exist
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write(read);
        writer.newLine();
        writer.close();
        System.out.println("write on file completed");

    }
}
