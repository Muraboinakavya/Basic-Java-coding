import java.util.Scanner;
public class count {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String  sentence = scanner.nextLine();
        //for(int i = 0;i<sentence.length();i++){
            //char ch = sentence.charAt(i);
             String kavya= sentence.trim();
        
            String []name = kavya.split("\\s+");
             int word = name.length;
             System.out.println(word);
            scanner.close();

        }
    }



    

    

