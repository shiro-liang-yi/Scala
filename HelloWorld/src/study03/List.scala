package study03

object List {

  /**
    *注意：虽然可变Set（不重复）和不可变Set都有添加或删除元素的操作，但是有一个非常大的差别，对不可变Set进行操作时，
    * 会产生一个新的Set，原来的Set并没有改变，这与List一样，而对可变Set进行操作时，
    * 改变的是该Set本身，与ListBuffer类似
    */
  def main(args: Array[String]): Unit = {
    val set = Set(9,0,2,3,4,9,1);//默认的Set集合是immutable不可改变的集合，若是要声明可改变的，使用scala.collection.mutable.Set 包
    val mutableSet = scala.collection.mutable.Set('a','3','s','2');
    Console.println(set.getClass.getName);
    Console.println(mutableSet.getClass.getName);
    Console.println(set.exists(_ % 4 == 0));
    Console.println(set.drop(1));//Set(2, 3, 4)
    Console.println(set.head);//head返回集合的第一个元素
    Console.println(mutableSet.head);//head返回集合的第一个元素
    Console.println(set.tail);//tail返回一个集合，包含除了第一个元素之外的其他元素
    Console.println(set.isEmpty);//在集合为空时，返回true
  }
}
