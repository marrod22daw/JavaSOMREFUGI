public class Persona {
    protected String dni;
    protected String nom;
    protected String cognom;
    protected String email;

    public Persona(String dni, String nom, String cognom, String email) {
        this.dni = dni;
        this.nom = nom;
        this.cognom = cognom;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
