class Hero {
  def sleep() {
    println 'sleep'
  }
}

class Superman {
  def fly() { println "flying" }
}

class Ninja {
  def fight() { println "fighting" }
}


Hero.mixin Superman, Ninja

p = new Hero()

p.sleep()
p.fly()
p.fight()