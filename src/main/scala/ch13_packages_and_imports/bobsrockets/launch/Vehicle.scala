package ch13_packages_and_imports.bobsrockets

package launch {

  import ch13_packages_and_imports.bobsrockets.navigation._

  object Vehicle {
    private[launch] val guide = new Navigator
  }

}
