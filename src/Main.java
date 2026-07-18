public class Main {
    static void main() {
        Cliente cliente = new Cliente("Pablo");
        cliente.getHistorial().AgregarPedido(new Pedido("1","2026-07-10", "Latte","Expresso", 12.5));
        cliente.getHistorial().AgregarPedido(new Pedido("2","2026-07-12", "Capuccino","Expresso",13.20));

        cliente.verPedidosPorCategoria("Expresso");


}
}
