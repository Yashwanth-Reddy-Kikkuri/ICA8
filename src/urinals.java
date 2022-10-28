import java.io.*;
import java.util.*;

public class urinals {
    public static void main(String[] args) throws IOException {

        System.out.println("Select 1 for console input and 2 for file input");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        if (str.equals("1")) {

            while(true) {
                scan = new Scanner(System.in);
                str = scan.nextLine();
                if (str.equals("-1")){
                    break;
                }
                countRemaining cr = new countRemaining();
                int val = cr.countRemaining(str);
                System.out.println(val);

            }
        }


    }
}
