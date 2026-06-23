import java.util.Scanner;
public class Space {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a String");
        String sentence = scanner.nextLine();
        System.out.println(sentence.length());
           //sentence=sentence.trim();
        //System.out.println(sentence.length());
        String name = sentence.replaceAll("\\s+","");
        System.out.println("The String is : " +name);
        scanner.close();
    }

    
}
