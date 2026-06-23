import java.util.Scanner;
public class trim {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the Sentence");
        String sc = scanner.nextLine();
        int name = sc.length();
        String word = sc.trim();
        System.out.println(word);
          
          System.out.println("The length of the sentence Before Trim :" +name);
          System.out.println("The length of the sentence After Trim : " +word);
          System.out.println(word.length());
          scanner.close();



    
}
}
