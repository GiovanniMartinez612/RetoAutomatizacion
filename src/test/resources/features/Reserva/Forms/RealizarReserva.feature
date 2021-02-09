#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
 # I want to use this template for my feature file

  #@tag1
  #Scenario: Title of your scenario
   # Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |

      
@Reserva
Feature: Realizar una reserva 

	@CasoNoExitoso
	Scenario: Reserva no exitosa   
	Given Ingresar al aplicativo 
	When Seleccionar boton Hotels 
	And Seleccionar Destination "Jumeirah Beach Hotel, Dubai"
	And Seleccionar fecha Check in "14/02/2021"
	And Seleccionar fecha Check out "19/02/2021"
	And Seleccionar numero Adults
	And Seleccionar numero Child 
	And Dar clic en el boton Search
	And Seleccionar un cuarto dando clic en Select Room 
	And Dar clic en el boton Book Now
	And Ingresar First Name "Prueba"
	And Ingresar Last Name "Auto"
	And Ingresar Email "prueba@auto.com"
	And Ingresar Confirm Email "prueba@auto.com"
	And Ingresar Contact Number "7414141"
	And Ingresar Address "Calle 7 N 12 a - 56"
	And Seleccionar Country "Colombia"
	And Dar clic en Sign In
	And Ingresar Email Sign In "correo@sign.co"
	And Ingresar Password Sign In "123456"
	And Ingresar Coupon Code "121213"
	And Dar clic en el boton Apply Coupon
	And Dar clic en el boton Aceptar
	And Dar clic en el boton Confirm this booking
	And Dar clic en el boton Pay Now
	And Seleccionar Payment Method "Credit Card"
	And Ingresar First Name Uno "Pago"
	And Ingresar Last Name Uno "Pruebas"
	And Ingresar Card Number "123456789"
	And Seleccionar Expiration Date "Oct (10)"
	And Dar clic en el boton Pay Now
	Then Verificar mensaje respuesta
	
	