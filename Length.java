import java.util.Scanner;
public class Length {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the Sentence");
        String sc = scanner.nextLine();
        System.out.println(sc.length());
         // int name = sc.length();
          System.out.println("The numbers of characters in input word  : " + sc.length());
          scanner.close();


    }
    
}
