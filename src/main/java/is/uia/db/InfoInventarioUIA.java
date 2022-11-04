package is.uia.db;

public class InfoInventarioUIA {
    private String cantidad;
    private String categoria;
    private String partida;
    private String subpartida;
    private String estatus;

    public InfoInventarioUIA() {
    }

    public InfoInventarioUIA(String cantidad, String categoria,
                             String partida, String subpartida,
                             String estatus) {
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.partida = partida;
        this.subpartida = subpartida;
        this.estatus = estatus;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getSubpartida() {
        return subpartida;
    }

    public void setSubpartida(String subpartida) {
        this.subpartida = subpartida;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "InfoInventarioUIA{" +
                "cantidad='" + cantidad + '\'' +
                ", categoria='" + categoria + '\'' +
                ", partida='" + partida + '\'' +
                ", subpartida='" + subpartida + '\'' +
                ", estatus='" + estatus + '\'' +
                '}';
    }
}
