
/**
 *
 * @author Fernando Alvarez
 */
public class FuncionesString {
   public void metodosCadena(String cadena){
        // Longitud de una cadena
        System.out.println(cadena.length());
        //Contar caracter en la ultima posicion
        System.out.println(cadena.charAt(cadena.length()-1));
        //Contar cuantos caracteres a hay
        System.out.println("o    :" + contarCaracteres(cadena, 'o'));
        System.out.println("O    :" + contarCaracteres(cadena, 'O'));
        System.out.println("o y O:" + (contarCaracteres(cadena, 'o') + contarCaracteres(cadena, 'O')));
               
    } 
    public int contarCaracteres(String cad, char c){
        int can = 0, cont = 0;
        while (cont < cad.length()){
            can=(cad.charAt(cont) == c)?++can:can;
            cont++;
        }
        return can;
    }
    
    public int contarCaracteresMayMin(String cad, char c){
        int can = 0, cont = 0;
        c = (c + "").toUpperCase().charAt(0); 
        while (cont < cad.length()){
            can=(cad.charAt(cont) == convertirCharMayus (c)) ? ++can : can;
            cont++;
        }
        return can;
    }
 public char convertirCharMayus(char c){
    return c = (c + "").toUpperCase().charAt(0);
 }   
}
