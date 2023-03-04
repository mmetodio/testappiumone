package org.meto.appium.tests;

import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormPage;
import org.meto.appium.pages.FormProspect;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFLogin extends TestBase {
	FormPage formPage;
	FormProspect formProspect;
	FormCustomer formCustomer;
	
	@BeforeMethod
	public void beforeMethod(Method method) {

		formPage = new FormPage(driver);
		formProspect = new FormProspect(driver);
		formCustomer = new FormCustomer(driver);
		
	}
	
	@Test
	public void FillForm() throws InterruptedException{
		
		//FormPage formPage = new FormPage(driver);
	//	ExtentTest test = extent.createTest("Initial Test");
		formPage.setNameUser("asesorqa");
		formPage.setNamePass("Surgir.2026");
		formPage.setSubmitLogin();
		formPage.setAgencySelection("Agencia");
		formPage.setRolSelection("Rol");
		formPage.setSubmitRol();
		formPage.setClaveLocal1("Prueba1234");
		formPage.setClaveConfLocal("Prueba1234");
		FormProspect formProspect = formPage.localButtom();
		
		/*
		formProspect.PropuestaButton();
		formProspect.ReturnButton();
		formProspect.PropuestaHome();
		formProspect.setNumDoc("09921741");
		formProspect.Verificando();
		formProspect.setFecCaducidad("01/01/2030");
		formProspect.setFirstName("TestFisrtname");
		formProspect.setSecondName("TestSecondName");
		formProspect.setSurName("Testlastname");
		formProspect.avance();
		formProspect.setSecondSureName("OtherLastName");
		formProspect.setFecNa("01/03/1991");
		formProspect.avance();
		formProspect.setnMobile("990493838");
		formProspect.setnMail("metodicosys@gmail.com");
		formProspect.continuarProspect();
		formProspect.scrollData();
		formProspect.continuarData();
	//	formProspect.bcontinuarValid();
	  */
	 
	
	//	FormCustomer formCustomer = formProspect.bcontinuarValid();
							//	formCustomer.bcontinuarValid();
		/*
		formCustomer.Customer();
		formCustomer.fotoExperian();
		formCustomer.fotofrenteDni();
		formCustomer.fotoreversoDni();
		formCustomer.fotoCliente();
		//	formCustomer.nextone(); avance con scroll
		formCustomer.swipeScreenOneCustomer();
		formCustomer.gradoInstruccion();
		formCustomer.profesionN();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.prePago();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.codigoArea();
		//	formCustomer.telefonoFijo("3827271");
		formCustomer.operadorTelef();

		formCustomer.swipeScreenOneCustomer();
	//	formCustomer.nexttwoCustomer();
		formCustomer.tipodeComprobante();
		formCustomer.fotoComprobanteDomicilio();
		formCustomer.casaqueHabita();
		formCustomer.otrotipoDomicilio("choza");
		formCustomer.personaenDomicilio();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.departamentos();
		formCustomer.provincias();
		formCustomer.distritos();
		formCustomer.urbanizacion("2");
		*/
		
	}
	
	@Test
	public void FillProspect() throws InterruptedException{
		//FormProspect formProspect = formPage.localButtom();
		FormProspect formProspect = new FormProspect(driver);
		formProspect.PropuestaButton();
		formProspect.ReturnButton();
		formProspect.PropuestaHome();
		formProspect.setNumDoc("09921741");
		formProspect.Verificando();
		formProspect.setFecCaducidad("01/01/2030");
		formProspect.setFirstName("TestFisrtname");
		formProspect.setSecondName("TestSecondName");
		formProspect.setSurName("Testlastname");
		formProspect.avance();
		formProspect.setSecondSureName("OtherLastName");
		formProspect.setFecNa("01/03/1991");
		formProspect.avance();
		formProspect.setnMobile("990493838");
		formProspect.setnMail("metodicosys@gmail.com");
		formProspect.continuarProspect();
		formProspect.scrollData();
		formProspect.continuarData();
		FormCustomer formCustomer = formProspect.bcontinuarValid();
		
		formCustomer.CustomerP();
		formCustomer.fotoExperian();
		formCustomer.fotofrenteDni();
		formCustomer.fotoreversoDni();
		formCustomer.fotoCliente();
		//	formCustomer.nextone(); avance con scroll
		formCustomer.swipeScreenOneCustomer();
		formCustomer.gradoInstruccion();
		formCustomer.profesionN();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.prePago();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.codigoArea();
		//	formCustomer.telefonoFijo("3827271");
		formCustomer.operadorTelef();

		formCustomer.swipeScreenOneCustomer();
	//	formCustomer.nexttwoCustomer();
		formCustomer.tipodeComprobante();
		formCustomer.fotoComprobanteDomicilio();
		formCustomer.casaqueHabita();
		formCustomer.otrotipoDomicilio("choza");
		formCustomer.personaenDomicilio();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.departamentos();
		formCustomer.provincias();
		formCustomer.distritos();
		formCustomer.urbanizacion("2");
		formCustomer.tipoVia();
		formCustomer.nomDireccion("mi direccionx");
		formCustomer.swipeScreenOneCustomer();
		formCustomer.numExterior("432");
		formCustomer.numInterior("6");
		formCustomer.permanenciaAnios();
		formCustomer.referenciaUbic("mi referencia ubic");

		
	}

	/*
	@Test
	public void FillCustomer(){
		FormCustomer formCustomer = new FormCustomer(driver);
		formCustomer.CustomerP();
		formCustomer.fotoExperian();
		formCustomer.fotofrenteDni();
		formCustomer.fotoreversoDni();
		formCustomer.fotoCliente();
		//	formCustomer.nextone(); avance con scroll
		formCustomer.swipeScreenOneCustomer();
		formCustomer.gradoInstruccion();
		formCustomer.profesionN();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.prePago();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.codigoArea();
		//	formCustomer.telefonoFijo("3827271");
		formCustomer.operadorTelef();
		formCustomer.swipeScreenOneCustomer();
	//	formCustomer.nexttwoCustomer();
		formCustomer.tipodeComprobante();
		formCustomer.fotoComprobanteDomicilio();
		formCustomer.casaqueHabita();
		formCustomer.otrotipoDomicilio("choza");
		formCustomer.personaenDomicilio();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.departamentos();
		formCustomer.provincias();
		formCustomer.distritos();
		formCustomer.urbanizacion("2");
		
	} */
	
	
}
