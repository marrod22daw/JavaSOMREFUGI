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

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Integer getTutorAula() {
        return tutorAula;
    }

    public void setTutorAula(Integer tutorAula) {
        this.tutorAula = tutorAula;
    }

    public Double getHorasimpartides() {
        return horasimpartides;
    }

    public void setHorasimpartides(Double horasimpartides) {
        this.horasimpartides = horasimpartides;
    }

    public Double getSalarixhora() {
        return salarixhora;
    }

    public void setSalarixhora(Double salarixhora) {
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
