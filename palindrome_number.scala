object Solution {
    def reverse(x: Int, result: Int): Int = {if (x==0) result else reverse(x/10, result*10 + x%10)}
    def isPalindrome(x: Int): Boolean = {if (x<0) false else x==reverse(x,0)}
}
