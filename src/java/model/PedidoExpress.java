package model;

public class PedidoExpress extends Pedido {

    public PedidoExpress(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Compra Express");
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor más cercano y disponible para pedido express #" + idPedido);
    }

    // Sobrecarga
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Asignando a " + nombreRepartidor + " (más cercano y disponible) para pedido express #" + idPedido);
    }
}

