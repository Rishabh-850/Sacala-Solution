class NestedIterator(_nestedList: List[NestedInteger]) {
    var arr = Array[Int]()
    var index = 0
 
    def initialize(list: Array[NestedInteger], curr: Int = 0): Unit = {
        if(curr == list.size) return
 
        if(list(curr).isInteger) {
            arr :+= list(curr).getInteger
        }else {
            initialize(list(curr).getList, 0)
        }
 
        initialize(list, curr + 1)
    }
 
    initialize(_nestedList.toArray)
    def next(): Int = {
        index += 1
        arr(index-1)
    }
    
    def hasNext(): Boolean = {
        index < arr.length
    }
}
