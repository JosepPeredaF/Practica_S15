public class Cliente {
    String nombre;
    HistorialPedidos historial = new HistorialPedidos();

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public HistorialPedidos getHistorial() {
        return historial;
    }

    public void verPedidosPorCategoria(String categoria){
        Iterador it = historial.crearIterator(categoria);
        System.out.println("Pedidos de " + nombre + " en categoria " + categoria + " :");
        while (it.hasNext()){
            System.out.println(" - " + it.next());
        }

    }
}
