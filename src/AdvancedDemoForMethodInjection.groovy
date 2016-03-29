import java.lang.reflect.Method
import java.lang.reflect.Modifier

class Demo
{
  String name
}
Demo demo=new Demo()

demo.metaClass.pay={ println "play"}


demo.pay()

Integer.metaClass.static.isEven = { number ->
  println number%2 == 0
}

Integer.isEven(1) // false



Demo.metaClass.constructor = {String name -> new Demo(name:"Hi "+name) }

Demo demo1 = new Demo('demo')

println demo1.name

