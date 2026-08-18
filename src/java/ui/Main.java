package ui;

import model.*;

public class Main {
    public static void main(String[] args) {
        Pedido p1 = new PedidoComida(1, "Av. Principal 123");
        Pedido p2 = new PedidoEncomienda(2, "Calle Secundaria 456", 5.0, true);
        Pedido p3 = new PedidoExpress(3, "Av. Libertad 789");

        System.out.println("=== PRUEBA DE POLIMORFISMO Y SOBRECARGA ===");

        // Versión sobrescrita
        p1.asignarRepartidor();
        p2.asignarRepartidor();
        p3.asignarRepartidor();

        System.out.println("\n--- Usando sobrecarga con nombre ---");

        // Versión sobrecargada
        p1.asignarRepartidor("Carlos");
        p2.asignarRepartidor("María");
        p3.asignarRepartidor("José");
    }
}

