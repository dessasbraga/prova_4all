package testcases;


import org.junit.Test;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import pages.*;
import reports.ScreenShot;
import support.Browser;
import util.Path;


import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


public class Challenge1 {
    public WebDriver driver;



    @Before
    public void browserlaunch()
    {
        //Alteração de Browser via parâmetro
        driver = Browser.StartBrowser("Chrome", "https://shopcart-challenge.4all.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


    @Test
    public void Challenge1() {

          HomePage homePage = new HomePage(driver);

        homePage.clickAbrirSeletorCategorias()
                .clickSelecionarCategoriaDoces()
                .clickAdicionarBrigadeiro()
                .clickAdicionarAlfajor()
                .clickAbrirSeletorCategorias()
                .clickSelecionarCategoriaTodos();


        ScreenShot.captureScreenShot(driver, Path.URL +  Path.DESAFIO_1 + "_Home.png");

             homePage.clickAcessarCarrinho();

        ShopCartPage shopCartPage = new ShopCartPage(driver);
        shopCartPage.clickAumentaQuantidadeBrigadeiro()
                .clickAumentaQuantidadeBrigadeiro()
                .clickAumentaQuantidadeBrigadeiro()
                .clickAumentaQuantidadeBrigadeiro();

        ScreenShot.captureScreenShot(driver, Path.URL + Path.DESAFIO_1 + "_ShopCart.png");

        shopCartPage.clickFinalizarCompra();

        boolean validarMensagemPedidoSucessoChrome = driver.getPageSource().contains("Pedido realizado com sucesso!");
        assertTrue(validarMensagemPedidoSucessoChrome);


        ScreenShot.captureScreenShot(driver, Path.URL + Path.DESAFIO_1 + "_Pedido_realizado_com_sucesso.png");

        shopCartPage.clickFecharMensagem();



    }

    @After
    public void tearDown() {
        driver.quit();


    }


}


