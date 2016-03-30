Integer.metaClass {
  isEven { -> delegate % 2 == 0 }
  isOdd { -> delegate % 2 != 0 }
  // other methods
}

println 6.isEven() // true
println 6.isOdd()  // false
