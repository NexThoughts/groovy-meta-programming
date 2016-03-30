




Integer.metaClass.isEven = { ->
// only (->) sign indicates that isEven() method is no argument method
  println delegate%2 == 0
}
6.isEven()

7.isEven()
