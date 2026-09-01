package model;

import interfaces.*;

public class PedidoEncomienda extends Pedido implements Despachable, Cancelable, Rastreable {
    private double peso;

    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm, double peso) {
        super(idPedido, direccionEntrega, distanciaKm);
        this.peso = peso;
    }

    @Override
    public double calcularTiempoEntrega() {
        return Math.round(20 + (1.5 * distanciaKm));
    }

    @Override
    public void asignarRepartidor() {
        this.repartidor = "Repartidor Encomienda";
        System.out.println("Asignado repartidor especializado en encomiendas.");
    }

    @Override
    public void despachar() {
        System.out.println("Despachando encomienda con embalaje seguro...");
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido de encomienda #" + idPedido + " cancelado.");
    }

    @Override
    public void verHistorial() {
        System.out.println("Historial: Encomienda entregada en 2026.");
    }
}
