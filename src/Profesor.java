public class Profesor extends Persona {

protected Integer idProfesor;
protected Integer tutorAula;
protected Double horasimpartides;
protected Double salarixhora;


    public Profesor(String dni, String nom, String cognom, String email, Integer idProfesor, Integer tutorAula, Double horasimpartides, Double salarixhora) {
        super(dni, nom, cognom, email);
        this.idProfesor = idProfesor;
        this.tutorAula = tutorAula;
        this.horasimpartides = horasimpartides;
        this.salarixhora = salarixhora;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "idProfesor=" + idProfesor +
                ", tutorAula=" + tutorAula +
                ", horasimpartides=" + horasimpartides +
                ", salarixhora=" + salarixhora +
                ", dni='" + dni + '\'' +
                ", nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
