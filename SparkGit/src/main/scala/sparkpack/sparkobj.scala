package sparkpack

import org.apache.spark._
import org.apache.spark.sql.Row
import org.apache.spark.sql.SparkSession


object sparkobj {
  
  def main(args:Array[String]):Unit={ 
    
    val conf = new SparkConf().setAppName("ES").setMaster("local[*]")
					val sc = new SparkContext(conf)
					sc.setLogLevel("ERROR") 
				
		val spark=SparkSession.builder().getOrCreate()
		import spark.implicits._
		
		
		
  
}
}