package ru.skypro;

import java.util.Objects;

public class Hogwarts {
    private String name;
    private int witchcraft;
    private int transgrassy;

    public Hogwarts(String name, int witchcraft, int transgrassy) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgrassy = transgrassy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgrassy() {
        return transgrassy;
    }

    public void setTransgrassy(int transgrassy) {
        this.transgrassy = transgrassy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return witchcraft == hogwarts.witchcraft && transgrassy == hogwarts.transgrassy && Objects.equals(name, hogwarts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, witchcraft, transgrassy);
    }

    public void compareCapability(Object object) {
        Hogwarts h = (Hogwarts) object;
        if (this.witchcraft > ((Hogwarts) object).witchcraft && this.transgrassy > ((Hogwarts) object).transgrassy) {
            System.out.println(this.name + " сильнее и в магии, и в трансгрессии, чем " + ((Hogwarts) object).getName());
        } else if (this.witchcraft < ((Hogwarts) object).witchcraft && this.transgrassy < ((Hogwarts) object).transgrassy) {
            System.out.println(this.name + " слабее и в магии, и в трансгрессии, чем " + ((Hogwarts) object).getName());
        } else if (this.witchcraft > ((Hogwarts) object).witchcraft && this.transgrassy < ((Hogwarts) object).transgrassy) {
            System.out.println(this.name + " сильнее в магии, но слабее в трансгрессии, чем " + ((Hogwarts) object).getName());
        } else if (this.witchcraft < ((Hogwarts) object).witchcraft && this.transgrassy > ((Hogwarts) object).transgrassy) {
            System.out.println(this.name + " слабее в магии, но сильнее в трансгрессии, чем " + ((Hogwarts) object).getName());
        }
    }
}
