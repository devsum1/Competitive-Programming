package test;
import java.util.*;

class Array{

    public static void main(String  []args )throws Exception{
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int N=60;
        int[] array = new int[N];
        int flag=0;
        for(int j=0;j<N;j++){
            if(j<2){
                flag+=j;
                array[j]=flag;
            }
            else{
                int temp1=(array[j-1]+array[j-2])%10;
                array[j]=temp1;
            }

        }

        for(int i=0;i<T;i++){
          long P = scan.nextLong();
            long temp=1;
            int count=0;
            while(temp<=P){
                temp*=2;
                if(temp<=P){
                    count++;
                }

            }
         
            long number =(long)Math.pow(2,count);
//            System.out.println(number);
            System.out.print(array[(int)(number%60)-1]);


        }
    }


}
//000292
//92399
