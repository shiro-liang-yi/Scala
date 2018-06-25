package study03;
import Array._;

object 二维数组 {

  def main(args : Array[String]) : Unit = {
    var myMatrix = ofDim[Int](3,3);
    //创建矩阵
    for(i <- 0 to 2){
      for(j <- 0 to 2){
        myMatrix(i)(j) = j;
      }
    }
    //打印二维矩阵
    for(i <- 0 to 2){
      for(j <- 0 to 2){
        print(myMatrix(i)(j) + "  ");
      }
      println();
    }
  }
}
