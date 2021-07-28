object Solution {
    def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
        val arr = (nums1 ++ nums2).sorted
        val total_length = arr.length
        if(total_length==1) arr(0) 
        else if(total_length%2==0) {
          val midIdx = total_length/2
          (arr(midIdx-1) + arr(midIdx))/2.0
        }
        else arr(total_length/2)
    }
}
