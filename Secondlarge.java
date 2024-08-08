class Secondlarge
{

    public static void main(String[] args) {
        
        //Given an array of N integers.Find the second largest element in an array without 
        //sorting an array  input: [1,7,3,6,5] output : 6 Input:[6,5,1,8,7,8] Output: 7

            int []que ={7,1,3,6,5};
        int firstmax = Integer.MIN_VALUE; 
        int secondmax = Integer.MIN_VALUE;

        for(int i=0;i<que.length;i++)
        {
            if(firstmax<que[i])
            {
                secondmax=firstmax;
                firstmax=que[i];
            }

            if(secondmax<que[i] && que[i]<firstmax)
            {
                secondmax=que[i];
            }
        }

        System.out.println("second max :" + secondmax);

    }
}