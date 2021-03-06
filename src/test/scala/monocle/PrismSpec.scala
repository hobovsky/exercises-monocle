/*
 *  scala-exercises - exercises-monocle
 *  Copyright (C) 2015-2019 47 Degrees, LLC. <http://www.47deg.com>
 *
 */

package monoclelib

import PrismHelper.{JNum, JStr}
import org.scalaexercises.Test
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.scalacheck.Checkers

import org.scalacheck.ScalacheckShapeless._
import shapeless.HNil

class PrismSpec extends AnyFunSuite with Checkers {

  test("exercise get option apply") {
    check(
      Test.testSuccess(
        PrismExercises.exerciseGetOptionAndApply _,
        JStr("hello") :: Option("Hello") :: Option.empty[String] :: HNil
      )
    )
  }

  test("exercise set and modify") {
    check(
      Test.testSuccess(
        PrismExercises.exerciseSetAndModify _,
        JStr("Bar") :: JStr("olleH") :: HNil
      )
    )
  }

  test("exercise set and modify 2") {
    check(
      Test.testSuccess(
        PrismExercises.exerciseSetAndModify2 _,
        JNum(10) :: JNum(10) :: HNil
      )
    )
  }

  test("exercise modifyOption") {
    check(
      Test.testSuccess(
        PrismExercises.exerciseModifyOption _,
        Option(JStr("olleH")) :: Option.empty[JNum] :: HNil
      )
    )
  }

  test("exercise compose") {
    check(
      Test.testSuccess(
        PrismExercises.exerciseCompose _,
        JNum(5.0) :: Option(5) :: Option.empty[Int] :: Option.empty[String] :: HNil
      )
    )
  }

  test("exercise prism generation") {
    check(
      Test.testSuccess(
        PrismExercises.exercisePrismGeneration _,
        Option(JNum(4.5)) :: Option.empty[JNum] :: HNil
      )
    )
  }

  test("exercise laws") {
    check(
      Test.testSuccess(
        PrismExercises.exerciseLaws _,
        true :: true :: HNil
      )
    )
  }
}
