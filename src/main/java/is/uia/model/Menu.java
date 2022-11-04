package is.uia.model;

import is.uia.interfaces.Imenu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu implements Imenu {

    private static Scanner scanner = new Scanner(System.in);

    @Override
    public int menu() {
/*
Aqui hacemos un primer menu principal para poder navegar
 */
        System.out.println("1.- Solicitud Material.");
        System.out.println("2.- Entrega de material.");
        System.out.println("3.- Baja de inventario");
        System.out.println("4.-Salir.");

        return scanner.nextInt();


    }

    @Override
    public int subMenu() {
        /*
        submenu
         */

        System.out.println("1.- Nueva solicitud Material.");
        System.out.println("2.- Apartado de solicitud material.");
        System.out.println("3.- Salir");

        return scanner.nextInt();
    }


    public List<RegistroItem> addItem() {
        List<RegistroItem> itemList = new ArrayList<>();
        String respuesta;

        do {

            System.out.println("Dame el nombre del item");

            RegistroItem registroItem = new RegistroItem(scanner.nextLine());
            itemList.add(registroItem);
            System.out.println("Deseas agregar otro item a la lista? Y/N");
            respuesta = scanner.nextLine();
        } while (respuesta.toLowerCase().matches("y"));


        return itemList;
    }

    @Override
    public List<SolicitudMaterial> addMaterial() {
        List<SolicitudMaterial> materialList = new ArrayList<>();
        String respuesta;


        do {

            SolicitudMaterial solicitudMaterial = new SolicitudMaterial();
            scanner.nextLine();//esto es para cachar el enter
            System.out.println("Registra el nombre del solicitante.");
            solicitudMaterial.setSolicitante(scanner.nextLine());
            System.out.println("Registra el id del solicitante.");
            solicitudMaterial.setIdSolicitante(scanner.nextLine());
            System.out.println("La fecha registrada es: ");
            System.out.println(solicitudMaterial.getFecha());
            System.out.println("Registra el status de la solicitud.");
            solicitudMaterial.setStatus(scanner.nextLine());
            System.out.println("Registra el id de la solicitud.");
            solicitudMaterial.setId(scanner.nextLine());
            System.out.println("Registra los items");
            solicitudMaterial.setItems(addItem());
            materialList.add(solicitudMaterial);
            System.out.println("Deseas agregar otra solicitud a la lista? Y/N");
            respuesta = scanner.nextLine();


        } while (respuesta.toLowerCase().matches("y"));


        return materialList;
    }


}
