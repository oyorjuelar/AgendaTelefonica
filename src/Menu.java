import java.util.Scanner;

/**
 * Clase que muestra el menu
 */
public class Menu {

    public Menu() {
    }

    
    
    /**
     * En este método se hace uso de DO While y Case
     */
    public void showMenu() {
     int response;

        do {
            System.out.println("---------------------------");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Editar contacto");
            System.out.println("4. Listar contactos");
            System.out.println("5. Limpiar Agenda");
            System.out.println("6. Salir");

            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();

            switch (response){
                case 1:
                    System.out.println("---> Ingrese nombre del contacto");
                    Scanner s = new Scanner(System.in);
                    String nombre = s.nextLine();
                    System.out.println("---> Ingrese numero del contacto");
                    Scanner s2 = new Scanner(System.in);
                    String numero = s2.nextLine();
                    Agenda.agregarContacto(nombre,numero);
                    System.out.println("---------------------------");
                    System.out.println("CONTACTO AGREGADO CON EXITO");
                    break;
                case 2:
                    int id;
                    Agenda.listarContactos();
                    System.out.println("---> Ingrese id del contacto a eliminar");
                    Scanner s3 = new Scanner(System.in);
                    id = s3.nextInt();
                    Agenda.borrarContacto(id);
                    System.out.println("---------------------------");
                    System.out.println("CONTACTO ELIMINADO");
                    break;
                case 3:
                    showMenuEditarContacto();
                    break;
                case 4:
                    System.out.println("---------------------------");
                    Agenda.listarContactos();
                    break;
                case 5:
                    System.out.println("---------------------------");
                    System.out.println("¿Seguro que quiere borrar todos los contactos?");
                    System.out.println("1. Sí");
                    System.out.println("2. No");
                    int op = 0;
                    Scanner c = new Scanner(System.in);
                    op = c.nextInt();
                    if (op==1){
                        Agenda.limpiarAgenda();
                        System.out.println("---------------------------");
                        System.out.println("AGENDA LIMPIADA");
                    }else {
                        System.out.println("---------------------------");
                        System.out.println("CANCELADO");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("---> Ingrese una opción válida");
                    break;
            }
        } while (response != 6);
    }

    /**
     * En este método se hace uso del ciclo while y condicional if
     *
     */
    public void showMenuEditarContacto(){

        System.out.println("---> Ingrese id de contacto a editar");
        Agenda.listarContactos();
        int id = 0;
        while (!(id<=Agenda.getContactos().size() && id > 0)) {
            System.out.println("---> Ingrese un id de contacto valido");
            Scanner sc = new Scanner(System.in);
            id = sc.nextInt();
        }

        int response;
        do{
            System.out.println("---------------------------");
            System.out.println("Seleccione una opcion");
            System.out.println("1. Modificar nombre");
            System.out.println("2. Modificar numero");
            System.out.println("3. Salir");
            Scanner sc2 = new Scanner(System.in);
            response = sc2.nextInt();

            switch (response){
                case 1:
                    String nNombre;
                    System.out.println("---> Ingrese nuevo nombre");
                    Scanner sc3 = new Scanner(System.in);
                    nNombre = sc3.nextLine();
                    Agenda.getContactos().get(id-1).setNombre(nNombre);
                    break;
                case 2:
                    String nNumero;
                    System.out.println("---> Ingrese nuevo numero");
                    Scanner sc4 = new Scanner(System.in);
                    nNumero = sc4.nextLine();
                    Agenda.getContactos().get(id-1).setNumero(nNumero);
                    break;
                case 3:
                    break;
            }

        }while(response!=3);
    }
}
