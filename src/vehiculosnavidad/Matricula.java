
package vehiculosnavidad;


public class Matricula {
    
    public static boolean matriculaValida (String matricula){
        if(matricula == null){
            return false;
        }
        //Longitud entre 4 y 8
        if(matricula.length() > 8 || matricula.length() < 4){
            return false;
        }
        //Que los 4 primeros caracteres sean letras
        for (int i = 0; i < 4; i++) {
            if(!(matricula.charAt(i) >= 'a' && matricula.charAt(i) <= 'z' || 
                    matricula.charAt(i) >= 'A' && matricula.charAt(i) <= 'Z')){
                return false;
            } 
            
        }
        //Que los demás caracteres sean números
        for (int i = 4 ; i < matricula.length(); i++){
            if(!(matricula.charAt(i) >= '0' && matricula.charAt(i)<= '9')){
                return false;
            }  
        }
        return true;
    }
}
