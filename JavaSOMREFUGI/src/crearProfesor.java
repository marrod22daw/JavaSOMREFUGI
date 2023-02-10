import java.util.Iterator;
import java.util.Scanner;

public class crearProfesor extends main{
    static void crearProfesor(Scanner input) {
        boolean errorComprobacio = false;

        System.out.println("Escriu el DNI del profesor: ");
        String DNIProf = input.nextLine();

        //Comproba numero de caracters
        if (DNIProf.length() < 9 || DNIProf.length() >= 10) {
            System.out.println("DNI INVALID");
            return;
        }

        //Comproba el valor duplicat
        Iterator<Persona> itComprobaDNI = profesors.iterator();
        while (itComprobaDNI.hasNext()) {
            Profesor prof = (Profesor) itComprobaDNI.next();
            if (DNIProf.equals(prof.getDni())) {
                System.out.println("EL DNI " + DNIProf + " ya existeix!");
                errorComprobacio = true;
                break;
            }
        }

        if (errorComprobacio) {
            return;
        }

        System.out.println("Escriu el nom del profesor: ");
        String nomProf = input.nextLine();

        //Comproba que el string no estigui buit
        if (nomProf.isEmpty()) {
            System.out.println("El nom no pot estar buit");
            errorComprobacio = true;
            return;
        }

        if (errorComprobacio) {
            return;
        }

        System.out.println("Escriu el cognom del profesor: ");
        String cognomProf = input.nextLine();

        //Comproba que el string no estigui buit
        if (cognomProf.isEmpty()) {
            System.out.println("El cognom no pot estar buit");
            errorComprobacio = true;
            return;
        }

        if (errorComprobacio) {
            return;
        }

        System.out.println("Escriu el email del profesor: ");
        String emailProf = input.nextLine();

        //Comproba el valor duplicat
        Iterator<Persona> itComprobaMAIL = profesors.iterator();
        while (itComprobaMAIL.hasNext()) {
            Profesor prof = (Profesor) itComprobaMAIL.next();
            if (emailProf.equals(prof.getEmail())) {
                System.out.println("EL correu electronic " + emailProf + " ya existeix!");
                errorComprobacio = true;
                break;
            }
        }

        if (errorComprobacio) {
            return;
        }

        System.out.println("Escriu el id del profesor: ");
        Integer idProf = input.nextInt();

        //Comproba ID valor
        if (idProf <= 0 || idProf >= 1000) {
            System.out.println("ID Invalida! Escriu un numero del 1 al 999");
            return;
        }

        //Comproba el valor duplicat
        Iterator<Persona> itComprobaID = profesors.iterator();
        while (itComprobaID.hasNext()) {
            Profesor prof = (Profesor) itComprobaID.next();
            if (idProf.equals(prof.getIdProfesor())) {
                System.out.println("La ID " + idProf + " ya existeix!");
                errorComprobacio = true;
                break;
            }
        }

        if (errorComprobacio) {
            return;
        }

        System.out.println("Escriu la aula on es tutor el profesor: ");
        Integer aulaProf = input.nextInt();

        //Comproba el valor duplicat
        Iterator<Persona> itComprobaAULA = profesors.iterator();
        while (itComprobaAULA.hasNext()) {
            Profesor prof = (Profesor) itComprobaAULA.next();
            if (aulaProf.equals(prof.getTutorAula())) {
                System.out.println("La aula " + aulaProf + " ya te un profesor!");
                errorComprobacio = true;
                break;
            }
        }

        if (errorComprobacio) {
            return;
        }

        System.out.println("Escriu quantes horas fara a la setmana ");
        Double horesProf = input.nextDouble();
        System.out.println("Escriu el salari que guanya per cada hora: ");
        Double salariProf = input.nextDouble();


        if (!errorComprobacio) {
            Profesor profesor = new Profesor(DNIProf, nomProf, cognomProf, emailProf, idProf, aulaProf, horesProf, salariProf);
            profesors.add(profesor);
            System.out.println("Acció completada!");
        }
    }
}
