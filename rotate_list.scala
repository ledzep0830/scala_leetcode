/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def rotateRight(head: ListNode, k: Int): ListNode = {
        if (head == null) 
            return null
        val seq = Seq.unfold(head)({
            case null => None
            case node => Some (node, node.next)
        })
        val degree = k % seq.length
        val (seq1, seq2) = seq.splitAt(seq.length - degree )
        (seq1.headOption, seq2.headOption) match {
            case (Some (head1), Some (head2)) => {
                seq1.last.next = null
                seq2.last.next = head1
                head2
            }
            case (_, _) => head
        }
    }
}
