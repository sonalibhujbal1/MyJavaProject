import java.util.Scanner;
public class scanner {
    public static void main(String args[])   {
        int a,b,ans;
        System.out.println("Enter an First number:");
        Scanner ob = new Scanner(System.in);
        a = ob.nextInt();
        ans=a*a;
        System.out.println("Square =");
         System.out.println(ans);

         int c,fact;
         fact=1;
         for(c=1;c<=a;c++)
         {
             fact=fact*c;
         }
        System.out.println("factorial ="+fact);


        System.out.println("Enter an Fibbonaci series  number:");
          a = ob.nextInt();
         int num1,num2,ans1;
         num1=0;
         num2=1;
         for(int i=0;i<=a;i++)
         {
             ans1=num1+num2;
             System.out.println("print the no:"+num1);
             num1=num2;
             num2=ans1;
         }


        System.out.println("Enter an Fibbonaci series  number:");
        a = ob.nextInt();
        num1=0;
        num2=1;
        int j=0;
        do
        {
            ans1=num1+num2;
            System.out.println("print the no:"+num1);
            num1=num2;
            num2=ans1;
            j++;
        }while(j<=a);

    }

}
