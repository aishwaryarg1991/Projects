package com.sundogsoftware.spark

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._

object LearningScala {
  
    def main(args: Array[String]) {
      
  val hello: String = "Holaaaa!"
  val pi1 : Float = 3.142142f  ;println(f"The pi value doubled Like ${2* pi1}%.3f") 
   
    //fib2(10)                 //fib series
    println(take("Aigvygsh",foo)) // functions as arguments
    val num=List(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
     div(num:_*);
    
    }
    
    
 //fib series     
    def fib2( n : Int ) : Unit = {
      var a = 1
      var b = 1
      var i = 0	  
     
      while( i < n ) {
        val c = a + b
         print(a)
        a = b
        b = c
        i = i + 1  
  } 
 
}
 
    
 // functions as arguments
def take(x: String, f: String => String) : String = {
  	f(x)
  }

 def foo(str1:String) : String = {
  str1.toUpperCase();
  }
 
 
  //check divsion
 def div(numList: Int*) : Unit= {

       for ( i <- numList){
           if (i%3==0){
             print(i+" ")
           }
           
          
       }
 }
 
  
 
// val divbythree = numList.filter( (x: Int) => x%3= 0)
}






