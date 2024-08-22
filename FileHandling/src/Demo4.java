
//Write a Java application that reads a text file and counts the occurrences of
// each word, then prints the word frequencies to the console.

import java.io.*;
import java.util.HashMap;

public class Demo4 {
    public static void main(String[] args) throws IOException {

        //read data from file
        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        String line="";
        HashMap<String,Integer> map = new HashMap<>();

        while((line = reader.readLine()) != null)
        {
            String[] arr=line.split(" ");
            for(String word:arr)
            {
                map.put(word,map.getOrDefault(word,0)+1);
            }
        }

        for (String word : map.keySet())
        {
            System.out.println("word "+word +" frequency " + map.get(word));
        }

    }
}
