object q4
//19000367
{
 import scala.io.StdIn.readInt
  
 def digitaleven(n:Int):Boolean =n match {
   case 0=>true
   case 1=>false
   case _ =>digitaleven(n-2)

}
  
  
  def main(args:Array[String])
  {println("Enter y number")
    var num=readInt()
    if(digitaleven(num))
      println("even")
      
     else
       println("odd")
    
  }


}