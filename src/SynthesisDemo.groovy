
class Boy {

  def activities=[]
  def methodMissing(String name,args)
  {
   if(name.startsWith('play'))
   {
     def activity=name-'play'
     if(activities.contains(activity))
     {

       //to imply caching


       def impl ={
         Object[] theArgs->
           println "I like to play $activity"
       }

       Boy thisBoy=this
       thisBoy.metaClass."$name"=impl
       impl(args)
     }
     else
     {
       println "I dont play $activity"
     }
   }
  }
}

def sam= new Boy()
sam.activities=['Tennis','FootBall']
sam.playTennis()
sam.playTennis()
sam.playFootBall()
println '11111111111111111111111111111111'
println sam.metaClass.methods.size()
println sam.metaClass.methods
println sam.metaClass.metaMethods
println '2222222222222222222222222222222222222222222'
