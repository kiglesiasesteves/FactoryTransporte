public class App {
    static IComun transporte;
    public static void main(String[] args) {
       transporte = TransporteFactory.getTransporte(TransporteFactory.CAMION);
        if ( transporte!= null) {

            float costeTotalCamion = transporte.costeTotal(5);
            int tipoEmbalajeCamion = transporte.tipoEmbalaje(1.5f, 2.0f, 1.0f, 50f);

            System.out.println("Coste total de la carga del camión: " + costeTotalCamion+"Є");
            System.out.println("Tipo de embalaje para el camión: " + tipoEmbalajeCamion);
        } else {
            System.out.println("No se pudo crear el camión.");
        }
    }
}
