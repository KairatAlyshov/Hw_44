package kz.attractor.java.Employee;
import kz.attractor.java.Books.Book;

import java.util.List;

public class Employee {
    private String name;
    private String surname;
    private String email;
    private List<Book> reading;
    private List<Book> read;

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

    public List<Book> getReading() {
        return reading;
    }

    public void setReading(List<Book> reading) {
        this.reading = reading;
    }

    public List<Book> getRead() {
        return read;
    }

    public void setRead(List<Book> read) {
        this.read = read;
    }
}
