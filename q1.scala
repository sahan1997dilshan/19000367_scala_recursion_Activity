//19000367
object q1
{
 import scala.io.StdIn.readInt
 
 
 def GCD(a:Int,b:Int):Int=b match{
      case 0=>a
      case b if b>a=>GCD(b,a)
      case _ =>GCD(b,a%b)
      }
 
  def CheckPrime(p:Int,n:Int=2):Boolean= n match{
      case n if(n==p)=>true
      case n if GCD(p,n)>1 =>false
      case n=> CheckPrime(p,n+1)
      }
  
  def main (args:Array[String])
  {  println("enter number");
   var num=readInt();
     if( CheckPrime(num))
       println("true")
     else
       println("flase")}

}