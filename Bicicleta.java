public class Bicicleta implements IComun {
    public Bicicleta() {
    }

    /**
     * @param cp
     * return Float
     */
    @Override
    public Float costeTotal(int cp) {
        switch (cp) {
            case VIGO -> {
                return 4.5F;
            }
            case PONTEVEDRA -> {
                return 6.5F;
            }
            case VILAGARCIA -> {
                return 5.5F;
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
     * @return
     */
    @Override
    public Integer tipoEmbalaje(float x, float y, float z, float peso) {
        if (x > 1.5 && y > 1.5 && z > 1.5 && peso > 1.5) {
            return PALET;
        } else  {
            return ENVOLTORIO_CARTON;
        }
    }
}

