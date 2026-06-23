import java.util.Scanner;
public class Vowels {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int vowels = 0;
        int consonants = 0;
      System.out.println("Enter the  String");
        String name = scanner.nextLine();
        for(int i = 0 ;i<name.length(); i++){ 
            char ch = name.charAt(i);
            if(ch >='a' && ch <= 'z'){
            if(ch =='a'||ch =='e'||ch =='i'||ch =='u'|| ch == 'o'){
                vowels++;
            }

            }
        
        else{
            consonants++;
            
        }

     }
      System.out.println("The length of the given String is : " + name.length());
        System.out.println("The vowels are :  " + vowels);
        System.out.println("The consonants are :  " + consonants);
        scanner.close();

    
    }
}
