import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mainMenuChoice;
        int subMenuChoice;
        Scanner sc = new Scanner(System.in);

        ArrayList<Persona> profesors = new ArrayList<Persona>();
        ArrayList<Persona> alumnes = new ArrayList<Persona>();

        // Per crear els valors
        Profesor profesor1 = new Profesor("98745034J", "Estela", "Simon", "esimon.clot@fje.edu", 001, 202, 40.0, 15.0);
        Persona alumne1 = new Persona("54317002H", "Marti", "Rodriguez", "15583956.clot@fje.edu");

        //Per afegir els valors
        profesors.add(profesor1);
        alumnes.add(alumne1);




        do {
            // Display main menu
            System.out.println("--- SOM REFUGI ---");
            System.out.println("1.Gestio de profesors");
            System.out.println("2.Gestio d'alumnes");
            System.out.println("3.Gestio de notes ");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            mainMenuChoice = input.nextInt();

            switch (mainMenuChoice) {
                case 1:
                    do {
                        // Submenu Profes
                        System.out.println("--- Gestio de profesors ---");
                        System.out.println("1.Crear profesors ");
                        System.out.println("2.Editar profesors ");
                        System.out.println("3.Borrar profesors ");
                        System.out.println("4.Llista de profesors ");
                        System.out.println("5. Exit");
                        System.out.print("Selecciona una opció: ");
                        subMenuChoice = input.nextInt();

                        switch (subMenuChoice) {
                            case 1:
                                System.out.println("Crear profesor ");
                                String Prueba = input.nextLine();
                                System.out.println("Escriu el DNI del profesor: ");
                                String DNIProf = input.nextLine();
                                System.out.println("Escriu el nom del profesor: ");
                                String nomProf = input.nextLine();
                                System.out.println("Escriu el cognom del profesor: ");
                                String cognomProf = input.nextLine();
                                System.out.println("Escriu el email del profesor: ");
                                String emailProf = input.nextLine();
                                System.out.println("Escriu el id del profesor: ");
                                Integer idProf = input.nextInt();
                                System.out.println("Escriu la aula on es tutor el profesor: ");
                                Integer aulaProf = input.nextInt();
                                System.out.println("Escriu quantes horas fara a la setmana ");
                                Double horesProf = input.nextDouble();
                                System.out.println("Escriu el salari que guanya per cada hora: ");
                                Double salariProf = input.nextDouble();
                                Profesor profesor2 = new Profesor(DNIProf,nomProf,cognomProf,emailProf, idProf, aulaProf, horesProf, salariProf);
                                profesors.add(profesor2);
                                break;
                            case 2:
                                // Editar Profesors
                                break;
                            case 3:
                                // Borrar Profesors
                                break;
                            case 4:
                                Iterator<Persona> itProf = profesors.iterator();
                                while (itProf.hasNext()){
                                    Profesor prof = (Profesor) itProf.next();
                                    System.out.println("DNI: " + prof.getDni());
                                    System.out.println("Nombre: " + prof.getNom());
                                    System.out.println("Apellido: " + prof.getCognom());
                                    System.out.println("Email: " + prof.getEmail());
                                    System.out.println("ID: " + prof.getIdProfesor());
                                    System.out.println("Aula: " + prof.getTutorAula());
                                    System.out.println("Horas semanales: " + prof.getHorasimpartides());
                                    System.out.println("Salario por hora: " + prof.getSalarixhora());
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
                                while (itAlum.hasNext()){
                                    System.out.println(itAlum.next()) ;
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
                                // Llistar notes
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
                    System.out.println("Numero invalid");
            }
        } while (mainMenuChoice != 4);
    }
}