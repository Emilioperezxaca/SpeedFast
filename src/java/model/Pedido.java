package model;

public abstract class Pedido {
    // 🔹 Atributos comunes
    protected int idPedido;
    protected String direccionEntrega;
    protected double distanciaKm;

    // 🔹 Constructor
    public Pedido(int idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    // 🔹 Método implementado
    public void mostrarResumen() {
        System.out.println("Pedido #" + idPedido +
                " - Dirección: " + direccionEntrega +
                " - Distancia: " + distanciaKm + " km");
    }

    // 🔹 Método abstracto (cada subclase lo implementará distinto)
    public abstract double calcularTiempoEntrega();
}
