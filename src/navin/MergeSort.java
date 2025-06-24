package navin;

public class MergeSort {

    public static void mergeSort(int[] nums,int l,int r)
    {
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(nums,l,mid);
            mergeSort(nums,mid+1,r);

            merge(nums,l,mid,r);
        }
    }

    private  static void merge(int[] nums,int l,int mid,int r)
    {
         int n1 = mid-l+1;
         int n2 = r - mid;

         int[] lArr = new int[n1];
         int[] rArr = new int[n2];

         for (int i =0 ; i<lArr.length;i++)
         {
             lArr[i]=nums[l+i];
         }
         for (int i=0 ; i<rArr.length;i++)
         {
             rArr[i]=nums[mid+1+i];
         }

         int i=0;
         int j=0;
         int k=l;

         while(i<n1 && j<n2)
         {
             if(lArr[i]<=rArr[j])
             {
                 nums[k] = lArr[i];
                 i++;
             }
             else {
                 nums[k]=rArr[j];
                 j++;
             }
             k++;
         }
         while(i<n1)
         {
             nums[k]=lArr[i];
             i++;
             k++;
         }
         while(j<n2)
         {
             nums[k]=rArr[j];
             j++;
             k++;
         }

    }

    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,2,1};
        mergeSort(nums,0,nums.length-1);
        for (int n: nums)
        {
            System.out.print(n+" ");
        }
    }
}
