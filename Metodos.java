package metodos;

import org.openqa.selenium.By;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elementos, String texto) {
		driver.findElement(elementos).sendKeys(texto);;

	}

	public void clicar(By elementos) {

		driver.findElement(elementos).click();
	}

}
