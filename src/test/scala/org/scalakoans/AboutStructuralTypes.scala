package org.scalakoans

import support.KoanSuite

class AboutStructuralTypes extends KoanSuite {

  koan ("stuctural types") {
    def sayHello(person: {def name: String}) = "Hello, " + person.name

    case class Person(name: String)

    val p = new Person("Lou")

    sayHello(p) should be("Hello, Lou")

    class Person2 {
      def name = "Fred"
    }
    val p2 = new Person2
    sayHello(p2) should be("Hello, Fred")
  }

  koan ("defined structural type") {
    type HasName = {def name: String}

    def sayHello(person: HasName) = "Hello, " + person.name

    case class Person(name: String)

    val p = new Person("Lou")
    sayHello(p) should be("Hello, Lou")
  }

}
