package factura;

public class Factura {

    private double Cantidad;
    private double Precio;

    public Factura() {
        Cantidad = 0;
        Precio = 0;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public double CalcularVenta() {
        double Subtotal = this.getCantidad() * this.getPrecio();
        double Iva = Subtotal * 0.17;
        double Total = Subtotal - Iva;
        return Total;
    }
}
