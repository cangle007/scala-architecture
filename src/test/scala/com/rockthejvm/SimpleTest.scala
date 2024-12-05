package com.rockthejvm

import org.scalatest.funsuite.AnyFunSuite

class SimpleTest extends AnyFunSuite {
  test("simple test possible") {
    assert("Scala".toLowerCase == "scala")
  }  
}
