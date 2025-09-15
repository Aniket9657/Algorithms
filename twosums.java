class twosums
 {
    public static void main(String[]args)
    {
        int arr [] ={0,2,2,7,9} ;
        int target = 4;

        ts(arr,target);
    }


    public static int[] ts(int [] arr,int target)
    {
        int [] fsum;
        for (int i =0; i<arr.length-1;i++)
        {
            for (int j =i++;j<arr.length-1;j++)
            {
                int sum =i+j;
                if (sum == target)
                {
                    fsum = {i,j};
                    
                }
                 return fsum;
               
            }
            
        }
    }

}