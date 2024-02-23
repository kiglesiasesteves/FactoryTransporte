    public class TransporteFactory {
        public static final int CAMION = 1;
        public static final int BICICLETA = 2;
 /**
     * Devuelve producto del tipo de la Interface
     * @param tipo 1: consola, 2:ventana
     * @return producto segun el tipo
     */
        public static IComun getTransporte(int tipo) {
            return switch (tipo) {
                case CAMION ->  new Camion();
                case BICICLETA -> new Bicicleta();
                default -> null;
            };
        }

    }


