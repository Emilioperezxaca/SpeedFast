package model;

import interfaces.*;

public class PedidoExpress extends Pedido implements Despachable, Cancelable, Rastreable {

    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public double calcularTiempoEntrega() {
        return distanciaKm > 5 ? (10 + 5) : 10;
    }

    @Override
    public void asignarRepartidor() {
        this.repartidor = "Repartidor Express";
        System.out.println("Asignado repartidor más cercano disponible.");
    }

    @Override
    public void despachar() {
        System.out.println("Despachando pedido express...");
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido express #" + idPedido + " cancelado.");
    }

    @Override
    public void verHistorial() {
        System.out.println("Historial: Pedido express entregado en 2026.");
    }
}
