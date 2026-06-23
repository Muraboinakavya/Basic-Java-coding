import java.util.Scanner;
public class Replace {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String sentence = scanner.nextLine();
        String name = sentence.replaceAll("k","a");
        System.out.println("The  sentence after the replacement is : " +name);
        scanner.close();
    }
    
}
