import java.util.Scanner;
public class Palindrome {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String name = scanner.nextLine();
        String Reverse = new StringBuilder(name).reverse().toString();
        //System.out.println(Reverse);
       // String Result = "name.equals(Reverse)";
        //System.out.println(Result);

           if(name.equals(Reverse)){
            System.out.println("THe given string is a palindrome " + Reverse);
           }
           else {
            System.out.println("The given String is not a palidrome " +Reverse);
           }

           scanner.close();

        }
       // else{
          //  System.out.println("The given String is not a pa
    }
    

