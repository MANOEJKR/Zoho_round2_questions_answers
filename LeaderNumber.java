import java.util.ArrayList;
import java.util.List;

class LeaderNumber
{

    public static void main(String[] args) {
       // write a program to print all the leaders in the array .An element is leader if it is 
       //greater than all the element to its right side .And the right most side is always a
     // leader input1: Arr[] = {7,8,3,4,6,2} output: 8 6 2  
     //inout 2 : Arr[] = {5,5,3,2,1} output : 5 3 2 1

        int[] arr = {7,8,3,4,6,2};
        int n = arr.length;
        List<Integer>ans = new ArrayList<>();
        int currentMax= Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--)
        {
            if(i==n-1)
            {
                ans.add(arr[i]);
                currentMax=arr[i];  
                continue;
            }
//ans: 2 6 8

            //6>2 4>6 3>6 8>6 7>8
            if(arr[i]>currentMax)
            {
                ans.add(arr[i]);
                currentMax=arr[i]; // 8
            }
        }

        for(int i=ans.size()-1;i>=0;i--)
        System.out.print(ans.get(i)+" ");
        
    }
}