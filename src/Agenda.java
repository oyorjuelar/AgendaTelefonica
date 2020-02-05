import java.util.ArrayList;

/**
 * Clase donde se almacenarán los contactos y métodos estáticos
 */
public class Agenda {


    private static ArrayList<Contacto> contactos = new ArrayList<Contacto>();

    public static ArrayList<Contacto> getContactos() {
        return contactos;
    }


    public static void agregarContacto(String nombre, String numero){
        contactos.add(new Contacto(nombre,numero));
    }

    /**
     * En este método se hace uso del ciclo for
     */
    public static void borrarContacto(int idBorrar){
        contactos.remove(idBorrar-1);
        Contacto.id=contactos.size();
        for (int i = idBorrar-1; i < contactos.size(); i++) {
            contactos.get(i).setIdU(i+1);
        }
    }

    public static void listarContactos(){
        System.out.println("Id     Nombre     Numero");
        for (Contacto n: contactos) {
            System.out.println(n.toString());
        }
    }

    public static void limpiarAgenda(){
        contactos.clear();
        Contacto.id = 0;
    }



}
