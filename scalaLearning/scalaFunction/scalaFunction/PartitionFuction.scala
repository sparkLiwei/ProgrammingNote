/**
 * Created by Variant on 16/3/17.
 */
object PartitionFuction {
  def main(args: Array[String]) {
    val data = List(1,2,3,4,5,6)
      data.foreach(println)
      data.foreach(x => println )

    def sum(a : Int, b : Int, c :Int) = a + b + c
    println(sum(1,2,3))

    val fp_a=sum _
    println(fp_a(1,2,3))
    println(fp_a.apply(1,_ :Int,3))

    val fp_b = sum(1,_ : Int,3)
    println(fp_b(2))
    print(fp_b(10))

    data.foreach(println _)
    data.foreach(println)
  }
}
