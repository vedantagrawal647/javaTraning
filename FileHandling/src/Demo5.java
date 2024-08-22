import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//Develop a program that reads a text file and prints the longest word in the file.

public class Demo5 {
    public static void main(String[] args) throws IOException {

        //read data from file
        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        String line = "";
        HashMap<String, Integer> map = new HashMap<>();
        int Maxlength=0;

        while ((line = reader.readLine()) != null) {
            String[] arr = line.split(" ");
            for (String word : arr) {
                int length = map.getOrDefault(word, 0);
                int max = Math.max(length,word.length());
                map.put(word,max);
                Maxlength=Math.max(Maxlength,map.get(word));
            }
        }

        System.out.println("Max length "+Maxlength);

    }
}