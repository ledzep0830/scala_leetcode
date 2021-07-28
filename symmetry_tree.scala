/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def isSymmetric(root: TreeNode): Boolean = root match {
        case root if root==null => true
        case root => valueCheck(root.left, root.right)
    }
    def valueCheck(node1: TreeNode, node2: TreeNode): Boolean = (node1, node2) match {
        case (null, null) => true
        case (n1, null) => false
        case (null, n2) => false
        case (n1, n2) => n1.value==n2.value && valueCheck(n1.left, n2.right) && valueCheck(n1.right, n2.left)
    }
}
