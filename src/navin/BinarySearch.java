package navin;
//O log(n)
public class BinarySearch {
        static int steps=0,stepsR=0;
    public static void main(String[] args) {
        int []nums ={15,22,33,56,62,74,85,93,99,324,645,2355,34444,554120};
        //           l                r
        int target = 93;
        int x=binarySearchByRecursion(nums,target,0,nums.length-1);
        int x2 = binarySearch(nums,target);
        if(x==-1)
        {
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index: "+x);
            System.out.println("Element found at index: "+x2);
        }
        System.out.println("Steps: "+steps);
        System.out.println("Steps: "+stepsR);
    }
    public static int binarySearch(int[] nums,int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = (left+right)/2;

        while(left <= right)
        {
            steps++;
            if(target==nums[mid])
            {
                return mid;
            } else if (target<nums[mid]) {
                right=mid-1;
            } else if (target>nums[mid]) {
                left=mid+1;
            }
            mid = (left+right)/2;
        }
        return -1;
    }
    public static int binarySearchByRecursion(int[] nums,int target,int l,int r){
        stepsR++;
        int mid = (l+r)/2;
        if(target==nums[mid])
        {
            return mid;
        }
        else if (target<nums[mid])
        {
            return binarySearchByRecursion(nums,target,l,mid-1);
        }
        else if(target> nums[mid]) {
             return binarySearchByRecursion(nums,target,mid+1,r);
        }
        else {
            return -1;
        }
    }
}
