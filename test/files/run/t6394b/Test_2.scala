// scalac: -language:experimental.macros
object Test extends App {
  println(Macros.foo)
  override def toString = "TEST"
}
