package com.sundogsoftware.spark

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._
//import shapeless.Tuples._
//import shapeless.HList._

object ScalaLearning2 {
  
  def main(args: Array[String]) {
    
    Logger.getLogger("org").setLevel(Level.ERROR)
   
     val sc = new SparkContext("local[*]","asa")
    val lines = sc.textFile("c:/SparkScala/fakefriends.csv")
    val age = lines.map(x => x.toString().split(",")(2).toInt)
    val friends = lines.map(x => x.toString().split(",")(3).toInt)
    
    val tup= age zip friends
    
   val ByAge = tup.mapValues(x => (x, 1))
   val totalsByAge=  ByAge.reduceByKey( (x,y) => (x._1 + y._1, x._2 + y._2))
  val averagesByAge = totalsByAge.mapValues(x => x._1 / x._2)
 val results = averagesByAge.collect()
  results.sorted.foreach(println)
    
    
     //results.foreach(println) 
       
      
  
    
  }
	 
}