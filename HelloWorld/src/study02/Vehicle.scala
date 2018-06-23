package study02

class Vehicle{
  //final val speed:Int = 60
  val speed:Int = 60
}
class Bike extends Vehicle{
  override val speed:Int = 100
  def show(){
    println(speed)
  }
}

object Demo4{
  def main(args:Array[String]){
    var b = new Bike()
    b.show()
  }
}

