package model;

import interfaces.*;

public class PedidoComida extends Pedido implements Despachable, Cancelable, Rastreable {

    public PedidoComida(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public double calcularTiempoEntrega() {
        return 15 + (2 * distanciaKm);
    }

    @Override
    public void asignarRepartidor() {
        this.repartidor = "Repartidor Comida";
        System.out.println("Asignado repartidor especializado en comida.");
    }

    @Override
    public void despachar() {
        System.out.println("Despachando comida con mochila térmica...");
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido de comida #" + idPedido + " cancelado.");
    }

    @Override
    public void verHistorial() {
        System.out.println("Historial: Pedido de comida entregado en 2026.");
    }
}
