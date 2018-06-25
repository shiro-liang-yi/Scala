package study03

object 数组 {

  /**
    * scala中的数组是用来存储固定大小的同类型元素
    * 声明数组变量并不是声明number0、number1、。。。、number99一个个单独的变量
    * 而是声明一个就像numbers这样的变量，然后使用numbers[0]等来表示一个个单独的变量
    * 数组中某个指定的元素是通过索引来访问的
    * 数组的第一个元素索引为0，最后一个元素的索引为元素总数减1
    */
  def main(args: Array[String]): Unit = {

    //声明了一个字符串类型的数组，长度为3，可存储3个元素，我们可以为灭个元素设置值
    var z:Array[String] = new Array[String](3);
    var myList = Array(1.9, 2.9, 3.4, 3.5)
    //var z = new Array[String](3);
    z(0) = "baidu"; z(1) = "google"; z(4/2) = "alibaba";
    //var z = Array("baidu","google","alibaba");
    // 输出所有数组元素
    /*for ( x <- z ) {//这个符号是将z中所有的元素赋予x
      println( x )
    }*/
    //计算数组所有元素的总和
    var total = 0.0;
    for(i <- 0 to (myList.length -1)){
        total += myList(i);
        print(myList(i)+"  ");
    }

    println("数组总和为 "+ total);
    //查找数组中的最大元素
    var max = myList(0);
    for(i <- 0 to (myList.length - 1)){
      if(myList(i) > max)
        max = myList(i);
    }
    print("最大值为  "+ max);
  }
}
