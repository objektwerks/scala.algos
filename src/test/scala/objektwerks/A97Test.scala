package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

/**
  * Find the unpaired number in a list of T.
  */
object A97:
  def findUnpairedItem[T](list: List[T]): Option[T] =
    list
      .view
      .foldLeft[Set[T]](Set.empty) {
        case (set, t) if set.contains(t) => set - t
        case (set, t) => set + t
      }
      .headOption

import A97.*

final class A97Test extends AnyFunSuite with Matchers:
  test("find unpaired item"):
    findUnpairedItem(List(1, 2, 1)).get shouldBe 2
    findUnpairedItem(List(1, 2, 1, 1, 1)).get shouldBe 2
    findUnpairedItem(List(1, 1, 1, 1, 1)).get shouldBe 1
    findUnpairedItem(List(1, 1, 1, 1)).isEmpty shouldBe true
    findUnpairedItem(List(1, 2, 3, 1, 2)).get shouldBe 3
    findUnpairedItem(List(1, 2, 3, 3, 1, 2)).isEmpty shouldBe true