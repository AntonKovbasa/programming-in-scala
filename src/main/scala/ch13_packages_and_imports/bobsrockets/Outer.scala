package ch13_packages_and_imports.bobsrockets

class Outer {

  class Inner {
    private def f() = {
      println("f")
    }

    class InnerMost {
      f() // OK
    }

  }

  //(new Inner).f() // error: f is not accessible
}
