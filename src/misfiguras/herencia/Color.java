
package misfiguras.herencia;


public class Color {
     //String es un OBJETO
    //static que solo haya un array de colores --> SOLO ESTA UNA VEZ POR CLASE
    //private static String[] colores = new String[11];
    private static String[] colores = {"negro","azul", "marrón", "gris", "verde", 
        "naranja","rosa","púrpura", "rojo", "blanco", "amarillo"};

    public static String [] listaColores (){
        return colores;
    }

    public static String dameColor (String colorTentativo){
        for (String color : colores) {
            if (color.equalsIgnoreCase(colorTentativo)){
                return color;
            }
            
        }
        return colores [0];
    }

}
