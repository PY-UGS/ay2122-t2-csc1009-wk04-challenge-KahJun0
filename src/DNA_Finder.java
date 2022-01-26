import java.util.Scanner;
import java.util.regex.*;

public class DNA_Finder {
    public static void main(String[] args) {
        String input_array;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter DNA sequence");
        input_array = input.nextLine();
        Pattern gtc = Pattern.compile("GTC");
        Matcher matcher = gtc.matcher(input_array);
        long count = matcher.results().count();
        System.out.format("Number of GTC sequences is %d.\n", count);
        if (count < 10){
            System.out.println("Patient is at lower risk of infection.");
        }
        else{
            System.out.println("Patient is at higher risk of infection.");
        }
    }
}
