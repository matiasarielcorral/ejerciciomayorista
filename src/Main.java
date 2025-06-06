import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        // venta a por mayor
        // menos de 5 paquetes NO VENDE
        // entre 5 a 15 paquetes envio 10usd
        // mas de 15 envio gratis

        int cantidadPaquetes;
        double precioPaquetes = 100.0;
        double valoraPagar, costoEnvio;
        double descuentoPaquete = 0.05;
        Scanner ingresapaquetes = new Scanner(System.in);


        System.out.println("Bievenido a la compra de paquetes al por mayor" + System.lineSeparator() +
                "Cada Paquete tiene un costo de: " + precioPaquetes + " Usd" + System.lineSeparator()+
                "Ingrese cantidad de paquetes a comprar: ");
        cantidadPaquetes = ingresapaquetes.nextInt();

        if (cantidadPaquetes < 5)
        {

            if (cantidadPaquetes <0)
            {
                System.out.println("No se pueden ingresar valores negativos");
            }
            else
            {
                System.out.println("No se realizan ventas por menos de 5 paquetes");
            }

        }
        else
          {
            if (cantidadPaquetes <= 15)
            {
                System.out.println("El envio tiene un costo de 10 usd");
                costoEnvio = 10;
            }
            else
            {
            System.out.println("El envio no tiene costo");
            costoEnvio = 0;
            }
            double subtotal =  precioPaquetes*cantidadPaquetes;
            valoraPagar = subtotal + costoEnvio;
              System.out.println("Resumen de su compra: " + System.lineSeparator() +
                      "Subtotal a pagar: " + subtotal + " Usd" +  System.lineSeparator() +
                      "Costo de envio: " + costoEnvio + " Usd"+ System.lineSeparator() +
                      "Total a pagar: " + valoraPagar + " Usd");
          }
        }
    }