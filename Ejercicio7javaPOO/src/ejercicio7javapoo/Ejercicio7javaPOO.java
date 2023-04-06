
package ejercicio7javapoo;





import Entidad.Persona;
import Servicios.serviciosPersona;

public class Ejercicio7javaPOO {

  
    public static void main(String[] args) {
        serviciosPersona sP = new serviciosPersona();

        Persona[] personas = new Persona[4];
        double sumaME = 0;
        double sumame = 0;
        double sumapesm = 0;
        double sumapesI = 0;
        double sumapesM = 0;
        for (int i = 0; i < 4; i++) {
            personas[i] = sP.crearPersona();
 
            if (personas[i].getPeso() / Math.pow(personas[i].getAltura(), 2) < 20) {
                sumapesm++;
            }
            if (personas[i].getPeso() / Math.pow(personas[i].getAltura(), 2)>= 20 && personas[i].getPeso() / Math.pow(personas[i].getAltura(), 2) <= 25) {
                sumapesI++;
            }
            if (personas[i].getPeso() / Math.pow(personas[i].getAltura(), 2)> 25) {
                sumapesM++;
            }
            if (personas[i].getEdad() >= 18) {
                sumaME++;
            } else if (personas[i].getEdad() < 18) {
                sumame++;
            }
        }
        double porcPesm=sumapesm/4*100;
        System.out.println("El porcentaje de personas con peso menor es: "+porcPesm+"%");
        double porcPesI=sumapesI/4*100;
        System.out.println("El porcentaje de personas con peso ideal es: "+porcPesI+"%");
        double porcPesM=sumapesM/4*100;
        System.out.println("El porcentaje de personas con peso mayor es: "+porcPesM+"%");
        double porcEdadM = sumaME / 4 * 100;
        System.out.println("El porcentaje de personas con edad mayor es: " + porcEdadM + "%");
        double porcEdadm = sumame / 4 * 100;
        System.out.println("El porcentaje de personas con edad menor es: " + porcEdadm + "%");
    }
}


        
    



