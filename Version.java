import  java.util.*;
public class Version {
    

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int first=0,second=0;
        // String version1="4.0.1";
        // String version2="4.0";
        //  String version1="4.0.0.0";
        // String version2="4.1";
        //  String version1="1.9.15.23";
        // String version2="1.9.15";
        String version1,version2;
        version1 =sc.nextLine();
        version2=sc.nextLine();
        boolean isequals=true;
        boolean nothingwentinside=true;
        while(first<version1.length() && second<version2.length())
        {
            int firstnumber = getNumber(first,version1);
            int secondnumber = getNumber(second,version2);

            first=getindex(first,version1);
            second=getindex(second,version2);
            if(secondnumber>firstnumber)
            {
                System.out.println("Upgraded");
                isequals=false;
                nothingwentinside=false;
                break;
            }
            else if(firstnumber>secondnumber)
            {
                System.out.println("Downgraded");
                nothingwentinside=false;
                isequals=false;
                break;
            }
            
        }
        if(nothingwentinside){
        if( first<version1.length())
        {
            boolean allzero=true;
           while(first<version1.length())
           {
                int number =getNumber(first,version1);

                if(number!=0)
                allzero=false;

                first=getindex(first,version1);
           }
            if(!allzero)
            {
            isequals=false;
            System.out.println("downgraded");
            }
        }
    }



        if(isequals)
        System.out.println("Equal");

    }

    private static int getindex(int first, String version1) {
       
        while(first<version1.length() && version1.charAt(first)!='.')
        first++;

        return first+1;
    }

    private static int getNumber(int index, String version) {
       
        int number=0;
        while(index<version.length() && version.charAt(index)!='.')
        {
            number=number*10+version.charAt(index)-'0';
            index++;
        }

        return number;
    }
}
