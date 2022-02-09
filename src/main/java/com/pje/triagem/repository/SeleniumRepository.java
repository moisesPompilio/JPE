package com.pje.triagem.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pje.triagem.modelo.Usuario;

public class SeleniumRepository {
	WebDriver driver;
	WebDriverWait wait;

	public String open() throws InterruptedException {
		String url = "https://pje.tjpa.jus.br/pje/login.seam";
		System.setProperty("webdriver.gecko.driver", "GeckoDriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		Thread.sleep(1000);
		/*driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/form/input")).click();
		String campoUserPath = "username";
		WebElement campoUserElemt = driver.findElement(By.id(campoUserPath));
		// String user = "039.669.222-23";
		campoUserElemt.sendKeys(usuario.getCpf());
		Thread.sleep(1000);
		String campoPassPath = "password";
		WebElement campoPassElemt = driver.findElement(By.id(campoPassPath));
		// String pass = "AfonsoSoVacuo1";
		campoPassElemt.sendKeys(usuario.getSenha());

		String sendLoginPath = "btnEntrar";
		WebElement sendLoginElem = driver.findElement(By.id(sendLoginPath));
		sendLoginElem.click();
		return sendLoginPath;*/
		return "due certo";
	}
	
	public void teste() {
		
	}
}
