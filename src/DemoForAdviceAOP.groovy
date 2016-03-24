
class Person {

  def run(int vv)
  {
    println 'you r my'+vv
  }

}
def sam = new Person()
println 'before'
sam.metaClass.invokeMethod= { String name, args ->
  println 'before'


  def method = Person.metaClass.getMetaMethod('run', 10)
   method.invoke(delegate,10)

}

sam.runop(10)