package model;

public class PedidoExpress extends Pedido {

    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public double calcularTiempoEntrega() {
        double tiempo = 10; // 10 min base
        if (distanciaKm > 5) {
            tiempo += 5; // Extra si supera 5 km
        }
        return tiempo;
    }
}

