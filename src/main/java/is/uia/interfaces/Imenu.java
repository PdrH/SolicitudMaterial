package is.uia.interfaces;

import is.uia.model.SolicitudMaterial;

import java.util.List;

public interface Imenu {

    int menu();
    int subMenu();

    public List<SolicitudMaterial> addMaterial();

}
