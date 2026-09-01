# SpeedFast 🚀

Sistema de reparto a domicilio que gestiona tres tipos de pedidos:
- **Comida (restaurantes)** → requiere repartidor con mochila térmica.
- **Encomienda (documentos o paquetes)** → requiere validación de peso y embalaje.
- **Compra Express (supermercado o farmacia)** → se asigna al repartidor más cercano y disponible.

## 📂 Estructura del proyecto
SpeedFast/
├── src/
│    ├── model/
│    │    ├── Pedido.java
│    │    ├── PedidoComida.java
│    │    ├── PedidoEncomienda.java
│    │    └── PedidoExpress.java
│    └── ui/
│         └── Main.java
└── README.md
Se ejecuta desde carpeta ui 

Semana 2... ocupa las mismas clases y se ejecuta de la misma forma.


# Semana 3 - SpeedFast 🚀

## 📌 Objetivo
Implementar un sistema de gestión de pedidos con:
- Polimorfismo: clase base `Pedido` y subclases (`PedidoComida`, `PedidoEncomienda`, `PedidoExpress`).
- Abstracción: métodos comunes y abstractos en `Pedido`.
- Interfaces: `Despachable`, `Cancelable`, `Rastreable`.

---

## 📂 Estructura
semana3/
└── src/
└── java/
├── model/
│    ├── Pedido.java
│    ├── PedidoComida.java
│    ├── PedidoEncomienda.java
│    └── PedidoExpress.java
├── interfaces/
│    ├── Despachable.java
│    ├── Cancelable.java
│    └── Rastreable.java
└── ui/
└── Main.java

Ejecutar desde MAIN...
