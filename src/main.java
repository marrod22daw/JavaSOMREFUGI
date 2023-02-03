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
        int subMenuChoice;
        Scanner sc = new Scanner(System.in);

        // Per crear els valors
        Alumne alumn1 = new Alumne(23, "SMX");
        Profesor profesor1 = new Profesor("98745034J", "Estela", "Simon", "esimon.clot@fje.edu", 001, 202, 40.0, 15.0);
        Persona alumne1 = new Persona("54317002H", "Marti", "Rodriguez", "15583956.clot@fje.edu");
        Nota nota1 = new Nota(8,5, 3,6,8,1, alumn1);

        //Per afegir els valors
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
            System.out.print("Enter your choice: ");

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
                            subMenuChoice = input.nextInt();
                            input.nextLine(); // Per netejar el buffer

                            switch (subMenuChoice) {
                                case 1:
                                    System.out.print("\n");
                                    System.out.println("Crear profesor ");
                                    crearProfesor.crearProfesor(input);
                                    break;
                                case 2:
                                    System.out.println("Introduce el ID del profesor a editar: ");
                                    int idProfAEditar = input.nextInt();
                                    input.nextLine();
                                    boolean profesorEditado = false;
                                    Iterator<Persona> editar = profesors.iterator();
                                    while (editar.hasNext()){
                                        Profesor prof = (Profesor) editar.next();
                                        if (prof.getIdProfesor() == idProfAEditar) {
                                            editar.remove();
                                            profesorEditado = true;
                                            break;
                                        }
                                    }
                                    if (profesorEditado) {
                                        crearProfesor.crearProfesor(input);
                                        System.out.println("El profesor con ID " + idProfAEditar + " ha sido editado.");
                                    } else {
                                        System.out.println("No se ha encontrado un profesor con ID " + idProfAEditar + ".");
                                    }
                                    break;

                                case 3:
                                    System.out.println("Introduce el ID del profesor a eliminar: ");
                                    int idProfAEliminar = input.nextInt();
                                    boolean profesorEliminado = false;
                                    Iterator<Persona> borrar = profesors.iterator();
                                    while (borrar.hasNext()){
                                        Profesor prof = (Profesor) borrar.next();
                                        if (prof.getIdProfesor() == idProfAEliminar) {
                                            borrar.remove();
                                            profesorEliminado = true;
                                            break;
                                        }
                                    }
                                    if (profesorEliminado) {
                                        System.out.println("El profesor con ID " + idProfAEliminar + " ha sido eliminado.");
                                    } else {
                                        System.out.println("No se ha encontrado un profesor con ID " + idProfAEliminar + ".");
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
                                        System.out.println("Horas setmanals: " + prof.getHorasimpartides());
                                        System.out.println("Salari per hora: " + prof.getSalarixhora());
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
                            subMenuChoice = input.nextInt();

                            switch (subMenuChoice) {
                                case 1:
                                    // Crear alumnes
                                    break;
                                case 2:
                                    // Editar alumnes
                                    break;
                                case 3:
                                    // Borrar alumnes
                                    break;
                                case 4:
                                    Iterator<Persona> itAlum = alumnes.iterator();
                                    while (itAlum.hasNext()) {
                                        System.out.println(itAlum.next());
                                    }
                                    break;
                                case 5:
                                    // Exit
                                    break;
                                default:
                                    System.out.println("Numero invalid");
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
                            System.out.println("5. Exit");
                            System.out.print("Selecciona una opció: ");
                            subMenuChoice = input.nextInt();

                            switch (subMenuChoice) {
                                case 1:
                                    // Afegir notes
                                    break;
                                case 2:
                                    // Cambiar notes
                                    break;
                                case 3:
                                    // Eliminar notes
                                    break;
                                case 4:
                                    Iterator<Nota> itNota = notas.iterator();
                                    while (itNota.hasNext()) {
                                        System.out.println(itNota.next());
                                    }
                                    break;
                                case 5:
                                    // Exit
                                    break;
                                default:
                                    System.out.println("Numero invalid");
                            }
                        } while (subMenuChoice != 5);
                        break;
                    case 4:
                        // Exit the program
                        break;
                    default:
                        System.out.print("\n");
                        System.out.println("Numero invalid");
                }
            }else {
                // El input no es un INT
                System.out.print("\n");
                System.out.println("Escriu un numero.");
                input.next();
            }
        } while (mainMenuChoice != 4);
    }
}