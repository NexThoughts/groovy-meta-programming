/**
 * Created by chetan on 26/3/16.
 */
Integer.metaClass.isEven = { -> // only (->) sign indicates that isEven() method is no argument method
  println delegate%2 == 0
}

6.isEven()

7.isEven()
