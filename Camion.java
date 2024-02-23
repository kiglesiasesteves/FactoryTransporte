public class Camion implements IComun {

    public Camion() {
    }

    /**
     * @param cp
     * @return Float
     */
    @Override
    public Float costeTotal(int cp) {
        switch (cp) {
            case VIGO -> {
                return 7.5F;
            }
            case PONTEVEDRA -> {
                return 8.5F;
            }
            case VILAGARCIA -> {
                return 9.5F;
            }
            default -> {
                return null;
            }

        }
    }

    /**
     * @param x
     * @param y
     * @param z
     * @param peso
     * return Integer
     */

    @Override
    public Integer tipoEmbalaje(float x, float y, float z, float peso) {
        if (x > 1.5 && y > 1.5 && z > 1.5 && peso > 1.5) {
            return PALET;
        } else if (x < 1.5 && y < 1.5 && z < 1.5 && peso < 1.5) {
            return ENVOLTORIO_CARTON;
        } else {
            return CAJA_MADERA;
        }
    }
    }

