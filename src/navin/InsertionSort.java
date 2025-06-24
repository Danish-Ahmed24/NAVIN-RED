package navin;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        for (int n: insertionSort(nums))
        {
            System.out.print(n+" ");
        }
    }

    public static int[] insertionSort(int[] nums)
    {
        int size = nums.length;
        int j = 0;
        int temp;
        for (int i = 1; i < size ; i++) {
            j= i -1;
            temp = nums[i];
            while( j>=0 && nums[j]>temp)
            {
                nums[j+1]=nums[j];
                    j--;
            }
            nums[j+1] = temp;
        }
        return nums;
    }
}
