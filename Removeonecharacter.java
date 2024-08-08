
import java.util.HashMap;
import java.util.Map;

public class Removeonecharacter {
    
    public static void main(String[] args) {
        //check if frequency of all characters in the given the string are equal when you remove exactly one character from the string.
        // example1: input: cdcddca output:true explanation: if "a" is removed, "c and d " will have the same frency of 3
        // example 2: input : aaacbbbc ouput:false  explanation: Frequency of the characters in the given string won't be qual if any 1 char is removed

       //String str = "cdcdcdaa"; // cd cd cd c->3 d->3 a->1
        String str="aaabbbcc"; //a->3 b->3 c->2-> c-1 
        //3 3 2
        //2 3 2
        //
        int count = 0;
        HashMap<Character,Integer>fre = new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            fre.put(str.charAt(i),fre.getOrDefault(str.charAt(i), 0)+1);
        }

        

            //c->3 d->3 a=1
         int frenumber[]= new int[fre.size()];
        int index=0;
         for(int value : fre.values())
         {
            frenumber[index++]=value; // 3,3,1
         }
         //3,3,1
         
        System.out.println(checkTheFrequency(frenumber)==true?"true":"false"); 
        }

    private static boolean  checkTheFrequency(int[]frenumber) {
        //all are equal
        // 1,1,1
        boolean allsame=true;
        for(int i=1;i<frenumber.length;i++)
        {
            if(frenumber[i]!=frenumber[i-1])
            {
                allsame=false;
                break;
            }
        }
        if(allsame)
        return true;

        //3 3 1
        //2 3 1
        //3 2 1
        //3 3 0

        //3 3 2
        //3 3 1
         

        for(int i=0;i<frenumber.length;i++)
        {
            frenumber[i]--;
            boolean allequal=true;
             for(int j=1;j<frenumber.length;j++)
             {

                 if((frenumber[j]!=frenumber[j-1]))
                 {
                        if((frenumber[j]==0 || frenumber[j-1]==0)) // 3,3,0
                        {
                            continue;
                        }
                        else
                        {
                            allequal=false;
                            break;
                        }
                 }
              }
              if(allequal)
              return true;

              frenumber[i]++;
        }
        return false;

    }
}

