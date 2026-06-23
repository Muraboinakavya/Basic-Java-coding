import java.util.Scanner;
public class Reverse {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String name = scanner.nextLine();
        String Reverse = new StringBuilder(name).reverse().toString();
        System.out.println(Reverse.trim());
        scanner.close();

    }

    
}
