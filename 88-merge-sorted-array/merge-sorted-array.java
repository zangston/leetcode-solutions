class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        if ( nums1.length == 0 )
        {
            nums1 = nums2;
            return;
        }
        if ( nums2.length == 0 )
            return;

        for ( int i = 0; i < n; i++ )
            nums1[i + m] = nums2[i];

        for ( int i = 0; i < nums1.length - 1; i++ )
        {
            for ( int j = 0; j < nums1.length - i - 1; j++ )
            {
                if( nums1[j] > nums1[j + 1] )
                    swap(nums1, j, j + 1);
            }
        }

        return;
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}