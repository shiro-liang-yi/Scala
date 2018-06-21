package main.scala

import java.time.LocalDateTime

object Timer1{

  def periodCall(seconds:Int,callback: () => Unit):Unit = {
    while(true){
      callback();
      Thread.sleep(seconds * 1000);
    }
  }

  def main(args : Array[String]) : Unit = {
    periodCall(1,() =>
      Console.println("Time flies... oh, you get the idea." + "  ----   "+LocalDateTime.now())
    );
  }
}
