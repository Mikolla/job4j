package ru.job4j.profession;

public class Engineer extends Profession {

    public House build() {
        return new House();
    }
}

class House {
    int height;
}
