package model;

public class PedidoEncomienda extends Pedido {
    private double peso;
    private boolean embalajeCorrecto;

    public PedidoEncomienda(int idPedido, String direccionEntrega, double peso, boolean embalajeCorrecto) {
        super(idPedido, direccionEntrega, "Encomienda");
        this.peso = peso;
        this.embalajeCorrecto = embalajeCorrecto;
    }

    @Override
    public void asignarRepartidor() {
        if (peso <= 10 && embalajeCorrecto) {
            System.out.println("Asignando repartidor para encomienda válida #" + idPedido);
        } else {
            System.out.println("No se puede asignar repartidor. Encomienda inválida #" + idPedido);
        }
    }

    // Sobrecarga
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        if (peso <= 10 && embalajeCorrecto) {
            System.out.println("Asignando a " + nombreRepartidor + " para encomienda válida #" + idPedido);
        } else {
            System.out.println("No se puede asignar a " + nombreRepartidor + ". Encomienda inválida #" + idPedido);
        }
    }
}

