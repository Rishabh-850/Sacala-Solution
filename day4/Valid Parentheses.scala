import scala.collection.mutable
object Solution {
    def isValid(s: String): Boolean = {
        val mp = Map('(' -> ')', '[' -> ']', '{' -> '}')
        val stk = mutable.Stack[Char]()
         for (ch <- s) {
         if (mp.contains(ch)) {
            stk.push(ch)
         }
         else {
            if (stk.isEmpty) return false
            if (!mp.get(stk.pop).contains(ch)) return false
        }
     }
     stk.isEmpty
    }
}
