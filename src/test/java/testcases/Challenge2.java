package testcases;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.*;
import reports.ScreenShot;
import support.*;
import util.*;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class Challenge2{

    private WebDriver driver;



    @Before
    public void browserlaunch()
    {

        //Alteração de Browser via parâmetro
        driver = Browser.StartBrowser("Chrome", "https://shopcart-challenge.4all.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


    @Test
    public void AdicionarAoCarrinho() {
        HomePage homePage = new HomePage(driver);
        homePage.clickAbrirSeletorCategorias();
        homePage.clickSelecionarCategoriaBebidas();
        homePage.clickAdicionarCocaCola();
        homePage.clickAdicionarFanta();
        homePage.clickAdicionarAgua();
        homePage.clickAbrirSeletorCategorias();
        homePage.clickSelecionarCategoriaTodos();
        homePage.clickAdicionarRissole();


        ScreenShot.captureScreenShot(driver, Path.URL+ Path.DESAFIO_2 + "_Home.png");

        homePage.clickAcessarCarrinho();
        ShopCartPage shopCartPage = new ShopCartPage(driver);
        shopCartPage.clickAumentarQuantidadeRissole();
        shopCartPage.clickAumentarQuantidadeRissole();
        shopCartPage.clickAumentarQuantidadeRissole();
        shopCartPage.clickAumentarQuantidadeRissole();
        shopCartPage.clickAumentarQuantidadeRissole();
        shopCartPage.clickAumentarQuantidadeRissole();
        shopCartPage.clickAumentarQuantidadeRissole();
        shopCartPage.clickAumentarQuantidadeRissole();


        ScreenShot.captureScreenShot(driver, Path.URL + Path.DESAFIO_2 + "_ShopCart_Apos_Adicionar_Rissole.png");

        shopCartPage.clickDiminuirQuantidadeRissole()
                .clickDiminuirQuantidadeRissole()
                .clickDiminuirQuantidadeRissole()
                .clickDiminuirQuantidadeRissole();


        ScreenShot.captureScreenShot(driver, Path.URL + Path.DESAFIO_2 + "_ShopCart_Apos_Retirada_de_Rissole.png");

        boolean validarValorTotal = driver.getPageSource().contains("36,00");
        assertTrue(validarValorTotal);
        shopCartPage.clickFinalizarCompra();
        boolean validarMensagemPedidoSucesso = driver.getPageSource().contains("Pedido realizado com sucesso!");
        assertTrue(validarMensagemPedidoSucesso);


        ScreenShot.captureScreenShot(driver, Path.URL + Path.DESAFIO_2 + "_Pedido_realizado_com_sucesso.png");

        shopCartPage.clickFecharMensagem();


    }


    @After
    public void tearDown() {
        driver.quit();
    }



}



