package Array_1.left;

public class right rotate an array by k positions {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums,0,n-1);//REVESE THE WHOLE ARRAY
        reverse(nums,0,k-1);//REVERSE THE ELEMENTS 1 TO K
        reverse(nums,k,n-1);//REVERSE THE ELEMENTS K TO LENGTH
    }
    public static void reverse(int[] nums, int start, int end)
    {
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
