public class Main {

    /**
     * Clase de entrada
     * @param args
     */
    public static void main(String[] args) {
        llenarAgenda();
        Menu menu = new Menu();
        menu.showMenu();
    }

    /**
     * Método para llenar la agenda con contactos Random
     */
    public static void llenarAgenda(){
        Agenda.getContactos().add(new Contacto("Omar","123456789"));
        Agenda.getContactos().add(new Contacto("Felipe","7458212"));
        Agenda.getContactos().add(new Contacto("Juan","4521698"));
        Agenda.getContactos().add(new Contacto("Pepe","1459789"));
        Agenda.getContactos().add(new Contacto("Rosa","87451789"));
        Agenda.getContactos().add(new Contacto("Gabriel","545256789"));
    }

}
