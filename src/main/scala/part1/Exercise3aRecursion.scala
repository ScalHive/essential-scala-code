package part1

object Exercise3aRecursion {
  // Analogue for foreach
  def greetNTimes(name: String, n: Int): Unit = {
    if(n > 0) {
      println(s"Hello $name!")
      greetNTimes(name, n - 1)
    }
  }

  def main(args: Array[String]): Unit = {
    println("greetNTimes")
    println(greetNTimes("world", 5))
    println(greetNTimes("nope", 0))
  }
}