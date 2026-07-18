import java.util.List;

public class IteradorCategoria implements Iterador {
List<Pedido> pedidos;
String categoria;
int posicion=0;

    public IteradorCategoria(List<Pedido> pedidos, String categoria) {
        this.pedidos = pedidos;
        this.categoria= categoria;
    }

    @Override
    public boolean hasNext() {
        while (posicion < pedidos.size()){
            if (pedidos.get(posicion).getCategoria().equalsIgnoreCase(categoria)){
                return true;
            }
            posicion++;
        }
        return false;
    }

    @Override
    public Pedido next() {
        return pedidos.get(posicion++);
    }
}
