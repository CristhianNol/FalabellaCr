package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import pageobjects.menuPage;
import pageobjects.tarjetaPage;

public class carritoDefinition {
    menuPage menu;
    tarjetaPage tarjeta;

    public carritoDefinition() {
        menu = new menuPage();
        tarjeta = new tarjetaPage();
    }

    @Dado("que la web esta operativa")
    public void queLaWebEstaOperativa() {
        hooks.driver.get("https://www.falabella.com.pe/falabella-pe");
    }

    @Cuando("se genera el número de tarjeta")
    public void seGeneraElNumeroDeTarjeta() {
        menu.clickGenerarTarjeta();
        menu.ventanaActiva();
        tarjeta.obtenerNroTarjeta();
        tarjeta.obtenerCVV();
        tarjeta.obtenerFecha();
        tarjeta.ventanaInicial();
    }

    @Cuando("se busque el producto {string}")
    public void seBusqueElProducto(String palabra) {
    menu.escribirPalabra(palabra);
    }

    @Y("se da click en buscar")
    public void seDaClickEnBuscar() {
        menu.clickBuscar();
    }

    @Y("ordenar los precios de mayor a menor")
    public void ordenarLosPreciosDeMayorAMenor() {
    menu.clickOrdenar();
    menu.clickOrdenar2();
    }
}
