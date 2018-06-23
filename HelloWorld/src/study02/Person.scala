package study02

class Person(fn: String, ln: String, s: Person){
  val firstname = fn
  val lastname = ln
  var suporse = s

  println("primary constructor")

  def this(fn : String, ln : String)  {
    this(fn, ln, null)
  }

  println("I am testing code")

  def introduction() : String =  {
    return "我的名字是, " + lastname + " " + firstname +
      (if (suporse != null) {
        " 对方的名字是, " + suporse.lastname + " " + suporse.firstname + "。"
      }else {
        "。";
      })
  }
}

