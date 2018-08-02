package ru.job4j.btcmp.lfour;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class PrintTextAndRole {
    private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String rolesStrings : roles) {
            stringBuilder.append(rolesStrings).append(":\n");
            for (int i = 0; i < textLines.length; i++) {
                if(textLines[i].startsWith(rolesStrings + ":")) {
                    stringBuilder.append(i+1).append(")").append(textLines[i].replaceFirst(rolesStrings + ":","")).append("\n");
                }
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines =
       {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
        "Аммос Федорович: Как ревизор?",
        "Артемий Филиппович: Как ревизор?",
        "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
        "Аммос Федорович: Вот те на!",
        "Артемий Филиппович: Вот не было заботы, так подай!",
        "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(new PrintTextAndRole().printTextPerRole(roles, textLines));



    }
    @Test
    public void outputTest() {
        String expected = "Городничий:\n" +
                "1) Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.\n" +
                "4) Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.\n" +
                "\n" +
                "Аммос Федорович:\n" +
                "2) Как ревизор?\n" +
                "5) Вот те на!\n" +
                "\n" +
                "Артемий Филиппович:\n" +
                "3) Как ревизор?\n" +
                "6) Вот не было заботы, так подай!\n" +
                "\n" +
                "Лука Лукич:\n" +
                "7) Господи боже! еще и с секретным предписаньем!";

        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines =
                {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                        "Аммос Федорович: Как ревизор?",
                        "Артемий Филиппович: Как ревизор?",
                        "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                        "Аммос Федорович: Вот те на!",
                        "Артемий Филиппович: Вот не было заботы, так подай!",
                        "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        assertEquals( expected, printTextPerRole(roles, textLines));
    }
}
