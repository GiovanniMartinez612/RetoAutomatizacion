package com.choucair.formacion.pageobjects;
 
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl ("https://www.phptravels.net/home")

public class RealizarReservaPageObjects extends PageObject {

	String btnHotels = "//*[@id=\'search\']/div/div/div/div/div/nav/ul/li[1]/a";
	String cboSeleccionarDestination = "//*[@id=\'s2id_autogen16\']";
	
	String txtCheckIn = "//*[@id=\'checkin\']";
	String txtCheckOut= "//*[@id=\'checkout\']";
	
	/*String btnSearch = "//*[@id=\'hotels\']/div/div/form/div/div/div[4]/button";*/
	String btnSearch = "(//BUTTON[@type='submit'])[1]";
	
	                        
	/*String lblSelectRoom = "//*[@id=\'detail-content-sticky-nav-02\']/form/div/div[2]/div/div[2]/div/div[2]";*/
	/*String lblSelectRoom1 = "//*[@id='detail-content-sticky-nav-02']/form/div/div[2]/div/div[2]/div/div[2]/h5/div/label";*/
	/*String lblSelectRoom = "//*[@id=\'detail-content-sticky-nav-02\']/form/div/div[5]/div/div[2]/div/div[2]";*/
	/*String lblSelectRoom1 = "//*[@id='detail-content-sticky-nav-02']/form/div/div[5]/div/div[2]/div/div[2]/h5/div/label";*/
		
	String lblSelectRoom = "//*[@id='detail-content-sticky-nav-02']/form/div/div[8]/div/div[2]/div/div[2]";
	String lblSelectRoom1 = "//*[@id=\'detail-content-sticky-nav-02\']/form/div/div[8]/div/div[2]/div/div[2]/h5/div/label";
	
	String btnBookNow = "/html/body/div[2]/div[1]/div[1]/div/div[3]/div/div[2]/div[1]";
	/*String btnBookNow1 = "//*[@id=\\'detail-content-sticky-nav-02\\']/form/div/button";*/
	/*String btnBookNow = "//BUTTON[@type='submit'][text()='    Book Now                ']";*/
	
	String txtFirstName = "//*[@id=\'guestform\']/div[1]/div[1]/div/label/input";
	String txtLastName = "//*[@id=\'guestform\']/div[1]/div[2]/label/input";
	String txtEmail = "//*[@id=\'guestform\']/div[2]/div[1]/label/input";
	String txtConfirmEmail = "//*[@id=\'guestform\']/div[2]/div[2]/label/input";
	String txtContactNumber = "//*[@id=\'guestform\']/div[3]/div/label/input";
	String txtAddress = "//*[@id=\'guestform\']/div[4]/div/label/input";
	String cboCountry = "//*[@id=\'guestform\']/div[5]/div/div[2]/a/span";
	String cboCountry1 = "//*[@id='guestform']/div[5]/div/div[2]/div/div/input";
	String btnSignIn = "//*[@id=\'signintab\']";
	String txtEmailSignIn = "//*[@id=\'loginform\']/div[1]/div/label/input";
	String txtPasswordSignIn = "//*[@id=\'password\']";
	String txtCouponCode = "//*[@id=\'bookingdetails\']/div[5]/div[1]/div/div[2]/label/input";
	String btnApplyCoupon = "//*[@id=\'bookingdetails\']/div[5]/div[1]/div/div[2]/div/button";
	
	String btnConfirmThisBooking = "/html/body/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[6]";
	                                           
	String btnPayNow = "//*[@id=\'pay\']/div/div[2]/div/div[3]/div[2]/button";
	                    
	String cboPaymentMethod = "//*[@id=\'gateway_chosen\']/a/span";
	String txtFirstNameUno = "//*[@id=\'card-holder-firstname\']";
	String txtLastNameUno = "//*[@id=\'card-holder-lastname\']";
	String txtCardNumber = "//*[@id=\'card-number\']";
	String cboExpirationDate = "//*[@id=\'expiry-month\']";
	                    
	
	public void seleccionarBotonHotels() {
		// TODO Auto-generated method stub
		getDriver().manage().window().maximize();
		find(By.xpath(btnHotels)).click();
	}

	public void seleccionarDestination(String strDestination) {
		// TODO Auto-generated method stub
		find(By.xpath(cboSeleccionarDestination)).click();
		waitFor(2).seconds();
		find(By.xpath("//*[@id=\'select2-drop\']/ul/li[1]/ul/li[5]")).click();
		waitFor(1).seconds();
	}	

	public void seleccionarFechaCheckIn(String strCheckIn) {
		// TODO Auto-generated method stub
		find(By.xpath(txtCheckIn)).click();
		waitFor(1).seconds();
		find(By.xpath(txtCheckIn)).clear();
		waitFor(1).seconds();
		find(By.xpath(txtCheckIn)).sendKeys(strCheckIn);
		/*find(By.xpath(txtCheckIn)).selectByValue(strCheckIn);*/
	}

	public void seleccionarFechaCheckOut(String strCheckOut) {
		// TODO Auto-generated method stub
		find(By.xpath(txtCheckOut)).click();
		waitFor(1).seconds();
		find(By.xpath(txtCheckOut)).clear();
		waitFor(1).seconds();
		find(By.xpath(txtCheckOut)).sendKeys(strCheckOut);	
	}

