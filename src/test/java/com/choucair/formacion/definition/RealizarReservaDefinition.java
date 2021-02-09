package com.choucair.formacion.definition;

import com.choucair.formacion.steps.RealizarReservaSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RealizarReservaDefinition {

	@Steps
	RealizarReservaSteps realizarReservaSteps;
	
	@Given("^Ingresar al aplicativo$")
	public void ingresar_al_aplicativo() throws Throwable {
		realizarReservaSteps.browser();
	}

	@When("^Seleccionar boton Hotels$")
	public void seleccionar_boton_Hotels() throws Throwable {
		realizarReservaSteps.seleccionarBotonHotels();
	}

	@When("^Seleccionar Destination \"([^\"]*)\"$")
	public void seleccionar_Destination(String strDestination) throws Throwable {
	    realizarReservaSteps.seleccionarDestination(strDestination);
	}
		
	@When("^Seleccionar fecha Check in \"([^\"]*)\"$")
	public void seleccionar_fecha_Check_in(String strCheckIn) throws Throwable {
	    realizarReservaSteps.seleccionarFechaCheckIn(strCheckIn);
	}
	
	@When("^Seleccionar fecha Check out \"([^\"]*)\"$")
	public void seleccionar_fecha_Check_out(String strCheckOut) throws Throwable {
	    realizarReservaSteps.seleccionarFechaCheckOut(strCheckOut);
	}	
	
	@When("^Seleccionar numero Adults$")
	public void seleccionar_numero_Adults() throws Throwable {
		realizarReservaSteps.seleccionarNumeroAdults();
	}

	@When("^Seleccionar numero Child$")
	public void seleccionar_numero_Child() throws Throwable {
		realizarReservaSteps.seleccionarNumeroChild();
	}

	@When("^Dar clic en el boton Search$")
	public void dar_clic_en_el_boton_Search() throws Throwable {
		realizarReservaSteps.clicBotonSearch();
	}

	@When("^Seleccionar un cuarto dando clic en Select Room$")
	public void seleccionar_un_cuarto_dando_clic_en_Select_Room() throws Throwable {
		realizarReservaSteps.clicSelectRoom();
	}

	@When("^Dar clic en el boton Book Now$")
	public void dar_clic_en_el_boton_Book_Now() throws Throwable {
		realizarReservaSteps.clicBotonBookNow();
	}

	@When("^Ingresar First Name \"([^\"]*)\"$")
	public void ingresar_First_Name(String strFirstName) throws Throwable {
		realizarReservaSteps.ingresarFirstName(strFirstName);
	}

	@When("^Ingresar Last Name \"([^\"]*)\"$")
	public void ingresar_Last_Name(String strLastName) throws Throwable {
		realizarReservaSteps.ingresarLastName(strLastName);
	}

	@When("^Ingresar Email \"([^\"]*)\"$")
	public void ingresar_Email(String strEmail) throws Throwable {
		realizarReservaSteps.ingresarEmail(strEmail);
	}

	@When("^Ingresar Confirm Email \"([^\"]*)\"$")
	public void ingresar_Confirm_Email(String strConfirmEmail) throws Throwable {
		realizarReservaSteps.ingresarConfirmEmail(strConfirmEmail);
	}

	@When("^Ingresar Contact Number \"([^\"]*)\"$")
	public void ingresar_Contact_Number(String strContactNumber) throws Throwable {
		realizarReservaSteps.ingresarContactNumber(strContactNumber);
	}

	@When("^Ingresar Address \"([^\"]*)\"$")
	public void ingresar_Address(String strAddress) throws Throwable {
		realizarReservaSteps.ingresarAddress(strAddress);
	}

	@When("^Seleccionar Country \"([^\"]*)\"$")
	public void seleccionar_Country(String strCountry) throws Throwable {
	   realizarReservaSteps.seleccionarCountry(strCountry);
	}

	@When("^Dar clic en Sign In$")
	public void dar_clic_en_Sign_In() throws Throwable {
		realizarReservaSteps.clicBotonSignIn();
	}

	@When("^Ingresar Email Sign In \"([^\"]*)\"$")
	public void ingresar_Email_Sign_In(String strEmailSignIn) throws Throwable {
		realizarReservaSteps.ingresarEmailSignIn(strEmailSignIn);
	}

	@When("^Ingresar Password Sign In \"([^\"]*)\"$")
	public void ingresar_Password_Sign_In(String strPasswordSignIn) throws Throwable {
		realizarReservaSteps.ingresarPasswordSignIn(strPasswordSignIn);
	}
	
	@When("^Ingresar Coupon Code \"([^\"]*)\"$")
	public void ingresar_Coupon_Code(String strCouponCode) throws Throwable {
		realizarReservaSteps.ingresarCouponCode(strCouponCode);
	}

	@When("^Dar clic en el boton Apply Coupon$")
	public void dar_clic_en_el_boton_Apply_Coupon() throws Throwable {
		realizarReservaSteps.clicBotonApplyCoupon();
	}

	@When("^Dar clic en el boton Aceptar$")
	public void dar_clic_en_el_boton_Aceptar() throws Throwable {
		realizarReservaSteps.clicBotonAceptar();
	}

	@When("^Dar clic en el boton Confirm this booking$")
	public void dar_clic_en_el_boton_Confirm_this_booking() throws Throwable {
		realizarReservaSteps.clicBotonConfirmThisBooking();
	}

	@When("^Dar clic en el boton Pay Now$")
	public void dar_clic_en_el_boton_Pay_Now() throws Throwable {
		realizarReservaSteps.clicBotonPayNow();
	}

	@When("^Seleccionar Payment Method \"([^\"]*)\"$")
	public void seleccionar_Payment_Method(String strPaymentMethod) throws Throwable {
	    realizarReservaSteps.seleccionarPaymentMethod(strPaymentMethod);
	}

	@When("^Ingresar First Name Uno \"([^\"]*)\"$")
	public void ingresar_First_Name_Uno(String strFirstNameUno) throws Throwable {
		realizarReservaSteps.ingresarFirstNameUno(strFirstNameUno);
	}

	@When("^Ingresar Last Name Uno \"([^\"]*)\"$")
	public void ingresar_Last_Name_Uno(String strLastNameUno) throws Throwable {
		realizarReservaSteps.ingresarLastNameUno(strLastNameUno);
	}

	@When("^Ingresar Card Number \"([^\"]*)\"$")
	public void ingresar_Card_Number(String strCardNumber) throws Throwable {
		realizarReservaSteps.ingresarCardNumber(strCardNumber);
	}

	@When("^Seleccionar Expiration Date \"([^\"]*)\"$")
	public void seleccionar_Expiration_Date(String strExpirationDate) throws Throwable {
	    realizarReservaSteps.seleccionarExpirationDate(strExpirationDate);
	}
	
	@Then("^Verificar mensaje respuesta$")
	public void verificar_mensaje_respuesta() throws Throwable {
	    
	}


}
