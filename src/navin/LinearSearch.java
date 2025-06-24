package navin;
// O(n)
public class LinearSearch {
    public static void main(String[] args) {
        int nums[] ={1,2,3,4,5,6,7,8,10};
        int target = 9;
        int x=linearSearch(nums,target);
        if(x==-1)
        {
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index: "+x);
        }
    }
    public static int linearSearch(int[] nums,int target)
    {
        for(int i =0 ; i < nums.length ; i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
