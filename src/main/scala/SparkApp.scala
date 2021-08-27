import org.apache.spark.sql._

object SparkApp {

  val spark = SparkSession
    .builder()
    .appName("helloWorld")
    .master("local[*]")
    .getOrCreate()
  val sc = spark.sparkContext

  val sourceFeedDF = spark.read
    .option("inferSchema", "true")
    .json("src/main/resources/feeds_show.json")

  def main(args: Array[String]): Unit = {
    Thread.sleep(1000000)
  }
}
