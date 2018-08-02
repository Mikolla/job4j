package ru.job4j.btcmp.enumSample;

public class EnumSample {
    public enum Stages {STUDENT, JUNIOR, MIDDLE, SENIOR};

    enum BooleanEnum {
        FALSE, TRUE;
        public BooleanEnum opposite() {
            return this == TRUE ? FALSE : TRUE; }
    }


    public enum CoderStatus {
        STUDENT("fuultime learning"),
        JUNIOR("coding and learning"),
        SENIOR("cowing and working");


        private String description;

        private CoderStatus(String description) {
            this.description = description;
        }

        public String getDescription() {return description;}
    }


    public static void main(String[] args) {
        for (Stages state : Stages.values()) {
            System.out.println(state.ordinal() + ": " + state + " " + state.name() + " " + state.toString());
        }

        System.out.println(BooleanEnum.TRUE.opposite());


        for (CoderStatus coder : CoderStatus.values()) {
            System.out.println(coder.getDescription());
        }

    }
}
