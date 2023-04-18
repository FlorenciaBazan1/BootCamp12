package vista;

import modelo.Producto;

public class Aplication {

    public static void main(String[] args) {

        Producto producto = new Producto();

        producto.codigo = "123ABC";
        producto.stock = 100;

        System.out.println("Codigo producto: "+ producto.codigo);
        System.out.println("Stock del Producto: " + producto.stock);
    }

}
