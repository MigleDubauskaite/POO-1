
package figurageometricanavidad;


public class Color {
    
    private static String [] colores = {"negro", "amarillo", "rosa", "azul", "verde"};
    
    protected static String colorValido (String colorPosible){
        for (String color : colores) {
            if(color.equalsIgnoreCase(colorPosible)){
                return color;
            }
        }
        return colores [0];
    }
}
