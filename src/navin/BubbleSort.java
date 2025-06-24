package navin;

//O n^2
public class BubbleSort {
    static int steps=0;
    public static void main(String[] args) {
        int[] nums = {8,6,9,2,4,5,3};

        System.out.println("Before Sorting");
        for(int n: nums)
        {
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("After Sorting");
        for (int n: bubbleSort(nums))
        {
            System.out.print(n+" ");
        }
        System.out.println("Steps: "+steps);
    }
    public static int[] bubbleSort(int[] nums)
    {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                steps++;
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
}
