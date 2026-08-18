package model;

public class Pedido {
    protected int idPedido;
    protected String direccionEntrega;
    protected String tipoPedido;

    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    // Versión genérica
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor genérico para el pedido #" + idPedido);
    }

    // Sobrecarga con nombre
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Asignando repartidor " + nombreRepartidor + " para el pedido genérico #" + idPedido);
    }

    @Override
    public String toString() {
        return "Pedido #" + idPedido + " - Tipo: " + tipoPedido + " - Dirección: " + direccionEntrega;
    }
}
