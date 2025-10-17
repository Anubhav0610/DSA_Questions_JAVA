package Array_1;

public class Running_sum_of_1d_Array {
    public int[] runningSum(int[] nums) {
        int s=0;
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            s=s+nums[i];
            a[i]=s;
        }
        return a;
    }

}
