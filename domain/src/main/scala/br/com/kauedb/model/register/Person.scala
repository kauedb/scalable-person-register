package br.com.kauedb.model.register

import java.util.Date

/**
 * Created by kauedb.
 */
case class Person(id: Option[Long] = None, firstName: String, lastName: String)

// class SimplePerson(id: Long, firstName: String, lastName: String) extends Person(id=id , firstName=firstName, lastName=lastName)

trait BirthDay {

  val birthDate : Date

}