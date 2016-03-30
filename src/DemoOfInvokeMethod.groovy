
class Hello {

  def sayHi(String name)
  {
    println 'Hello '+ name
  }

}


Hello.metaClass.invokeMethod= { String methodName, args ->
  println 'before'
  println "Invoking method ${methodName} with args"

  def method = Hello.metaClass.getMetaMethod(methodName,args)
   method?.invoke(delegate,args)
  println 'after'

}
def sam = new Hello()
sam.sayHi("chetan")
sam.anotherMethod()
