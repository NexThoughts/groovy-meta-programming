import java.lang.reflect.Method
import java.lang.reflect.Modifier

class Demo {
  String name
}

//Adding properties dynamically
Demo demo = new Demo()
demo.metaClass.play = "play"
println "Dynamically added property is " + demo.play



//Adding a static method dynamically
Integer.metaClass.static.isEven = { number ->
  println number % 2 == 0
}
Integer.isEven(1) // false




//Adding a constructor dynamically
Demo.metaClass.constructor = { String name -> new Demo(name: "Hi " + name) }
Demo demo1 = new Demo('demo')
println "Name generated via a modified constructor " + demo1.name

