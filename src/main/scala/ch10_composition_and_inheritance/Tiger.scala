package ch10_composition_and_inheritance

class Tiger(override val dangerous: Boolean,
            private var age: Int) extends Cat {
}

/*class Tiger(param1: Boolean, param2: Int) extends Cat{
  override val dangerous: Boolean = param1
  private var age = param2
}*/


