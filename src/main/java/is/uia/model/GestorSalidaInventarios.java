package is.uia.model;

import is.uia.model.SolicitudMaterial;

import java.util.Collection;

public class GestorSalidaInventarios {

    private Collection<SolicitudMaterial> solicitudes;

    public GestorSalidaInventarios() {
    }

    public GestorSalidaInventarios(Collection<SolicitudMaterial> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public Collection<SolicitudMaterial> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(Collection<SolicitudMaterial> solicitudes) {
        this.solicitudes = solicitudes;
    }

    @Override
    public String toString() {
        return "GestorSalidaInventarios{" +
                "solicitudes=" + solicitudes +
                '}';
    }
}
