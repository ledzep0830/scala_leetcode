object Solution {
    import scala.annotation.tailrec
    
    def fib(n: Int): Int = {
        @tailrec
        def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int = {
            if(i >= n) last
            else fiboTailrec(i+1, last+nextToLast, last)
        }
        
        if(n<2) n
        else fiboTailrec(2, 1, 1)
    }
}
