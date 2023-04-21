package vista;

import modelo.Hombre;
import modelo.Mujer;
import modelo.Deportivo;
import modelo.Producto;

public class Aplication {

    public static void main(String[] args) {

        Deportivo deportivo = new Deportivo("Fin de semana", 44, new Producto("123ABC", 100,10000), "Futbol", "Cuero" );

        Hombre hombre = new Hombre("Semana", 44, new Producto("456DEF", 10, 20000), "Verde", "Cuero");

        Mujer mujer = new Mujer("Semana", 39, new Producto("456DEF", 10, 15000), "Negro", "Cuero",8);

        System.out.println("El impuesto especifico del calzado de Hombre es: "+ hombre.impuestoEspecifico());

        System.out.println("El impuesto especifico del calzado de Mujer es: "+ mujer.impuestoEspecifico());

        System.out.println("El descuento del calzado de color verde de hombre es: "+ hombre.descuento());

        System.out.println("El valor de la venta del calzado deportivo durante la"+ deportivo.getDiaVenta()+
                "es: $"+ deportivo.valorVenta());

        System.out.println("El valor del impuesto IVA del calzado deportivo es: "+ deportivo.ImpuestoIva());

    }

}
