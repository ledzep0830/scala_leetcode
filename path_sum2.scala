/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def pathSum(root: TreeNode, targetSum: Int): List[List[Int]] = {
        pathSum(root, targetSum, List.empty[Int], List.empty[List[Int]])
    }
    
    def pathSum(node: TreeNode, targetSum: Int, current: List[Int], result: List[List[Int]]): List[List[Int]] = {
        if(node==null)
            return result
        if(node.left==null && node.right==null) {
            if(targetSum==node.value)
                (node.value::current).reverse::result
            else
                result
        }
        else {
            val temp = pathSum(node.left, targetSum-node.value, node.value::current, result)
            pathSum(node.right, targetSum-node.value, node.value::current, temp)
        }
    }
}
