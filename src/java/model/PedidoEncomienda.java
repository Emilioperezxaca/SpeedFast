package model;

public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public double calcularTiempoEntrega() {
        double tiempo = 20 + (1.5 * distanciaKm); // 20 min base + 1.5 min por km
        return Math.round(tiempo); // Ajustar a entero
    }
}

