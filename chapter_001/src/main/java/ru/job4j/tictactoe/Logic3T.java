package ru.job4j.tictactoe;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        System.out.println("Видимо прога запустилась Гра началась");

        this.table = table;


    }

    public boolean isWinnerX()
    {
        for (int i = 0; i < table.length ; i++)
        {
            for (int j = 0; j < table[i].length ; j++) {
                System.out.print(table[i][j].hasMarkX() + " ");
            }
            System.out.println();
        }



     boolean result=true;
        for (int i = 0; i <table.length ; i++) {
            result = true;
            for (int j = 0; j <table[i].length-1 ; j++) {
              if ( !(table[i][j].hasMarkX() && table[i][j+1].hasMarkX()) ) {
                       result = false; break;
              }
            }
            if(result) {return result;}

            result = true;
            for (int j = 0; j <table[i].length-1 ; j++) {
                if ( !(table[j][i].hasMarkX() && table[j+1][i].hasMarkX()) ) {
                    result = false; break;
                }
            }
            if(result) {return result;}
        }

        result = true;
        for (int i = 0; i < table.length-1; i++) {
            if(  !(table[i][i].hasMarkX() && table[i+1][i+1].hasMarkX()) ) {
                result = false; break;
            }
        }
        if(result) {return result;}

        result = true;
        for (int i = 0; i < table.length-1; i++) {
            System.out.println( (table.length-1-i) + " " + i);
            if(  !( table[table.length-1-i][i].hasMarkX() && table[table.length-i-2][i+1].hasMarkX() ) ) {
                result = false;
                System.out.println(false); break;
            }
        }



        return result;

    }

    public boolean isWinnerO() {

            for (int i = 0; i < table.length ; i++)
            {
                for (int j = 0; j < table[i].length ; j++) {
                    System.out.print(table[i][j].hasMarkX() + " ");
                }
                System.out.println();
            }



            boolean result=true;
            for (int i = 0; i <table.length ; i++) {
                result = true;
                for (int j = 0; j <table[i].length-1 ; j++) {
                    if ( !(table[i][j].hasMarkO() && table[i][j+1].hasMarkO()) ) {
                        result = false; break;
                    }
                }
                if(result) {return result;}

                result = true;
                for (int j = 0; j <table[i].length-1 ; j++) {
                    if ( !(table[j][i].hasMarkO() && table[j+1][i].hasMarkO()) ) {
                        result = false; break;
                    }
                }
                if(result) {return result;}
            }

            result = true;
            for (int i = 0; i < table.length-1; i++) {
                if(  !(table[i][i].hasMarkO() && table[i+1][i+1].hasMarkO()) ) {
                    result = false; break;
                }
            }
                if(result) {return result;}

            result = true;
            for (int i = 0; i < table.length-1; i++) {
                System.out.println( (table.length-1-i) + " " + i);
                if(  !( table[table.length-1-i][i].hasMarkO() && table[table.length-i-2][i+1].hasMarkO() ) ) {
                    result = false;
                    System.out.println(false); break;
                }
            }



            return result;
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