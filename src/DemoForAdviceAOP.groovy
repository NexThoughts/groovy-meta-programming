class Person {

  def runMe(int number) {
    println 'run with me ' + number
  }

}

def sam = new Person()
println 'before'
sam.metaClass.invokeMethod = { String name, args ->
  println 'before'

//intercepting the invoke method
  def method = Person.metaClass.getMetaMethod(name, args)
  method.invoke(delegate, args)
  println 'after'
}

sam.runMe(10)