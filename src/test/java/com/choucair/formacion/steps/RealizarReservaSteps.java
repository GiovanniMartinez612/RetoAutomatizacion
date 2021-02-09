package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.RealizarReservaPageObjects;
import net.thucydides.core.annotations.Step;
/*import net.thucydides.core.annotations.Steps;*/

public class RealizarReservaSteps {

	RealizarReservaPageObjects realizarReservaPageObjects;
	
	@Step
	public void browser() {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.open();
	}

	@Step
	public void seleccionarBotonHotels() {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.seleccionarBotonHotels();
	}

	@Step
	public void seleccionarDestination(String strDestination) {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.seleccionarDestination(strDestination);
	}	

	@Step
	public void seleccionarFechaCheckIn(String strCheckIn) {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.seleccionarFechaCheckIn(strCheckIn);
	}
	
	@Step
	public void seleccionarFechaCheckOut(String strCheckOut) {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.seleccionarFechaCheckOut(strCheckOut);
	}
	
	@Step
	public void seleccionarNumeroAdults() {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.seleccionarNumeroAdults();
	}

	@Step
	public void seleccionarNumeroChild() {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.seleccionarNumeroChild();
	}

	@Step
	public void clicBotonSearch() {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.clicBotonSearch();
	}

	@Step
	public void clicSelectRoom() {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.clicSelectRoom();
	}

	@Step
	public void clicBotonBookNow() {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.clicBotonBookNow();
	}

	@Step
	public void ingresarFirstName(String strFirstName) {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.ingresarFirstName(strFirstName);
	}

	@Step
	public void ingresarLastName(String strLastName) {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.ingresarLastName(strLastName);
	}

	@Step
	public void ingresarEmail(String strEmail) {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.ingresarEmail(strEmail);
	}

	@Step
	public void ingresarConfirmEmail(String strConfirmEmail) {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.ingresarConfirmEmail(strConfirmEmail);
	}

	@Step
	public void ingresarContactNumber(String strContactNumber) {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.ingresarContactNumber(strContactNumber);
	}

	@Step
	public void ingresarAddress(String strAddress) {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.ingresarAddress(strAddress);
	}

	@Step
	public void seleccionarCountry(String strCountry) {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.seleccionarCountry(strCountry);
	}
	
	@Step
	public void clicBotonSignIn() {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.clicBotonSignIn();
	}

	@Step
	public void ingresarEmailSignIn(String strEmailSignIn) {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.ingresarEmailSignIn(strEmailSignIn);
	}

	@Step
	public void ingresarPasswordSignIn(String strPasswordSignIn) {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.ingresarPasswordSignIn(strPasswordSignIn);
	}
	
	@Step
	public void ingresarCouponCode(String strCouponCode) {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.ingresarCouponCode(strCouponCode);
	}

	@Step
	public void clicBotonApplyCoupon() {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.clicBotonApplyCoupon();
	}

	@Step
	public void clicBotonAceptar() {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.clicBotonAceptar();
	}

	@Step
	public void clicBotonConfirmThisBooking() {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.clicbotonConfirmThisBooking();
	}

	@Step
	public void clicBotonPayNow() {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.clicBotonPayNow();
	}

	@Step
	public void seleccionarPaymentMethod(String strPaymentMethod) {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.seleccionarPaymentMethod(strPaymentMethod);
	}

	@Step
	public void ingresarFirstNameUno(String strFirstNameUno) {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.ingresarFirstNameUno(strFirstNameUno);
	}

	@Step
	public void ingresarLastNameUno(String strLastNameUno) {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.ingresarLastNameUno(strLastNameUno);
	}

	@Step
	public void ingresarCardNumber(String strCardNumber) {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.ingresarCardNumber(strCardNumber);
	}

	@Step
	public void seleccionarExpirationDate(String strExpirationDate) {
		// TODO Auto-generated method stub
		realizarReservaPageObjects.seleccionarExpirationDate(strExpirationDate);
	}

	
				
}
