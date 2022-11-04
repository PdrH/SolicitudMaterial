package is.uia;

import is.uia.interfaces.Imenu;
import is.uia.model.GestorSalidaInventarios;
import is.uia.model.Menu;
import is.uia.model.SolicitudMaterial;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMismatchException {
        Imenu miMenu = new Menu();
        GestorSalidaInventarios gestor = new GestorSalidaInventarios();
        SolicitudMaterial material;

        int opcion;

        do {

            switch (opcion = miMenu.menu()) {

                case 1:
                    try {
                        do {
                            switch (opcion = miMenu.subMenu()) {

                                case 1:



                                    gestor.setSolicitudes(miMenu.addMaterial());
                                    System.out.println(gestor.getSolicitudes());

                                    System.out.println("subnivel 1");
                                    break;
                                case 2:
                                    System.out.println("subnivel 2");
                                    break;
                                case 3:
                                    System.out.println("subnivel 3");
                                    break;
                                default:
                                    System.out.println("subnivel 1");
                                    break;
                            }
                        } while (opcion != 3);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("sapbe 2");
                    break;
                case 3:
                    System.out.println("sapbe 3");
                    break;
                case 4:
                    System.out.println("sapbe 4");
                    break;
                default:
                    System.out.println("sapbe 5");
                    break;


            }

        } while (miMenu.menu() != 4);

    }
}