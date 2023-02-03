import java.util.Iterator;
import java.util.Scanner;

public class crearNotas extends main{
    static void crearNotas(Scanner input) {
        boolean errorComprobacio = false;

        System.out.println("Escriu el ID de l'alumne: ");
        Integer IDProf = input.nextInt();

        //Comproba el valor duplicat
        Iterator<Persona> itComprobaID = alumnes.iterator();
        while (itComprobaID.hasNext()) {
            Alumne alum = (Alumne) itComprobaID.next();
            if (!IDProf.equals(alum.getIdAlumno())) {
                System.out.println("EL ID " + IDProf + " no existeix!");
                errorComprobacio = true;
                break;
            }
        }

        if (errorComprobacio) {
            return;
        }

        System.out.println("Escriu la nota del M01: ");
        Integer notaM01Prof = input.nextInt();

        System.out.println("Escriu la nota del M03: ");
        Integer notaM03Prof = input.nextInt();

        System.out.println("Escriu la nota del M05: ");
        Integer notaM05Prof = input.nextInt();

        System.out.println("Escriu la nota del M07: ");
        Integer notaM07Prof = input.nextInt();

        System.out.println("Escriu la nota del M08: ");
        Integer notaM08Prof = input.nextInt();

        System.out.println("Escriu la nota del M12:");
        Integer notaM12Prof = input.nextInt();


        if (!errorComprobacio) {
            Nota nota = new Nota(IDProf,notaM01Prof, notaM03Prof, notaM05Prof, notaM07Prof, notaM08Prof, notaM12Prof);
            notas.add(nota);
            System.out.println("Acció completada!");
        }
    }
}
