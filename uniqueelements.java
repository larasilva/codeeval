import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            String[] split = line.split(",");
            System.out.print(split[0]);
            for (int i = 1; i<split.length; i++){
                if (!split[i].equals(split[i-1])){
                    System.out.print(","+split[i]);
                }
            }
            System.out.println();      
        }
    }
}
