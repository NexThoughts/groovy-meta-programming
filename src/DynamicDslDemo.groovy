/**
 * Created by chetan on 24/3/16.
 */

playerAndScores=[:]
def getWinner()
{

  def winner=playerAndScores.max{
    entry-> entry.value
  }

  println "winner is ${winner?.key} with ${winner?.value}"

}
def methodMissing(String name,args)
{
  playerAndScores[name]=args[0]
}




John 10
Sara 14
Bob 9
winner