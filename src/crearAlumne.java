import java.util.Iterator;
import java.util.Scanner;

public class crearAlumne extends main{
    static void crearAlumne(Scanner input) {
        boolean errorComprobacio = false;

        System.out.println("Escriu el DNI del Alumne: ");
        String DNIAlum = input.nextLine();

        //Comproba numero de caracters
        if (DNIAlum.length() < 9 || DNIAlum.length() >= 10) {
            System.out.println("DNI INVALID");
            return;
        }

        //Comproba el valor duplicat
        Iterator<Persona> itComprobaDNI = alumnes.iterator();
        while (itComprobaDNI.hasNext()) {
            Alumne alum = (Alumne) itComprobaDNI.next();
            if (DNIAlum.equals(alum.getDni())) {
                System.out.println("EL DNI " + DNIAlum + " ya existeix!");
                errorComprobacio = true;
                break;
            }
        }

        if (errorComprobacio) {
            return;
        }

        System.out.println("Escriu el nom del Alumne: ");
        String nomAlum = input.nextLine();

        //Comproba que el string no estigui buit
        if (nomAlum.isEmpty()) {
            System.out.println("El nom no pot estar buit");
            errorComprobacio = true;
            return;
        }

        if (errorComprobacio) {
            return;
        }

        System.out.println("Escriu el cognom del Alumne: ");
        String cognomAlum = input.nextLine();

        //Comproba que el string no estigui buit
        if (cognomAlum.isEmpty()) {
            System.out.println("El cognom no pot estar buit");
            errorComprobacio = true;
            return;
        }

        if (errorComprobacio) {
            return;
        }

        System.out.println("Escriu el email del Alumne: ");
        String emailAlum = input.nextLine();

        //Comproba el valor duplicat
        Iterator<Persona> itComprobaMAIL = alumnes.iterator();
        while (itComprobaMAIL.hasNext()) {
            Alumne alum = (Alumne) itComprobaMAIL.next();
            if (emailAlum.equals(alum.getEmail())) {
                System.out.println("EL correu electronic " + emailAlum + " ya existeix!");
                errorComprobacio = true;
                break;
            }
        }

        if (errorComprobacio) {
            return;
        }

        System.out.println("Escriu el id del Alumne: ");
        Integer idAlum = input.nextInt();

        //Comproba ID valor
        if (idAlum <= 0 || idAlum >= 1000) {
            System.out.println("ID Invalida! Escriu un numero del 1 al 999");
            return;
        }

        //Comproba el valor duplicat
        Iterator<Persona> itComprobaID = alumnes.iterator();
        while (itComprobaID.hasNext()) {
            Alumne alum = (Alumne) itComprobaID.next();
            if (idAlum.equals(alum.getIdAlumno())) {
                System.out.println("La ID " + idAlum + " ya existeix!");
                errorComprobacio = true;
                break;
            }
        }

        if (errorComprobacio) {
            return;
        }
        input.nextLine(); // Per netejar el buffer
        System.out.println("Escriu el curs del Alumne: ");
        String claseAlum = input.nextLine();

        //Comproba que el string no estigui buit
        if (claseAlum.isEmpty()) {
            System.out.println("El curs no pot estar buit");
            errorComprobacio = true;
            return;
        }

        if (errorComprobacio) {
            return;
        }


        if (!errorComprobacio) {
            Alumne Alumne = new Alumne(DNIAlum, nomAlum, cognomAlum, emailAlum, idAlum, claseAlum);
            alumnes.add(Alumne);
            System.out.println("Acció completada!");
        }
    }
}
