package ch13_packages_and_imports.bobsrockets.p {

  class Super {
    protected def f() = {
      println("f")
    }
  }

  class Sub extends Super {
    f()
  }

  class Other {
    //(new Super).f() // error: f is not accessible
  }

}
