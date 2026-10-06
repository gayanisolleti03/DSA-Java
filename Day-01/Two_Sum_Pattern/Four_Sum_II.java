package Two_Sum_Pattern;
import java.util.*;
public class Four_Sum_II {
    public static int fourSum(int[] nums1,int[] nums2,int[] nums3,int[] nums4){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a: nums1)
        {
            for(int b: nums2){
                int sum=a+b;
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        int count=0;
        for(int c: nums3){
            for(int d: nums4)
            {
                int sum=c+d;
                int complement= -sum;
                count+=map.getOrDefault(complement, 0);
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums1={1,2};
        int[] nums2={-2,-1};
        int[] nums3={-1,2};
        int[] nums4={0,2};
        int result=fourSum(nums1,nums2,nums3,nums4);
        System.out.println("No.of valid tuples: "+result);
    }
    
}
