import java.util.*;

class MathTwoString
{
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String [] args)
    {
        String s="aaaa";
        String value = "dog cat cat dog";
        String[] store= value.split(" ");

        HashMap<Character,String>operation = new HashMap<>();
        HashMap<String,Character>operationstring = new HashMap<>();


        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(operation.containsKey(c))
            {

                String innerString  = operation.get(c); //cat
                if(!innerString.equals(store[i])) // cat cat
                {
                    System.out.println(innerString+ " first False "+store[i]);
                    break;
                }

                char innercc = operationstring.get(store[i]);
                if(innercc !=c)
                {
                    System.out.println("second false");
                    break;
                }

            }
            else if(operationstring.containsKey(c))
            {
                System.out.println(" third False");
                break;
            }
            else
            {
                operation.put(c,store[i]);
                operationstring.put(store[i],c);
            }
        }

        System.out.print("true");
    }
}