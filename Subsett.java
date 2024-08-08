import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsett {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        int size=0;
        System.out.println("Enter the size");
        size = sc.nextInt();
        
        int []question = new int[size];
        int sum=0;
        for(int i=0;i<size;i++)
        {
            int number = sc.nextInt();
            question[i]=number;
            sum+=number;
        }

        int totalsubset = (int) Math.pow(2,size);
         for(int i=0;i<totalsubset;i++)
        {
            
            for(int j=0;j<size;j++)
            {
                if((i & (1 << j))>=1)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                    
                }
            }
            System.out.println();
        }



    }
}
