// scalac: -unchecked -Xfatal-warnings -language:higherKinds
// no unchecked warnings
class View[C[A]] { }

object Test {
  (null: Any) match {
    case v: View[_] =>
  }
}
