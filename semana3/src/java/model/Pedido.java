package model;

public abstract class Pedido {
    protected int idPedido;
    protected String direccionEntrega;
    protected double distanciaKm;
    protected String repartidor;

    public Pedido(int idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    public void mostrarResumen() {
        System.out.println("Pedido #" + idPedido + " | Dirección: " + direccionEntrega +
                " | Distancia: " + distanciaKm + " km | Repartidor: " + repartidor);
    }

    // Polimorfismo: cada subclase implementa su propia lógica
    public abstract double calcularTiempoEntrega();

    // Método sobrescrito en subclases
    public abstract void asignarRepartidor();

    // Sobrecarga: asignación manual
    public void asignarRepartidor(String nombre) {
        this.repartidor = nombre;
        System.out.println("Repartidor asignado manualmente: " + nombre);
    }
}
