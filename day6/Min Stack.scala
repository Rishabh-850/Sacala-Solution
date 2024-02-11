import scala.collection.mutable.Stack

class MinStack() {

    private val stack: Stack[Int] = Stack()
    private val minStack: Stack[Int] = Stack()

    def push(x: Int) {
        stack.push(x)
        if (minStack.isEmpty || x <= minStack.top) {
            minStack.push(x)
        }
    }

    def pop() {
        if (stack.nonEmpty) {
            val removed = stack.pop()
            if (minStack.nonEmpty && removed == minStack.top) {
                minStack.pop()
            }
        }
    }

    def top(): Int = {
        if (stack.nonEmpty) stack.top else throw new Exception("Stack is empty.")
    }

    def getMin(): Int = {
        if (minStack.nonEmpty) minStack.top else throw new Exception("Stack is empty.")
    }

}
