package main.scala

import java.time.{LocalDate, LocalDateTime}

object Timer1 {

    def oncePerSecond(callback:() => Unit): Unit ={//这个函数oncePerSecond的参数是另一个函数callback，callback函数是没有参数的，也是没有返回值的
      while(true){
        callback();
        Thread.sleep(1000);
      }
    }

  def main(args: Array[String]): Unit = {
    oncePerSecond(() =>
      Console.println("Time flies... oh, you get the idea."+ LocalDateTime.now()) //这里相当于是一个匿名函数s
    )
  }
}
