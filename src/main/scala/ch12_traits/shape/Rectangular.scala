package ch12_traits.shape

trait Rectangular {

  def topLeft: Point

  def bottomRight: Point

  def left: Int = topLeft.x

  def right: Int = bottomRight.x

  def width: Int = right - left

}
