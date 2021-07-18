object q3
//19000367
{
 import scala.io.StdIn.readInt
  
    def sum(n:Int): Int=
    {
        if(n == 1) 1
        else n +sum(n - 1)
    }
      
    // Main method
    def main(args:Array[String])
    {println("Enter the number");
    var num=readInt()
        println(sum(num))
    }

}