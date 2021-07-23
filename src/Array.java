import java.util.Scanner;

public class Array {
    public static void main(String[] args) {




        Scanner input= new Scanner(System.in);
       float arr[]=new float[10];
        float sum=0;
        System.out.println("Enter a decimal values");


        for(int i=0;i<arr.length;i++)
        {
           arr[i]=input.nextFloat();

        }
         for(float num : arr)
         {
          sum=sum+num;
         }
        System.out.println("print the sum of all values:" +sum);




        System.out.println("Enter a your name: ");
        char arr1[]={'s','o','n','a','l','i'};

        for (int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }



    }

}
