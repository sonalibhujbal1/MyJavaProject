public class Stringclass {


    public static void main(String[] args) {


         String str1 ="Madam1";
        String str2="";
        // char arr[]=new char[str1.length];
         for(int i=0;i<str1.length();i++)
         {
             str2 = str1.substring(i,i+1) + str2;

         }
        System.out.println("Reverse string: " +str2);

         if(str1.equalsIgnoreCase(str2)) {
             System.out.println(str1 + " Is palindrome");
         }
         else
             System.out.println(str1 + " Is not palindrome");

        System.out.println("convert upper case" +str1.toUpperCase());


         String [] name={"sonali","bhujbal","pragra"};
         for (int j=0;j< name.length;j++)
         {
             System.out.println("print the name: + "+ name[j]);
         }



    }
}
