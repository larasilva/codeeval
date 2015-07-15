import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            String [] spliced = line.split(",");
            String regex = "["+spliced[1].trim()+"]";
            System.out.println(spliced[0].replaceAll(regex, ""));
            
        }
    }  
}
