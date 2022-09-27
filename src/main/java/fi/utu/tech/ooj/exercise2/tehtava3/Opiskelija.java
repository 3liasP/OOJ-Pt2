package fi.utu.tech.ooj.exercise2.tehtava3;

public class Opiskelija {
    private String name;
    private Integer studentId;

    public Opiskelija(String name, Integer studentId) {
        this.name = name;
        this.studentId = studentId;
        System.out.println("Luotu " + this);
    }

    public void setStudentName(String name) {
        this.name = name;
    }

    public String getStudentName() {
        return this.name;
    }

    public void setStudentId(Integer id) {
        this.studentId = id;
    }

    public Integer getStudentId() {
        return this.studentId;
    }

    public boolean equals(Object opiskelija) {
        if (!(opiskelija instanceof Opiskelija)) return false;
        return this.studentId.intValue() == ((Opiskelija) opiskelija).getStudentId().intValue();
    }

    public String toString() {
        return String.format("Luokka: %s Nimi: %s Tyyppi: %i", getClass().getName(), name, studentId);
    }
}