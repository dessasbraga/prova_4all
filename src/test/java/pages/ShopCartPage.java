package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopCartPage {

    private WebDriver driver;


    public ShopCartPage(WebDriver driver) {
        this.driver = driver;
    }


    public ShopCartPage clickAumentaQuantidadeBrigadeiro() {
        driver.findElement(By.id("add-product-4-qtd")).click();
        return this;
    }

    public ShopCartPage clickAumentarQuantidadeRissole() {
        driver.findElement(By.id("add-product-3-qtd")).click();

        return this;
    }

    public ShopCartPage clickDiminuirQuantidadeRissole() {
        driver.findElement(By.id("remove-product-3-qtd")).click();
        return this;
    }


    public ShopCartPage clickFecharMensagem(){
        driver.findElement(By.cssSelector(".close-modal")).click();
        return this;
    }

    public ShopCartPage clickFinalizarCompra() {
        driver.findElement(By.id("finish-checkout-button")).click();
        return this;
    }


}