	public void seleccionarNumeroAdults() {
		// TODO Auto-generated method stub
		
	}

	public void seleccionarNumeroChild() {
		// TODO Auto-generated method stub
		
	}

	public void clicBotonSearch() {
		// TODO Auto-generated method stub
		find(By.xpath(btnSearch)).click();
	}

	public void clicSelectRoom() {
		// TODO Auto-generated method stub
		find(By.xpath(lblSelectRoom)).click();
		find(By.xpath(lblSelectRoom1)).click();
		waitFor(2).seconds();
	}

	public void clicBotonBookNow() {
		// TODO Auto-generated method stub
		find(By.xpath(btnBookNow)).click();
		/*find(By.xpath(btnBookNow1)).click();*/
		find(By.xpath("//*[@id=\'detail-content-sticky-nav-02\']/form/div/button")).click();
		waitFor(2).seconds();
	}

	public void ingresarFirstName(String strFirstName) {
		// TODO Auto-generated method stub
		find(By.xpath(txtFirstName)).sendKeys(strFirstName);
	}

	public void ingresarLastName(String strLastName) {
		// TODO Auto-generated method stub
		find(By.xpath(txtLastName)).sendKeys(strLastName);
	}

	public void ingresarEmail(String strEmail) {
		// TODO Auto-generated method stub
		find(By.xpath(txtEmail)).sendKeys(strEmail);
	}

	public void ingresarConfirmEmail(String strConfirmEmail) {
		// TODO Auto-generated method stub
		find(By.xpath(txtConfirmEmail)).sendKeys(strConfirmEmail);
	}

	public void ingresarContactNumber(String strContactNumber) {
		// TODO Auto-generated method stub
		find(By.xpath(txtContactNumber)).sendKeys(strContactNumber);
	}

	public void ingresarAddress(String strAddress) {
		// TODO Auto-generated method stub
		find(By.xpath(txtAddress)).sendKeys(strAddress);
	}

	public void seleccionarCountry(String strCountry) {
		// TODO Auto-generated method stub
		find(By.xpath(cboCountry)).click();
		waitFor(1).seconds();
		find(By.xpath(cboCountry1)).sendKeys(strCountry);
		find(By.xpath(cboCountry1)).typeAndEnter(strCountry);
	}

	public void clicBotonSignIn() {
		// TODO Auto-generated method stub
		find(By.xpath(btnSignIn)).click();
	}

	public void ingresarEmailSignIn(String strEmailSignIn) {
		// TODO Auto-generated method stub
		find(By.xpath(txtEmailSignIn)).sendKeys(strEmailSignIn);
	}

	public void ingresarPasswordSignIn(String strPasswordSignIn) {
		// TODO Auto-generated method stub
		find(By.xpath(txtPasswordSignIn)).sendKeys(strPasswordSignIn);
	}
	
	public void ingresarCouponCode(String strCouponCode) {
		// TODO Auto-generated method stub
		find(By.xpath(txtCouponCode)).sendKeys(strCouponCode);
		waitFor(1).seconds();
	}

	public void clicBotonApplyCoupon() {
		// TODO Auto-generated method stub
		find(By.xpath(btnApplyCoupon)).click();
		waitFor(3).seconds();
	}

	public void clicBotonAceptar() {
		// TODO Auto-generated method stub
		
	}

	public void clicbotonConfirmThisBooking() {
		// TODO Auto-generated method stub
		find(By.xpath(btnConfirmThisBooking)).click();
		find(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[6]/button")).click();	
		waitFor(1).seconds();
	}

	public void clicBotonPayNow() {
		// TODO Auto-generated method stub
		/*find(By.xpath(btnPayNow)).click();*/	
		/*find(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[2]/center/button[2]")).click();*/	
		
	}

	public void seleccionarPaymentMethod(String strPaymentMethod) {
		// TODO Auto-generated method stub
		find(By.xpath(cboPaymentMethod)).click();
		waitFor(2).seconds();
		find(By.xpath(cboPaymentMethod)).selectByValue(strPaymentMethod);
		waitFor(1).seconds();
	}
	
	public void ingresarFirstNameUno(String strFirstNameUno) {
		// TODO Auto-generated method stub
		find(By.xpath(txtFirstNameUno)).sendKeys(strFirstNameUno);
	}

	public void ingresarLastNameUno(String strLastNameUno) {
		// TODO Auto-generated method stub
		find(By.xpath(txtLastNameUno)).sendKeys(strLastNameUno);
	}

	public void ingresarCardNumber(String strCardNumber) {
		// TODO Auto-generated method stub
		find(By.xpath(txtCardNumber)).sendKeys(strCardNumber);
	}

	public void seleccionarExpirationDate(String strExpirationDate) {
		// TODO Auto-generated method stub
		find(By.xpath(cboExpirationDate)).click();
		waitFor(2).seconds();
		find(By.xpath(cboExpirationDate)).selectByValue(strExpirationDate);
		waitFor(1).seconds();
	}

	
}
