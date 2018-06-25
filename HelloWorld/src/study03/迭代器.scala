package study03

object 迭代器 {

  def main(args: Array[String]): Unit = {

    /**
      * 迭代器不是一个集合，他是一种用于访问集合的方法
      * 迭代器的两个基本操作是next和hasNext
      * 让迭代器it逐个返回所有元素最简单的方法是使用while循环
      */
    val it = Iterator(3,2,7,5,0,8);
    while(it.hasNext){
      println(it.next());
    }
  }
}
