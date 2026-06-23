import java.util.Scanner;
import java.util.Arrays;
public class Anagrams {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String1");
        String str1 = scanner.nextLine();
        System.out.println("Enter the String2");
        String str2 = scanner.nextLine();
        str1 = str1.replaceAll("\\s+","").toLowerCase();
        str2 = str2.replaceAll("\\s+","").toLowerCase();

        char[] array1 = str1.toCharArray(); 
        char[] array2 = str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        if(Arrays.equals(array1,array2)){

         System.out.println("The given Strings are Anagrams");
        }
        else{
            System.out.println("The given Strings are not Anagrams");
        }
        scanner.close();

         }
    
    }
    

