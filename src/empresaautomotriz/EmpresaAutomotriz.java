/*
 * 13.	Una empresa automotriz necesita un sistema para seleccionar
el tipo de carro (auto, SUV o camioneta) lo cual debe de aparecer 
en un menú, y el color (negro, blanco o rojo) en otro menú. 
Al final se necesita que despliegue la selección realizada. 
Nota. Debe de anidarse una estructura de selección múltiple dentro de otra.
 */
package empresaautomotriz;

import java.util.Scanner;

/**
 *josselyne ester chilito galindez 
 */
public class EmpresaAutomotriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       
        System.out.println("eliga el tipo de carro");
        System.out.println("______________________");
        System.out.println("1. para carro");
        System.out.println("2. para suv");
        System.out.println("3. caminoneta");
        System.out.println("________________________");
        
        int j1,j2;//variables para los switch
        String tipoA="a", color="a";//tipo de dato de cadena, no primitivo
        j1=entrada.nextInt();
        
        switch (j1){
            case 1: 
                tipoA="carro";
                System.out.println("elija el color del carro");
                System.out.println("________________________");
                System.out.println("1 para negro");
                System.out.println("2 para rojo ");
                System.out.println("para blanco");
                
                j2=entrada.nextInt();
                switch (j2){
                    case 1:
                        color ="negro";
                        break;
                    case 2:
                        color="rojo";
                        break;
                    case 3:
                        color="blanco";
                    default://de otro modo
                        System.out.println("selecciono un numero no adecuado");
                }                      
               break;//de otro modo
            case 2: 
                tipoA="suv";
                System.out.println("elija el color de la suv");
                System.out.println("________________________");
                System.out.println("1 para negro");
                System.out.println("2 para rojo ");
                System.out.println("para blanco");
                
                j2=entrada.nextInt();
                switch (j2){
                    case 1:
                        color="negro";
                        break;
                    case 2:
                        color="rojo";
                        break;
                    case 3:
                        color="blanco";
                    default:
                        System.out.println("selecciono un numero no adecuado");
                }        
            case 3:
                tipoA="camioneta";
                System.out.println("elija el color de la camioneta");
                System.out.println("________________________");
                System.out.println("1 para negro");
                System.out.println("2 para rojo ");
                System.out.println("para blanco"); 
                
                j2=entrada.nextInt();
                switch (j2){
                   
                    case 1:
                        color="negro";
                    case 2:
                        color="rojo";
                    case 3:
                        color="blanco";
                    default:
                       System.out.println("selecciono un numero no adecuado");}
        break;    
       default:System.out.println("seleciono un numero no adecuado");}        
        System.out.println("su tipo de auto es"+tipoA);
        System.out.println("su color de auto es"+color);
         
            
                
                        
                        
                        
                    
                
                    
                    
        
    }         
                
                
           
                        
               
                
               
                
                
        
                
            
            
}   
        
       
        
        
        
        
        
         
       
        
        
    
   
    
}
