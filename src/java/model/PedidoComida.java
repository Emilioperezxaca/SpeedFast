package model;

public class PedidoComida extends Pedido {

    public PedidoComida(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Comida");
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor con mochila térmica para el pedido de comida #" + idPedido);
    }

    // Sobrecarga
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Asignando a " + nombreRepartidor + " (con mochila térmica) para el pedido de comida #" + idPedido);
    }
}

