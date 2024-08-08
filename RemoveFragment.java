import java.util.*;

public class RemoveFragment {
    
    public static void main(String[] args) {
        
        // String s1 = "Every morning I want to  do exercise regularly";
        // String s2 = "Every  morning I want to  do meditation without fail";
        // String s3 = "It is important that  I want to be happy always";
        String s1 = "manoj is good boy and good programmer deserve zoho job";
        String s2 = "rahul is bad boy and good programmer deserve zoho job";
        String s3 = "Parthiban is bad boy and bad programmer deserve zoho job";

       // String [] all={question1, question2, question3};

        List<String>list1=seperateWords(s1);
        List<String>questionlist2=seperateWords(s2);
        List<String>questionlist3=seperateWords(s3);

        String framement= commonFragement(list1,questionlist2,questionlist3);

        System.out.println(framement);
        System.out.println(list1);
        String s1removed = RemoveFragment(framement,list1);
        String s2removed = RemoveFragment(framement,questionlist2);
        String s3removed = RemoveFragment(framement,questionlist3);

        System.out.println(s1removed);
        System.out.println(s2removed);
        System.out.println(s3removed);

    }
    private static String RemoveFragment(String framement, List<String> questionlist) {
        
        List<String>word = seperateWords(framement);
        String temp="";
        int i=0;
        while(i<=questionlist.size()-3)
        {
            if(word.get(0).equals(questionlist.get(i)) && word.get(1).equals(questionlist.get(i+1)) && word.get(2).equals(questionlist.get(i+2)))
            {
                i+=3;
                
            }
            else
            {
                temp+=questionlist.get(i)+" ";
                i++;
            }
        }
        while(i<questionlist.size())
        {
            
            temp+=questionlist.get(i)+" ";
            i++;
        }
        return temp;

    }
    private static String commonFragement(List<String> list1, List<String> questionlist2,List<String>questionlist3)
         {  
       // Map<String,Integer>fre = new HashMap<>();
        HashMap<String, Integer> fragmentCount = new HashMap<>();
        for(int i=0;i<=list1.size()-3;i++)
        {
            String temp=list1.get(i)+" "+list1.get(i+1)+" "+list1.get(i+2);
            fragmentCount.put(temp,1);
        }
        
        for(int i=0;i<=questionlist2.size()-3;i++)
        {
            String temp=questionlist2.get(i)+" "+questionlist2.get(i+1)+" "+questionlist2.get(i+2);
            if(fragmentCount.containsKey(temp))
            {
                fragmentCount.put(temp,fragmentCount.get(temp)+1);
            }
        }

        for(int i=0;i<=questionlist3.size()-3;i++)
        {
            String temp=questionlist3.get(i)+" "+questionlist3.get(i+1)+" "+questionlist3.get(i+2);
            if(fragmentCount.containsKey(temp) && fragmentCount.get(temp)>0)
            {
                fragmentCount.put(temp,fragmentCount.get(temp)+1);
            }
        }

        for(Map.Entry<String,Integer> value: fragmentCount.entrySet())
        {
            if(value.getValue() == 3)
            {
                return value.getKey();
            }
        }
        return "";
    }
    

    private static List<String> seperateWords(String question1) {
     
        List<String> words=new ArrayList<String>();
        String temp =""; 
        boolean onetime = false;
        for(int i=0;i<question1.length();i++)
        {
             if(question1.charAt(i)!=' ')
             {
                temp+=question1.charAt(i);
                onetime=true;
             }
             else{
                if(onetime){
                words.add(temp);
                temp="";
                onetime=false;
                }
             }
        }
        words.add(temp);
        return words;
    }
}
