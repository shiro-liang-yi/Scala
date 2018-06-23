package study02

class Employee{
  var salary:Float = 11100
}

class Programmer extends Employee{
  var bonus:Int = 5100
  println("Salary = "+salary)
  println("Bonus = "+bonus)
}

object Demo3{
  def main(args:Array[String]){
    new Programmer()
  }
}

