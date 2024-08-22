import java.io.*;

//Write a program that reads user input from the console
// and appends it to an existing text file.
public class Demo3 {

    public static void main(String[] args) throws IOException {

        //read input from console
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        System.out.println("Type some text ");
        String read = reader.readLine();
        reader.close();

        //append in existing file
        //true represent that data is append in file not overwrite
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt",true));
        writer.write(read);
        writer.newLine();
        System.out.println("appending text is completed");
        writer.close();


    }

}
