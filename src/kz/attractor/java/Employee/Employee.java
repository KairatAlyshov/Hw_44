package kz.attractor.java.Employee;
import java.util.List;

public class Employee {
    private String name;
    private String surname;
    private String email;
    private List<String> reading;
    private List<String> read;

    public Employee(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getReading() {
        return reading;
    }

    public void setReading(List<String> reading) {
        this.reading = reading;
    }

    public List<String> getRead() {
        return read;
    }

    public void setRead(List<String> read) {
        this.read = read;
    }
}
