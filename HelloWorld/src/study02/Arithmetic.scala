package study02

  class Arithmetic{
    //在scala中，用参数的不同表示方法的重载
    def add(a:Int, b:Int){
      var sum = a+b
      println(sum)
    }
    def add(a:Int, b:Int, c:Int){
      var sum = a+b+c
      println(sum)
    }
  }

  object Demo2{
    def main(args:Array[String]){
      var a  = new Arithmetic();
      a.add(10,20);
      a.add(10,20,30);
    }
  }