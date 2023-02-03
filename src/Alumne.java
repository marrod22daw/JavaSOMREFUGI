public class Alumne extends Persona{
    private Integer idAlumno;
    private String Curs;

    public Alumne(String dni, String nom, String cognom, String email) {
        super(dni, nom, cognom, email);
    }

    public Alumne(int idAlumno, String Curs) {
        super();
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
                '}';
    }
}
