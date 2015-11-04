
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            String[]words = line.split(" ");
            if (words.length>0){
                String biggestWord = words[0];
                for (int i=1; i<words.length; i++){
                    if (words[i].length()>biggestWord.length()){
                        biggestWord=words[i];
                    }
                }
                System.out.println(biggestWord);
            }
            else{
                System.out.println();
            }
            
        }
    }
}
