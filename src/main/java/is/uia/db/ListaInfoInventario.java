package is.uia.db;

import java.util.List;

public class ListaInfoInventario {
    private String name;
    private String id;
    private List<InfoInventarioUIA> lista;

    public ListaInfoInventario() {
    }

    public ListaInfoInventario(String name, String id,
                               List<InfoInventarioUIA> lista) {
        this.name = name;
        this.id = id;
        this.lista = lista;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<InfoInventarioUIA> getLista() {
        return lista;
    }

    public void setLista(List<InfoInventarioUIA> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "ListaInfoInventario{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", lista=" + lista +
                '}';
    }
}
