import java.util.ArrayList;
import java.util.List;

public class HistorialPedidos implements Agregado{
    List<Pedido> pedidos = new ArrayList<>();

    public void AgregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    @Override
    public Iterador crearIterator(String categoria) {
        return new IteradorCategoria(pedidos, categoria);
    }
}
