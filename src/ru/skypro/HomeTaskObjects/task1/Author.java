package ru.skypro.HomeTaskObjects.task1;

import java.nio.charset.StandardCharsets;

public class Author {
    private String name;
    private String surname;
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return this.name;
    }
    public String getSurame() {
        return this.surname;
    }
}
