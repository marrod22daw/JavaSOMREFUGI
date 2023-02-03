import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mainMenuChoice = 0;
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
                                    boolean errorComprobacio = false;
                                    System.out.print("\n");
                                    System.out.println("Crear profesor ");

                                    System.out.println("Escriu el DNI del profesor: ");
                                    String DNIProf = input.nextLine();

                                    //Comproba numero de caracters
                                    if (DNIProf.length() < 9 || DNIProf.length() >= 10) {
                                        System.out.println("DNI INVALID");
                                        break;
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
                                        break;
                                    }

                                    System.out.println("Escriu el nom del profesor: ");
                                    String nomProf = input.nextLine();

                                    //Comproba que el string no estigui buit
                                    if (nomProf.isEmpty()) {
                                        System.out.println("El nom no pot estar buit");
                                        errorComprobacio = true;
                                        break;
                                    }

                                    if (errorComprobacio) {
                                        break;
                                    }

                                    System.out.println("Escriu el cognom del profesor: ");
                                    String cognomProf = input.nextLine();

                                    //Comproba que el string no estigui buit
                                    if (cognomProf.isEmpty()) {
                                        System.out.println("El cognom no pot estar buit");
                                        errorComprobacio = true;
                                        break;
                                    }

                                    if (errorComprobacio) {
                                        break;
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
                                        break;
                                    }

                                    System.out.println("Escriu el id del profesor: ");
                                    Integer idProf = input.nextInt();

                                    //Comproba ID valor
                                    if (idProf <= 0 || idProf >= 1000) {
                                        System.out.println("ID Invalida! Escriu un numero del 1 al 999");
                                        break;
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
                                        break;
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
                                        break;
                                    }

                                    System.out.println("Escriu quantes horas fara a la setmana ");
                                    Double horesProf = input.nextDouble();
                                    System.out.println("Escriu el salari que guanya per cada hora: ");
                                    Double salariProf = input.nextDouble();


                                    if (!errorComprobacio) {
                                        Profesor profesor = new Profesor(DNIProf, nomProf, cognomProf, emailProf, idProf, aulaProf, horesProf, salariProf);
                                        profesors.add(profesor);
                                        System.out.println("Profesor creat amb exit!");
                                    }
                                    break;
                                case 2:
                                    Profesor profesor = (Profesor) profesors.get(0);
                                    profesor.setEmail("newemail@fje.edu");
                                    profesors.set(0, profesor);
                                    break;
                                case 3:
                                    // Borrar Profesors
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