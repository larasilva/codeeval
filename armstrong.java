
import java.io.*;
import java.lang.Integer;
import java.lang.Math;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            Integer number = Integer.parseInt(line);
            if (isArmstrong(number, line.length())){
                System.out.println("TRUE");
            }
            else{
                System.out.println("FALSE");
            }
        }
    }
    
    static boolean isArmstrong(int number, int length){
        if (number == 0) return false;
        else{
            int total = 0;
            while (number > 0){
                total += Math.pow(number%10,length);
                total = total/10;
            }
            if (total == number) return true;
            else return false;
        }
    }
}
