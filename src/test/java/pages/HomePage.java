package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }
    public HomePage clickAdicionarBrigadeiro(){
        driver.findElement(By.id("add-product-4-btn")).click();
        return this;
    }
    public HomePage clickAdicionarAlfajor() {
        driver.findElement(By.id("add-product-5-btn")).click();

        return this;
    }
    public HomePage clickAbrirSeletorCategorias(){
        driver.findElement(By.id("open-categories-btn")).click();
        return this;
    }
    public HomePage clickSelecionarCategoriaTodos() {
        driver.findElement(By.id("category-all")).click();
        return this;
    }
    public HomePage clickSelecionarCategoriaBebidas() {
        driver.findElement(By.id("category-0")).click();
        return this;
    }
    public HomePage clickSelecionarCategoriaDoces() {
        driver.findElement(By.id("category-1")).click();
        return this;
    }
    public HomePage clickAdicionarCocaCola() {
        driver.findElement(By.id("add-product-0-btn")).click();

        return this;
    }
    public HomePage clickAdicionarFanta() {
        driver.findElement(By.id("add-product-1-btn")).click();

        return this;
    }
    public HomePage clickAdicionarAgua() {
        driver.findElement(By.id("add-product-2-btn")).click();

        return this;
    }

    public ShopCartPage clickAcessarCarrinho() {
        driver.findElement(By.id("cart-btn")).click();

        return new ShopCartPage(driver);
    }
    public ShopCartPage clickAdicionarRissole(){
        driver.findElement(By.id("add-product-3-btn")).click();

        return new ShopCartPage(driver);
    }

}
