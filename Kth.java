import java.util.Arrays;
class Kth 
{
    public static void main (String[] args )
    {
        int[] arr={34,5,4,2,-1,45,};
        int N=kthsmallest(arr,3);
        System.out.println(N);


    }


         public static int kthsmallest(int arr[],int k)
         {
            Arrays.sort(arr);
            return arr[k-1];
         }
}