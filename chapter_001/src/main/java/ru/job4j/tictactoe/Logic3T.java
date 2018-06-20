package ru.job4j.tictactoe;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        System.out.println("Видимо прога запустилась Гра началась");

        this.table = table;

      //  System.out.println(table[1][1]);
    }

    public boolean isWinnerX() {
          return false;
    }

    public boolean isWinnerO() {
        return false;
    }

    public boolean hasGap() {

      /*  Figure3T[][] a = table;
        for (int i = 0; i <table.length ; i++) {
            for (int j = 0; j < table[i].length ; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();

        } */



        return true;
    }
}