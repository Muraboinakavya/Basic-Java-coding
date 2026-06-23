import java.util.Scanner;
public class Index {
    public static void main(String[]args){
       // int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String word = scanner.nextLine();
        int target = (word.indexOf("l"));
        int count =0;
        for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);
          // int target = (word.indexOf("t"));
           if(word.charAt(i)==target){
    count++;
        }
    }
        //int target = (word.indexOf("t"));
       // count++;
        System.out.println(word.length());
        System.out.println("The character is :" + target);
        System.out.println(count);
        scanner.close();
    
    
}
}
