public interface IComun {
    public static final int PALET = 0;
    public static final int ENVOLTORIO_CARTON = 1;
    public static final int CAJA_MADERA = 2;

    public static final int VIGO = 4;
    public static final int PONTEVEDRA = 5;
    public static final int VILAGARCIA = 6;
    /**
     * @param cp
     */
    public Float costeTotal(int cp);

    /**
     * @param x
     * @param y
     * @param z
     * @param peso
     */
    public Integer tipoEmbalaje(float x, float y, float z, float peso);
    }


