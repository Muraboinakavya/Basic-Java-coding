import java.util.Arrays;
import java .util.Scanner;
public class Split {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Sentence without any space in front and back of a word");
        String sc = scanner.nextLine();
        String input = sc.trim().split("//s+");
        int length = input.length();
        System.out.println(Arrays.toString(input));
        System.out.println(length);
        //System.out.println("The numbers of words in a given Sentence is : " + Arrays.toString (sc.split("  ")));
        scanner.close();
    }
}
    

