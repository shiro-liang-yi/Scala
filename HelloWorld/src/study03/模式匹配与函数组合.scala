package study03

object 模式匹配与函数组合 {

  def main(args: Array[String]): Unit = {


    //1.创建两个函数
    def f(s: String) = "f(" + s + ")";
    def g(s: String) = "g(" + s + ")";
    //用Compose组合其它函数形成一个新的函数f(g(x))
    val fComposeG = f _ compose g _;
    Console.println(fComposeG);
    fComposeG("yay");
    System.out.println(fComposeG.apply(""));//f(g())
    System.out.println(fComposeG.getClass.getName);//f(g())

  }
}
