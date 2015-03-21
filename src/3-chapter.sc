import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.util.Random

/** #1 */
def createArray(n: Int) : Array[Int] = {
  val foo = for (i <- 1 to n) yield Random.nextInt(n)
  foo.toArray
}

val example = Array(1,2,3,4,5)

/** #2 Array(1,2,3,4,5) -> Array(2,1,4,3,5) */
def swap(in: Array[Int]) : Unit = {
  val indexes = for (i <- 0 to in.length if i % 2 == 0) yield i
//  println(indexes.toString)
  val result = for (index <- indexes) {
    if (index + 1 < in.length) {
      val tmp = in(index)
      in(index) = in(index + 1)
      in(index + 1) = tmp
    }
  }
//  println(result)
  println(in.mkString)
}

/** #4 rearrange(Array(-5,1,0,7,-2,3)) */
def rearrange(in: Array[Int]) : Array[Int] = {
  val foo = in.filter(_ > 0).toBuffer ++= in.filter(_ <= 0)
//  println(foo.mkString)
  foo.toArray
}

/** #5 average of Array[Double] */
def average(in: Array[Double]) : Double = {
  in.sum / in.length
}
average(Array(6,12,32))

/** #6 reverse sort */
def reverseSort(in: ArrayBuffer[Int]) : ArrayBuffer[Int] = {
  in.sorted.reverse
}
val input = ArrayBuffer(2,1,5,9,2)
