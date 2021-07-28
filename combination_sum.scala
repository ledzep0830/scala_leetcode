object Solution {
    def combinationSum(candidates: Array[Int], target: Int): List[List[Int]] = {
        combiSum(candidates.toList,target,List(),List())
    }
    def combiSum(candidates:List[Int],target:Int,curList:List[Int],ans:List[List[Int]]) :List[List[Int]] = {
        candidates match{
            case _ if (target < 0) => ans
            case _ if (target == 0) => curList +: ans
            case List() => ans
            case head+:tail => combiSum(candidates,target-head,head+:curList,combiSum(tail,target,curList,ans))
        }
    }
}
