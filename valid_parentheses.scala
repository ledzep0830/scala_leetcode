object Solution {
    import scala.annotation.tailrec
    
    def isValid(s: String): Boolean = {
        @tailrec
        def isValid(str: List[Char], stack: List[Char]): Boolean = {
            (str,stack) match {
                case ('('::leftover, _) => isValid(leftover, ')'::stack)
                case ('{'::leftover, _) => isValid(leftover, '}'::stack)
                case ('['::leftover, _) => isValid(leftover, ']'::stack)
                case (head::leftover, stackHead::stackLeftover) => head==stackHead && isValid(leftover, stackLeftover)
                case _ => str.isEmpty && stack.isEmpty
            }
        }
       isValid(s.toList, Nil)
    }
}
