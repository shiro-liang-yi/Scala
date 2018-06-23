package study02

/*
class Student(id:Int, name:String){
  var age:Int = 0
  def showDetails(){
    println(id+" "+name+" "+age)
  }
  def this(id:Int, name:String,age:Int){
    this(id,name)       // Calling primary constructor, and it is first line
    this.age = age
  }
}

object Demo{
  def main(args:Array[String]){
    var s = new Student(1010,"Maxsu", 25);
    s.showDetails()
  }
}
*/


class Student(id:Int){
  def this(id:Int, name:String)={
    this(id)
    println(id+" "+name)
  }
  println(id)
}

object Demo{
  def main(args:Array[String]){
    new Student(101)
    new Student(100,"Minsu")
  }
}
