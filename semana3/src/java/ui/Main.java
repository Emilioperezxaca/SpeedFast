package ui;

import model.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pedido> historial = new ArrayList<>();

        Pedido comida = new PedidoComida(1, "Av. Central 123", 3.0);
        Pedido encomienda = new PedidoEncomienda(2, "Calle Norte 456", 8.0, 4.5);
        Pedido express = new PedidoExpress(3, "Plaza Sur 789", 6.0);

        // Asignación automática
        comida.asignarRepartidor();
        encomienda.asignarRepartidor();
        express.asignarRepartidor();

        // Asignación manual
        comida.asignarRepartidor("Carlos");

        // Mostrar resumen
        comida.mostrarResumen();
        encomienda.mostrarResumen();
        express.mostrarResumen();

        // Calcular tiempos
        System.out.println("Tiempo comida: " + comida.calcularTiempoEntrega() + " min");
        System.out.println("Tiempo encomienda: " + encomienda.calcularTiempoEntrega() + " min");
        System.out.println("Tiempo express: " + express.calcularTiempoEntrega() + " min");

        // Operaciones
        ((PedidoComida) comida).despachar();
        ((PedidoEncomienda) encomienda).cancelar();
        ((PedidoExpress) express).verHistorial();

        // Guardar historial
        historial.add(comida);
        historial.add(encomienda);
        historial.add(express);

        System.out.println("\n=== HISTORIAL DE ENTREGAS ===");
        for (Pedido p : historial) {
            p.mostrarResumen();
        }
    }
}
