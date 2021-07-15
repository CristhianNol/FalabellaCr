package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;


public class menuPage extends util {
    @FindBy(linkText = "Generate Card Number") protected WebElement lnkGenerarTarjeta;
    @FindBy(css = "#nav > a:nth-child(2)") protected WebElement lnkGenerarTarjeta2;
    @FindBy(xpath = "//nav/a[@href='cardnumber.php']") protected WebElement lnkGenerarTarjeta3;



    //falabella
    @FindBy(xpath = "//*[@id=\"testId-SearchBar-Input\"]") protected WebElement texto;
    @FindBy(xpath = "//*[@id=\"testId-search-wrapper\"]/div/button/img") protected WebElement buscar;
    @FindBy(xpath = "//*[@id=\"testId-Dropdown-desktop-button\"]/i") protected WebElement ordenar;
    @FindBy(id = "testId-Dropdown-Precio de mayor a menor") protected WebElement ordenar2;

    public menuPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickGenerarTarjeta(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkGenerarTarjeta));
        lnkGenerarTarjeta.click();
    }

    public void escribirPalabra(String text){
        texto.sendKeys(text);
    }

    public void clickBuscar(){
        wait.until(ExpectedConditions.elementToBeClickable(buscar));
        buscar.click();
    }

    public void clickOrdenar(){
        wait.until(ExpectedConditions.elementToBeClickable(ordenar));
        ordenar.click();
    }

    public void clickOrdenar2(){
        wait.until(ExpectedConditions.elementToBeClickable(ordenar2));
        ordenar2.click();
    }

}
