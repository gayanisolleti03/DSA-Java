import java.util.*;
public class BestTimetoBuyandSell_Stocks{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int minPrice=arr[0];
        int maxPrice=0;
        for(int i=0;i<n;i++)
        {
            if(minPrice>arr[i])
            {
                minPrice=arr[i];
            }
            int profit=arr[i]-minPrice;
            if(profit>maxPrice){
                maxPrice=profit;
            } 
        }
        System.out.println(maxPrice);
        sc.close();
    }
}