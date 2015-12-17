import main.Main
import org.scalatest._

class Test extends FlatSpec with Matchers {

  "class Mains" should "[concatSnake] return *___" in {
    val main = new Main()
    main.concatSnake("a") should be ("a___")
  }

  "Intercept" should "catch NoSuchElementException" in {
    val mv = Map("a" -> "b")
    var flag = false
    intercept[NoSuchElementException] {
      mv("c")
      flag = true
      flag should be (true)
    }
  }
}
