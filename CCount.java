public class CCount {
    public static void main(String[]args){
        int count = 0;
        String str ="BhArgavi";
       // char letter = 'A';
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch ='A'==str){
                count++;
            }
            

        }
        System.out.println("THe Letter repated times are : " +count);
    

    }
    
}
