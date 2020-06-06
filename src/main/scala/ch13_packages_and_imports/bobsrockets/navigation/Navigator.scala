package ch13_packages_and_imports.bobsrockets

package navigation {

  private[bobsrockets] class Navigator {
    protected[navigation] def useStarChart(): Unit = {}

    class LegOfJourney {
      private[Navigator] val distance = 100
    }

    private[this] var speed = 200
  }

}
