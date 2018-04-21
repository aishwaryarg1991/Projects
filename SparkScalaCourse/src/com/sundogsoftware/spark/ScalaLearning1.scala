package com.sundogsoftware.spark

object ScalaLearning1 {
  
  def main(args: Array[String]) {
    
  //  feb(4) //  febonacci series call
  //  println(takeString("shashank", upCase));
     var listOfNum = List(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
  Listfunc(listOfNum:_*);
  }
  
  
  // febonacci series without recursion 
  	 def feb(a:Int): Unit = {
	    var temp = 0;
	    var temp2 = 1;
  	   for(x <- 0 to a){
  	     println(temp+temp2);
  	     temp = temp2;
  	     temp2 = x;
  	     }  
	    
	 }
  	 
  	 def takeString(a:String, f:String=>String):String ={
  	   f(a);
  	 }
  	 
  	 def upCase(a:String) : String ={
  	   a.toUpperCase();
  	 }
	 
	 def Listfunc(listOfNum:Int*): Unit={
	 
	  
	   for(num <- listOfNum){
	     if(num%3==0)
	     {
	       print(num + " ");
	     }
	   }
	   println("using map");
	   listOfNum.map((num:Int) => {if(num%3==0){  print(num + " ")}});
	    println("using filter 1");
	   println(listOfNum.filter((num:Int) => num%3 ==0));
	    println("using filter 2");
	   println(listOfNum.filter(_%3 ==0));
	 }
	 
}