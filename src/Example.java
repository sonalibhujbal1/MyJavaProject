public class Example {
    public static void main(String[] args) {
        for (int j=0; j<=6; j++)
        {
            if (j==4)
            {  	      continue;
            }
            System.out.print(j+" ");
        }

        int aiMyArray[] = new int[6];
        for(int i=0 ; i<aiMyArray.length ; i++) {
            aiMyArray[i]=i+1;
        }
        for(int i=0;i<aiMyArray.length;i++){
            System.out.println(aiMyArray[i]);
        }

    }
}
