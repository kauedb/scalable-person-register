package br.com.kauedb.model.register

import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}

/**
 * Created by kauedb.
 */
class CreatePersonSpec extends FeatureSpec with GivenWhenThen with Matchers {

  info("As an application developer ")
  info("I want to be able to create a person")
  info("So I can encapsulate person data to easily reuse")

  feature("Create Person") {
    scenario("Create Person without ID") {
      Given("a first name")
      val aFirstName = "John"
      And("a last name")
      val aLastName = "Doe"
      When("set")
      val person = Person(firstName = aFirstName, lastName = aLastName)
      Then("a person is created")
      person should not be null
      And("person's first name is John")
      person.firstName should be("John")
      And("person's last name is Doe")
      person.lastName should be("Doe")
      And("person has no id")
      person.id should be (None)
    }
    scenario("Create Person with ID") {
      Given("a first name")
      val aFirstName = "John"
      And("a last name")
      val aLastName = "Doe"
      And("an id")
      val id = 1
      When("set")
      val person = Person(id = Some(id), firstName = aFirstName, lastName = aLastName)
      Then("a person is created")
      person should not be null
      And("person's first name is John")
      person.firstName should be("John")
      And("person's last name is Doe")
      person.lastName should be("Doe")
      And("person has no id")
      person.id should be (Some(1))
    }

  }

}
