public class Nota{
    private Integer idAlumne;
    private Integer M01;
    private Integer M03;
    private Integer M05;
    private Integer M07;
    private Integer M08;
    private Integer M12;

    public Nota(Integer idAlumne, Integer m01, Integer m03, Integer m05, Integer m07, Integer m08, Integer m12) {
        this.idAlumne = idAlumne;
        M01 = m01;
        M03 = m03;
        M05 = m05;
        M07 = m07;
        M08 = m08;
        M12 = m12;
    }

    public Integer getIdAlumne() {
        return idAlumne;
    }

    public void setIdAlumne(Integer idAlumne) {
        this.idAlumne = idAlumne;
    }

    public Integer getM01() {
        return M01;
    }

    public void setM01(Integer m01) {
        M01 = m01;
    }

    public Integer getM03() {
        return M03;
    }

    public void setM03(Integer m03) {
        M03 = m03;
    }

    public Integer getM05() {
        return M05;
    }

    public void setM05(Integer m05) {
        M05 = m05;
    }

    public Integer getM07() {
        return M07;
    }

    public void setM07(Integer m07) {
        M07 = m07;
    }

    public Integer getM08() {
        return M08;
    }

    public void setM08(Integer m08) {
        M08 = m08;
    }

    public Integer getM12() {
        return M12;
    }

    public void setM12(Integer m12) {
        M12 = m12;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "idAlumne=" + idAlumne +
                ", M01=" + M01 +
                ", M03=" + M03 +
                ", M05=" + M05 +
                ", M07=" + M07 +
                ", M08=" + M08 +
                ", M12=" + M12 +
                '}';
    }
}
