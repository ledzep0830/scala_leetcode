object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
  
        val count_tracker = scala.collection.mutable.HashMap[Int, Int]()

    for (i <- nums.indices) {
      val differrence = target - nums(i)
	  
      if (count_tracker.contains(differrence)) 
        return Array(count_tracker(differrence), i)
     else
        count_tracker.put(nums(i), i)
    }
	//count_tracker.toArray.map ( _._2 )  OR
	//count_tracker.values.toArray        OR
	  count_tracker.toArray.map { case (_, y) => y }

    }
}
