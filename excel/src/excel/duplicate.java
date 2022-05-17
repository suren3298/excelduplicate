package excel;

import java.io.*;
import java.util.HashSet;
  
public class duplicate
{
    public static void main(String[] args) throws IOException 
    {
        
        PrintWriter pw = new PrintWriter("output.csv");
          
        BufferedReader br = new BufferedReader(new FileReader("temp.csv")); 
        String line = br.readLine();
        HashSet<String> hs = new HashSet<String>(); 
        while(line != null)
        {
              if(hs.add(line))
                pw.println(line);
                line = br.readLine();
              
        }
        pw.flush();   
        br.close();
        pw.close();
        System.out.println("File operation performed successfully");
    }
}