import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class main {
    static ArrayList<Persona> profesors = new ArrayList<Persona>();
    static ArrayList<Persona> alumnes = new ArrayList<Persona>();
    static ArrayList<Nota> notas = new ArrayList<Nota>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mainMenuChoice = 0;
        int subMenuChoice = 0;

        // Per crear els valors
        Profesor profesor1 = new Profesor("98745034J", "Estela", "Simon", "esimon.clot@fje.edu", 001, 202, 40.0, 15.0);
        Alumne alumne1 = new Alumne("54317002H", "Marti", "Rodriguez", "15583956.clot@fje.edu", 23, "SMX");
        Nota nota1 = new Nota(23, 5, 3, 6, 8, 1, 2);

        // Per afegir els valors
        profesors.add(profesor1);
        alumnes.add(alumne1);
        notas.add(nota1);

        do {
            // Display main menu
            System.out.print("\n");
            System.out.println("--- SOM REFUGI ---");
            System.out.println("1.Gestio de profesors");
            System.out.println("2.Gestio d'alumnes");
            System.out.println("3.Gestio de notes ");
            System.out.println("4. Exit");
            System.out.print("Selecciona una opció: ");

            if (input.hasNextInt()) {
                mainMenuChoice = input.nextInt();
                input.nextLine(); // Per netejar el buffer

                switch (mainMenuChoice) {
                    case 1:
                        do {
                            // Submenu Profes
                            System.out.print("\n");
                            System.out.println("--- Gestio de profesors ---");
                            System.out.println("1.Crear profesors ");
                            System.out.println("2.Editar profesors ");
                            System.out.println("3.Borrar profesors ");
                            System.out.println("4.Llista de profesors ");
                            System.out.println("5. Exit");
                            System.out.print("Selecciona una opció: ");
                            if (input.hasNextInt()) {
                                subMenuChoice = input.nextInt();
                                input.nextLine(); // Per netejar el buffer

                                switch (subMenuChoice) {
                                    case 1:
                                        System.out.print("\n");
                                        System.out.println("Crear profesor ");
                                        crearProfesor.crearProfesor(input);
                                        break;
                                    case 2:
                                        System.out.println("Introdueix el ID del profesor a editar: ");
                                        int idProfAEditar = input.nextInt();
                                        input.nextLine();
                                        boolean profesorEditado = false;
                                        Iterator<Persona> editar = profesors.iterator();
                                        while (editar.hasNext()) {
                                            Profesor prof = (Profesor) editar.next();
                                            if (prof.getIdProfesor() == idProfAEditar) {
                                                editar.remove();
                                                profesorEditado = true;
                                                break;
                                            }
                                        }
                                        if (profesorEditado) {
                                            crearProfesor.crearProfesor(input);
                                            System.out.println(
                                                    "El professor amb la ID " + idProfAEditar + " ha estat editat.");
                                        } else {
                                            System.out.println(
                                                    "No s'ha trobat un professor con ID " + idProfAEditar + ".");
                                        }
                                        break;

                                    case 3:
                                        System.out.println("Introdueix l'ID del professor que vols eliminar: ");
                                        int idProfAEliminar = input.nextInt();
                                        boolean profesorEliminado = false;
                                        Iterator<Persona> borrar = profesors.iterator();
                                        while (borrar.hasNext()) {
                                            Profesor prof = (Profesor) borrar.next();
                                            if (prof.getIdProfesor() == idProfAEliminar) {
                                                borrar.remove();
                                                profesorEliminado = true;
                                                break;
                                            }
                                        }
                                        if (profesorEliminado) {
                                            System.out.println(
                                                    "El profesor amb la ID " + idProfAEliminar + " ha sigut eliminat.");
                                        } else {
                                            System.out.println(
                                                    "No s'ha trobat un professor amb l'ID " + idProfAEliminar + ".");
                                        }
                                        break;
                                    case 4:
                                        Iterator<Persona> itProf = profesors.iterator();
                                        while (itProf.hasNext()) {
                                            Profesor prof = (Profesor) itProf.next();
                                            System.out.print("\n");
                                            System.out.println("//-+-+-+-+-+-+-//");
                                            System.out.println("DNI: " + prof.getDni());
                                            System.out.println("Nom: " + prof.getNom());
                                            System.out.println("Cognom: " + prof.getCognom());
                                            System.out.println("Email: " + prof.getEmail());
                                            System.out.println("ID: " + prof.getIdProfesor());
                                            System.out.println("Aula tutor: " + prof.getTutorAula());
                                            System.out.println("Hores setmanals: " + prof.getHorasimpartides());
                                            System.out.println("Salari per hora: " + prof.getSalarixhora() + "€");
                                            System.out.println("Salari Total "
                                                    + prof.salariTotal(prof.getHorasimpartides(), prof.getSalarixhora())
                                                    + "€");
                                            System.out.println("//-+-+-+-+-+-+-//");
                                            System.out.print("\n");
                                        }
                                        break;
                                    case 5:
                                        // Exit
                                        break;
                                    default:
                                        System.out.println("Numero invalid");
                                }
                            } else {
                                // El input no es un INT
                                System.out.print("\n");
                                System.out.println("Escriu un numero.");
                                input.next();
                            }
                        } while (subMenuChoice != 5);
                        break;
                    case 2:
                        do {
                            // Submenu alumnes
                            System.out.print("\n");
                            System.out.println("--- Gestio d'alumnes---");
                            System.out.println("1. Crear alumnes");
                            System.out.println("2. Editar alumnes");
                            System.out.println("3. Borrar alumnes");
                            System.out.println("4. Llista alumnes");
                            System.out.println("5. Exit");
                            System.out.print("Selecciona una opció: ");
                            if (input.hasNextInt()) {
                                subMenuChoice = input.nextInt();
                                input.nextLine(); // Per netejar el buffer

                                switch (subMenuChoice) {
                                    case 1:
                                        System.out.print("\n");
                                        System.out.println("Crear alumne ");
                                        crearAlumne.crearAlumne(input);
                                        break;
                                    case 2:
                                        System.out.println("Introdueix el ID del alumne a editar: ");
                                        int idAlumAEditar = input.nextInt();
                                        input.nextLine();
                                        boolean alumneEditado = false;
                                        Iterator<Persona> editar = alumnes.iterator();
                                        while (editar.hasNext()) {
                                            Alumne alum = (Alumne) editar.next();
                                            if (alum.getIdAlumno() == idAlumAEditar) {
                                                editar.remove();
                                                alumneEditado = true;
                                                break;
                                            }
                                        }
                                        if (alumneEditado) {
                                            crearAlumne.crearAlumne(input);
                                            System.out.println(
                                                    "El alumne amb la ID " + idAlumAEditar + " ha estat editat.");
                                        } else {
                                            System.out.println(
                                                    "No s'ha trobat un alumne amb la ID " + idAlumAEditar + ".");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Introdueix el ID del alumne a eliminar: ");
                                        int idAlumAEliminar = input.nextInt();
                                        boolean alumneEliminado = false;
                                        Iterator<Persona> borrar = alumnes.iterator();
                                        while (borrar.hasNext()) {
                                            Alumne alum = (Alumne) borrar.next();
                                            if (alum.getIdAlumno() == idAlumAEliminar) {
                                                borrar.remove();
                                                alumneEliminado = true;
                                                break;
                                            }
                                        }
                                        if (alumneEliminado) {
                                            System.out.println(
                                                    "El alumne amb la ID " + idAlumAEliminar + " ha estat eliminat.");
                                        } else {
                                            System.out.println(
                                                    "No s'ha trobat un alumne amb la ID " + idAlumAEliminar + ".");
                                        }
                                        break;
                                    case 4:
                                        Iterator<Persona> itAlum = alumnes.iterator();
                                        while (itAlum.hasNext()) {
                                            Alumne alum = (Alumne) itAlum.next();
                                            System.out.print("\n");
                                            System.out.println("//-+-+-+-+-+-+-//");
                                            System.out.println("DNI: " + alum.getDni());
                                            System.out.println("Nom: " + alum.getNom());
                                            System.out.println("Cognom: " + alum.getCognom());
                                            System.out.println("Email: " + alum.getEmail());
                                            System.out.println("ID: " + alum.getIdAlumno());
                                            System.out.println("Classe: " + alum.getCurs());
                                            System.out.println("//-+-+-+-+-+-+-//");
                                            System.out.print("\n");
                                        }
                                        break;
                                    case 5:
                                        // Exit
                                        break;
                                    default:
                                        System.out.println("Numero invalid");
                                }
                            } else {
                                // El input no es un INT
                                System.out.print("\n");
                                System.out.println("Escriu un numero.");
                                input.next();
                            }
                        } while (subMenuChoice != 5);
                        break;
                    case 3:
                        do {
                            // Submenu notes
                            System.out.print("\n");
                            System.out.println("--- Gestio de notes ---");
                            System.out.println("1. Afegir notes");
                            System.out.println("2. Cambiar notes");
                            System.out.println("3. Eliminar notes");
                            System.out.println("4. Llistar notes");
                            System.out.println("5. Gestió de promoció");
                            System.out.println("6. Exit");
                            System.out.print("Selecciona una opció: ");
                            if (input.hasNextInt()) {
                                subMenuChoice = input.nextInt();
                                input.nextLine(); // Per netejar el buffer

                                switch (subMenuChoice) {
                                    case 1:
                                        System.out.print("\n");
                                        System.out.println("Possar notes ");
                                        crearNotas.crearNotas(input);
                                        break;
                                    case 2:
                                        System.out.println("Introdueix el ID de l'alumne per editar les seves notes: ");
                                        int idNotaAEditar = input.nextInt();
                                        boolean notaEditada = false;
                                        Iterator<Nota> editar = notas.iterator();
                                        while (editar.hasNext()) {
                                            Nota prof = (Nota) editar.next();
                                            if (prof.getIdAlumne() == idNotaAEditar) {
                                                editar.remove();
                                                crearNotas.crearNotas(input);
                                                notaEditada = true;
                                                break;
                                            }
                                        }
                                        if (notaEditada) {
                                            System.out.println("Les notes de l'alumne amb ID " + idNotaAEditar
                                                    + " han sigut editades.");
                                        } else {
                                            System.out.println(
                                                    "No s'ha trobat notes d'un alumne amb ID " + idNotaAEditar + ".");
                                        }
                                        break;

                                    case 3:
                                        System.out
                                                .println("Introdueix el ID de l'alumne per eliminar les seves notes: ");
                                        int idNotaAEliminar = input.nextInt();
                                        boolean notaEliminado = false;
                                        Iterator<Nota> borrar = notas.iterator();
                                        while (borrar.hasNext()) {
                                            Nota prof = (Nota) borrar.next();
                                            if (prof.getIdAlumne() == idNotaAEliminar) {
                                                borrar.remove();
                                                notaEliminado = true;
                                                break;
                                            }
                                        }
                                        if (notaEliminado) {
                                            System.out.println("Les notes de l'alumne amb ID " + idNotaAEliminar
                                                    + " han sigut esborrades.");
                                        } else {
                                            System.out.println("No s'ha trobat notes amb ID " + idNotaAEliminar + ".");
                                        }
                                        break;
                                    case 4:
                                        Iterator<Nota> itNota = notas.iterator();
                                        while (itNota.hasNext()) {
                                            Nota prof = (Nota) itNota.next();
                                            System.out.print("\n");
                                            System.out.println("//-+-+-+-+-+-+-//");
                                            System.out.println("ID: " + prof.getIdAlumne());
                                            System.out.println("M01: " + prof.getM01());
                                            System.out.println("M03: " + prof.getM03());
                                            System.out.println("M05: " + prof.getM05());
                                            System.out.println("M07: " + prof.getM07());
                                            System.out.println("M08: " + prof.getM08());
                                            System.out.println("M12: " + prof.getM12());
                                            System.out.println("//-+-+-+-+-+-+-//");
                                            System.out.print("\n");
                                            break;
                                        }
                                    case 5:
                                        System.out.println("Introdueix el ID de l'alumne per veure la promoció: ");
                                        int idGestionarPromocion = input.nextInt();
                                        boolean notagestio = false;
                                        Iterator<Nota> apro = notas.iterator();
                                        while (apro.hasNext()) {
                                            Nota prof = (Nota) apro.next();
                                            if (prof.getIdAlumne() == idGestionarPromocion) {
                                                int contador = 0;
                                                if (prof.getM01() < 5)
                                                    contador++;
                                                if (prof.getM03() < 5)
                                                    contador++;
                                                if (prof.getM05() < 5)
                                                    contador++;
                                                if (prof.getM07() < 5)
                                                    contador++;
                                                if (prof.getM08() < 5)
                                                    contador++;
                                                if (prof.getM12() < 5)
                                                    contador++;
                                                if (contador >= 2) {
                                                    notagestio = false;
                                                } else if (contador < 2) {
                                                    notagestio = true;
                                                }
                                            }
                                        }
                                        if (notagestio == true) {
                                            System.out.println(
                                                    "L'alumne amb ID " + idGestionarPromocion + " ha aprovat el curs");
                                        } else if (notagestio == false) {
                                            System.out.println(
                                                    "L'alumne amb " + idGestionarPromocion + " ha suspès el curs");
                                        }
                                        break;
                                    case 6:
                                        // Exit
                                        break;
                                    default:
                                        System.out.println("Numero invalid");
                                }
                            } else {
                                // El input no es un INT
                                System.out.print("\n");
                                System.out.println("Escriu un numero.");
                                input.next();
                            }
                        } while (subMenuChoice != 6);
                        break;
                    case 4:
                        // Exit the program
                        break;
                    default:
                        System.out.print("\n");
                        System.out.println("Numero invalid");
                }
            } else {
                // El input no es un INT
                System.out.print("\n");
                System.out.println("Escriu un número.");
                input.next();
            }
        } while (mainMenuChoice != 4);
    }
}