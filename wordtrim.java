//import java.util.Arrays;
import java.util.Scanner;
public class wordtrim {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String name = scanner.nextLine();
        String word = name.split("//s+");
        String sentence = StringBulider(word).reverse().toString();
        System.out.println(Arrays.toString(sentence));
    }
    
}
