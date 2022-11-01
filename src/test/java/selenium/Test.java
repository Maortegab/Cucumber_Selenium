package selenium;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

    private WebDriver driver = Hooks.getDriver();

    @Given("^El usuario se encuentra en la pagina Home de imalittletester$")
    public void el_usuario_se_encuentra_en_la_pagina_Home_de_imalittletester() throws Throwable {
        String titleHomePage= "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends." ;
        Assert.assertEquals(titleHomePage,driver.getTitle());

    }

    @When("^Hace click sobre el boton The little tester comics$")
    public void hace_click_sobre_el_boton_The_little_tester_comics() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement comicPageOpened = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu-item-2008")));
        WebElement titleComicsLocator = driver.findElement(By.id("menu-item-2008"));
        titleComicsLocator.click();

    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {
        //WebElement pageTitleLocator = driver.findElement(By.className("page-title"));
        //Assert.assertTrue( "No se Redireccionó a la pagina de Comics", pageTitleLocator.isDisplayed());
        //Assert.assertEquals( "Category: ",pageTitleLocator.getText());


    }
}
