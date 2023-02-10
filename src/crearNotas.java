import java.util.Iterator;
import java.util.Scanner;

public class crearNotas extends main{
    static void crearNotas(Scanner input) {
        boolean errorComprobacio = false;

        System.out.println("Escriu el ID de l'alumne: ");
        Integer IDAlum = input.nextInt();
        boolean existeID = false;

//Comproba el valor duplicat
        Iterator<Nota> itComprobaID = notas.iterator();
        while (itComprobaID.hasNext()) {
            Nota prof = (Nota) itComprobaID.next();
            if (prof.getIdAlumne() == IDAlum) {
                existeID = true;
                break;
            }
        }

        if (!existeID) {
            System.out.println("EL ID " + IDAlum + " no existeix!");
            errorComprobacio = true;
        }


        if (errorComprobacio) {
            return;
        }

        System.out.println("Escriu la nota del M01: ");
        Integer notaM01Alum = input.nextInt();

        System.out.println("Escriu la nota del M03: ");
        Integer notaM03Alum = input.nextInt();

        System.out.println("Escriu la nota del M05: ");
        Integer notaM05Alum = input.nextInt();

        System.out.println("Escriu la nota del M07: ");
        Integer notaM07Alum = input.nextInt();

        System.out.println("Escriu la nota del M08: ");
        Integer notaM08Alum = input.nextInt();

        System.out.println("Escriu la nota del M12:");
        Integer notaM12Alum = input.nextInt();


        if (!errorComprobacio) {
            Nota nota = new Nota(IDAlum,notaM01Alum, notaM03Alum, notaM05Alum, notaM07Alum, notaM08Alum, notaM12Alum);
            notas.add(nota);
            System.out.println("Acció completada!");
        }
    }
}