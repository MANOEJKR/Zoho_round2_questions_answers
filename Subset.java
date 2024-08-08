import java.util.*;

public class Subset {
    
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=0;
        System.out.println("Enter the size");
        size = sc.nextInt();
        int []question = new int[size];

        for(int i=0;i<size;i++)
        {
            int number = sc.nextInt();
            question[i]=number;
        }

         
        int totalsubset = (int) Math.pow(2,size);
        System.out.println(totalsubset);
        for(int i=0;i<totalsubset;i++)
        {
            int firstsum=0,secondsum=0;
            List<Integer>firstlist= new ArrayList<>();
            List<Integer>secondlist = new ArrayList<>();

            for(int j=0;j<size;j++)
            {
                if((i & (1 << j))>=1)
                {
                    
                    firstsum+=question[j];
                    firstlist.add(question[j]);
                }
                else
                {
                   
                    secondsum+=question[j];
                    secondlist.add(question[j]);
                }
            }
                    boolean isequal=false;
                    
                    
                if(firstsum == secondsum)
                {
                    System.out.println("Fist array");
                    for(int z=0;z<firstlist.size();z++)
                    {
                        System.out.print(firstlist.get(z)+" ");
                    }
                    System.out.println();
                    System.out.println("Second array");
                    for(int y=0;y<secondlist.size();y++)
                    {
                        System.out.print(secondlist.get(y)+" ");
                    }
                    isequal=true;
                    break;
                }
                if(isequal==true)
                break;
            
            


        }



    }
    }

