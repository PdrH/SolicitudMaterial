package is.uia;

import is.uia.interfaces.Imenu;
import is.uia.model.Menu;
import is.uia.model.RegistroItem;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

class MenuTest {
    static Scanner scanner = new Scanner(System.in);
    Imenu imenu = new Menu();
    @org.junit.jupiter.api.Test
    public int menu(){
        imenu.menu();

        return 0;
    }

    @Test
    public void menuLlenarSolicitudMaterial() {
        List<RegistroItem> items;
        Menu menu = new Menu();
        items=menu.addItem();
       assertEquals(1,items.size());
    }


}