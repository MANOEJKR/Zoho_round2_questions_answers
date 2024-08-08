 
import java.util.*;
class Questions
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    //    String question ="He did  tesrt a good deed . teet";
    //    String question ="Malayalam is my mother tongue ";
        System.out.println("Enter string");
        String question=sc.nextLine();

        String current="";
        String ans="";
        for(int i=0;i<question.length();i++)
        {
             
            if(question.charAt(i)!=' ')
            current+=question.charAt(i);
            else
            {
                if(checkPalindrome(current)==false)
                {
                    ans+=current+" ";
                }
                current="";
            }
        }
        

        System.out.println(ans);


    }

    public static boolean checkPalindrome(String current)
    {
        int start=0,end=current.length()-1;

        while(start<=end)
        {
            char first = current.charAt(start);

            if(first>='A' && first<='Z')
            first =(char)(first+32);

            char second = current.charAt(end);
            if(second>='A' && second<='Z')
            second =  (char)(second+32);
            
            if(first!=second)
            return false;

            start++;
            end--;
        }
        return true;
    }

}