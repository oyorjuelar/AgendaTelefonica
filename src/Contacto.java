    /**
     * Clase anidada contacto para la creación de objetos contacto
     */
    public class Contacto{

        private String nombre;
        private String numero;
        public static int id =0;
        private int idU;

        public Contacto(String nombre, String numero) {
            id++;
            this.idU = id;
            this.nombre = nombre;
            this.numero = numero;
        }

        public void setIdU(int idU) {
            this.idU = idU;
        }

        @Override
        public String toString() {
            return this.idU + "     " + this.nombre + "     " + this.numero;
        }


        public void setNombre(String nombre) {
            this.nombre = nombre;
        }


        public void setNumero(String numero) {
            this.numero = numero;
        }
    }