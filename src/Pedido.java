public class Pedido {
    String id;
    String fecha;
    String cafe;
    String categoria;
    double total;

    public Pedido(String id, String fecha, String cafe, String categoria, double total) {
        this.id=id;
        this.fecha = fecha;
        this.cafe=cafe;
        this.categoria=categoria;
        this.total=total;

    }

    public String getCategoria() {
        return categoria;
    }

    public String getCafe() {
        return cafe;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id='" + id + '\'' +
                ", fecha='" + fecha + '\'' +
                ", cafe='" + cafe + '\'' +
                ", categoria='" + categoria + '\'' +
                ", total=" + total +
                '}';
    }
}



