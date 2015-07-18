//Using stacks to solve the Mth to last element problem in Codeeval

import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] split = line.split(" ");
            //extracting the values
            int position = Integer.parseInt(split[split.length - 1]);
            Stack<String> stack = new Stack();
            for (int i = 0; i < split.length - 1; i++) {
                stack.add(split[i]);
            }
            String result = "";
            //popping the values until we get what we need
            if (position <= stack.size()) {
                for (int j = 0; j < position; j++) {
                    result = stack.pop();
                }
                System.out.println(result);
            }
        }
    }
}
