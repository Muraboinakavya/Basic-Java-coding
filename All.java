import java.util.Scanner;
public class All{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scanner.nextLine();
        int uppercase = 0 ;
        int lowercase=0;
        int Digit = 0; 
        int Special = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                uppercase++;

            }
            else if(Character.isLowerCase(ch)){
                lowercase++;
            }
            else if(Character.isDigit(ch)){
                Digit++;
            }
            else{
                Special++;
            }


            }
            System.out.println("The upper case letters are : "+uppercase);
            System.out.println("The lowercase letters are : " +lowercase);
            System.out.println("The Digit letters are : "+Digit);
            System.out.println("The special letters are : "+Special);
            scanner.close();
        }

    }
    

