package models;

import models.District;

import javax.persistence.*;

@Entity
@Table(name="schools")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int number;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="adress_id")
    private District adress;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public District getAdress() {
        return adress;
    }

    public void setAdress(District adress) {
        this.adress = adress;
    }

    public School() {

    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number;
    }
}
