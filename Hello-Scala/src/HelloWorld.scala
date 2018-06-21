object HelloWorld {
//object将告诉scala编译器这是一个单例对象,因此scala将确保只有一个HelloWorld实例存在
  def main(args: Array[String]): Unit = { //这里main方法没有被定义为static静态方法，事实上，scala完全避开使用static
    //如果应用程序需要同时具有某个类型的实例和某种全局实例,则scala应用程序将允许以相同的名字同时定义class和object
    //scala语言中，整个语言都是用name : type的这种格式
    System.out.print("Hello World")
  }
}
