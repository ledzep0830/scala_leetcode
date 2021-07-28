object Solution {
   def searchInsert(nums: Array[Int], target: Int): Int = {
    def binarySearch(start: Int, end:Int): Int = {
      val middle = (start + end)/2
      if(start > end) start
      else if(target == nums(middle)) middle 
      else if(target > nums(middle)) binarySearch(middle+1, end)
      else binarySearch(start, middle-1)
    }
    binarySearch(0, nums.length-1)
  }
}
