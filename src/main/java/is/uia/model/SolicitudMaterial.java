package is.uia.model;

import is.uia.db.InfoInventarioUIA;
import is.uia.db.ListaInfoInventario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.List;

public class SolicitudMaterial extends ListaInfoInventario {

    private String solicitante;
    private String idSolicitante;
    private String id;

    private Collection<RegistroItem> items;
    private String status;
    private LocalDate date = LocalDate.now();
    private final DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private final String fecha = date.format(formatters);

    public SolicitudMaterial() {
    }


    public SolicitudMaterial(String name, String id,
                             List<InfoInventarioUIA> lista,
                             String solicitante, String idSolicitante,
                             String id1, Collection<RegistroItem> items,
                             String status) {
        super(name, id, lista);
        this.solicitante = solicitante;
        this.idSolicitante = idSolicitante;
        this.id = id1;
        this.items = items;
        this.status = status;

    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(String idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }


    public Collection<RegistroItem> getItems() {
        return items;
    }

    public void setItems(Collection<RegistroItem> items) {
        this.items = items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SolicitudMaterial{" +
                "solicitante='" + solicitante + '\'' +
                ", idSolicitante='" + idSolicitante + '\'' +
                ", id='" + id + '\'' +
                ", fecha='" + fecha + '\'' +
                ", items=" + items +
                ", status='" + status + '\'' +
                '}';
    }
}
