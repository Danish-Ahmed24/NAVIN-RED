package navin;

public class SelectionSort {
//O n^2
    public static void main(String[] args) {
        int[] unsorted = {6,5,2,8,9,4};
            System.out.println();
        for (int n: selectionSort(unsorted))
        {
            System.out.print(n+",");
        }
            System.out.println();
    }
    public static int[] selectionSort(int[] unsorted) {
        int size= unsorted.length;

        for (int i = 0; i < size-1 ; i++) {
            int minIndex = i;

            for(int j =i ; j < size ; j++)
            {
                if(unsorted[minIndex] > unsorted[j])
                {
                    minIndex=j;
                }
            }
            if(minIndex!=i)
            {
                int temp = unsorted[minIndex];
                unsorted[minIndex] = unsorted[i];
                unsorted[i]=temp;
            }
            for (int n: unsorted)
            {
                System.out.print(n+" ");
            }
            System.out.println();
        }
        return unsorted;
    }
}

