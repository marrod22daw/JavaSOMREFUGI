public class Alumne extends Persona{
    protected Integer idAlumno;
    protected String Curs;


    public Alumne(String dni, String nom, String cognom, String email, Integer idAlumno, String curs) {
        super(dni, nom, cognom, email);
        this.idAlumno = idAlumno;
        Curs = curs;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getCurs() {
        return Curs;
    }

    public void setCurs(String curs) {
        Curs = curs;
    }

    @Override
    public String toString() {
        return "Alumne{" +
                "idAlumno=" + idAlumno +
                ", Curs='" + Curs + '\'' +
                ", dni='" + dni + '\'' +
                ", nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
