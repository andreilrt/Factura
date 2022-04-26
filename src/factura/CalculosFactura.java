package factura;

import java.util.Scanner;

public class CalculosFactura {

    private Scanner Input;
    private double TotalPagar;
    private Factura ObjFactura;

    public CalculosFactura() {
        Input = new Scanner(System.in);
        TotalPagar = 0;
        ObjFactura = new Factura();
    }

    public void Leer() {
        System.out.print("Ingrese el precio de su producto: ");
        this.ObjFactura.setPrecio(this.Input.nextDouble());
        System.out.print("Ingrese la cantidad de su producto: ");
        this.ObjFactura.setCantidad(this.Input.nextDouble());
    }

    public double getTotalPagar() {
        return TotalPagar;
    }

    public void setTotalPagar(double TotalPagar) {
        this.TotalPagar = TotalPagar;
    }

    public void Resultado() {
        boolean Control = true;
        while (Control) {
            this.Leer();
            this.setTotalPagar(this.ObjFactura.CalcularVenta());
            System.out.println("El precio total de su factura es: " + this.getTotalPagar());
            System.out.println("Quiere realizar otra factura? S/N");
            char R=' ';
            R=this.Input.next().charAt(0);
            if(R=='s'||R=='S'){
                System.out.println(" ");
                Control=true;
            }
            else{
                System.out.println("Programa Finalizado");
                Control=false;
            }
        }
    }
}
