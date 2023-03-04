package org.meto.appium.pages;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.meto.appium.base.TestBase;
import org.meto.appium.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.DefaultElementByBuilder;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.offset.PointOption;

//public class FormCustomer extends AndroidActions{
public class FormCustomer extends AndroidActions{

	AndroidDriver driver;
	
	public FormCustomer(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

	}
	
	//Boton continuar despues de las validaciones de buro, lista negra
	//@AndroidFindBy(id="pe.com.surgir.surgirapp:id/summary_button_continue")
	// /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button
	//	/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button")
	private WebElement btnContinuarValid;
	
	//MobileElement el1c = (MobileElement) driver.findElementByAccessibilityId("Cliente");
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Cliente\"]")
	private WebElement customerp;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Perfil de Experian']")
	private WebElement fotoExperian;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Foto del documento (Frente)']")
	private WebElement fotoFrenteDNI;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Foto del documento (Verso)']")
	private WebElement fotoVersoDNI;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Foto del cliente']")
	private WebElement fotoCliente;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement secondSurname;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Grado de instruccion']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Grado de instruccion']")
	private WebElement gradoInstruccionN;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Profesión u ocupación']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Profesión u ocupación']")
	private WebElement profesionyOcuo;
	
	//driver.findElement(By.xpath("//android.widget.RadioButton[@text='Pre-pago']")).click();	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Pre-pago']")
	private WebElement prepago;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Código de área']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Código de área']")
	private WebElement codarea;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Operador telefónico']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Operador telefónico']")
	private WebElement optelefono;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Teléfono fijo']")).sendKeys("762352");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Teléfono fijo']")
	private WebElement telefonofijo;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Tipo de comprobante de domicilio']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Tipo de comprobante de domicilio']")
	private WebElement comprobanted;
	
	//foto comprobante de domicilio
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Comprobante domicilio']")).click();
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Comprobante domicilio']")
	private WebElement fotocompdomicilio;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='¿La casa que habita es?']")).click();	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='¿La casa que habita es?']")
	private WebElement habita;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='N° personas en domicilio']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='N° personas en domicilio']")
	private WebElement numeropersona;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Otro tipo de domicilio']")).sendKeys("Otro tipo");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Otro tipo de domicilio']")
	private WebElement otrotipo;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Departamento']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Departamento']")
	private WebElement departamen;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Provincia']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Provincia']")
	private WebElement provinc;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Distrito']")).click();	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Distrito']")
	private WebElement distrit;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Barrio/Urbanización']")).sendKeys("mibarrio");	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Barrio/Urbanización']")
	private WebElement urbaniza;
	
	//	driver.findElement(By.xpath("//android.widget.EditText[@text='Tipo de vía']")).click();	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Tipo de vía']")
	private WebElement tipovias;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Nombre de la dirección']")).sendKeys("Mi dirección");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Nombre de la dirección']")
	private WebElement direcc;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='N° exterior de la dirección']")).sendKeys("500");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='N° exterior de la dirección']")
	private WebElement nexterior;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='N° interior de la dirección']")).sendKeys("100");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='N° interior de la dirección']")
	private WebElement interior;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Permanencia en años']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Permanencia en años']")
	private WebElement permanios;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Referencia de ubicación']")).sendKeys("Mi referencia");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Referencia de ubicación']")
	private WebElement referen;
	
	//Botón Listo de galeria
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/button_gallery_listo")
	private WebElement nListo;
	
	
	public FormCustomer CustomerP() {
		customerp.click();
		return this;

	}
			
	public FormCustomer fotoExperian() {
		fotoExperian.click();
		fotoExperian.click();
		List<WebElement> lists4 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		TouchAction touch4 = new TouchAction<>(driver);
		touch4.press(PointOption.point(230,170));
		touch4.release();
		touch4.perform();
		nListo.click();
		return this;
		
	}
	
	public FormCustomer fotofrenteDni() {
		fotoFrenteDNI.click();
		fotoFrenteDNI.click();
		List<WebElement> lists5 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		TouchAction touch5 = new TouchAction<>(driver);
		touch5.press(PointOption.point(427,168));
		touch5.release();
		touch5.perform();
		nListo.click();
		return this;
		
	}
	
	public FormCustomer fotoreversoDni() {
		fotoVersoDNI.click();
		fotoVersoDNI.click();
		List<WebElement> lists6 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		TouchAction touch6 = new TouchAction<>(driver);
		touch6.press(PointOption.point(623,170));
		touch6.release();
		touch6.perform();
		nListo.click();
		return this;
		
	}
	
	public FormCustomer fotoCliente() {
		fotoCliente.click();
		fotoCliente.click();
		List<WebElement> lists7 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery"));
		TouchAction touch7 = new TouchAction<>(driver);
		touch7.press(PointOption.point(230,170));
		touch7.release();
		touch7.perform();
		nListo.click();
		return this;
		
	}
	
	public FormCustomer swipeScreenOneCustomer() {
		swipeScreen();
		return this;
		
	}
	
	public FormCustomer gradoInstruccion() {
		gradoInstruccionN.click();
		gradoInstruction();
		return this;
	
	}
	
	public FormCustomer profesionN() {
		profesionyOcuo.click();
		profesion();
		return this;
		
	}
	
	public FormCustomer nextone() {
		scrollToPageCustomer1();
		return this;
		
	}
	
	public FormCustomer nexttwoCustomer() {
		scrollToPageCustomer2();
		return this;
		
	}
	
	public FormCustomer prePago() {
		prepago.click();
		return this;
		
	}
	
	public FormCustomer codigoArea() {
		codarea.click();
		codigodearea();
		return this;
		
	}
	
	public FormCustomer operadorTelef() {
		optelefono.click();
		operadordeTelef();
		return this;
		
	}
	
	public FormCustomer telefonoFijo(String fijo) {
		telefonofijo.sendKeys(fijo);
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ESCAPE));
		return this;
		
	}
	
	public FormCustomer fotoComprobanteDomicilio() {
		fotocompdomicilio.click();
		fotocompdomicilio.click();
		fotoComprobDomicilio();//touch de foto
		nListo.click();
		return this;
		
	}

	public FormCustomer tipodeComprobante() {
		comprobanted.click();
		tipoComprobante();
		return this;
		
	}
	
	public FormCustomer casaqueHabita() {
		habita.click();
		casaHabita();
		return this;
		
	}
	
	public FormCustomer otrotipoDomicilio(String otrotipod) {
		otrotipo.sendKeys(otrotipod);;
		return this;
		
	}
	
	public FormCustomer personaenDomicilio() {
		numeropersona.click();
		numPersonas();
		return this;
		
	}
	
	public FormCustomer departamentos() {
		departamen.click();
		departament();
		return this;
		
	}
	
	public FormCustomer provincias() {
		provinc.click();
		provincia();
		return this;
		
	}
	
	public FormCustomer distritos() {
		distrit.click();
		distrito();
		return this;
		
	}
	
	public FormCustomer urbanizacion(String urban) {
		urbaniza.clear();
		urbaniza.sendKeys(urban);
		return this;
		
	}
	public FormCustomer tipoVia() {
		tipovias.click();
		tipoviac();
		return this;
		
	}
	
	public FormCustomer nomDireccion(String namedireccion) {
		direcc.sendKeys(namedireccion);
		return this;
	}
	
	public FormCustomer numExterior(String nexteriorx) {
		nexterior.sendKeys(nexteriorx);
		return this;
	}
	
	public FormCustomer numInterior(String ninterior) {
		nexterior.sendKeys(ninterior);
		return this;
	}
	
	public FormCustomer permanenciaAnios() {
		permanios.click();
		permanenciaanios();
		return this;
		
	}
	
	
	public FormCustomer referenciaUbic(String referencia) {
		referen.sendKeys(referencia);
		return this;
		
	}
	
	
}
