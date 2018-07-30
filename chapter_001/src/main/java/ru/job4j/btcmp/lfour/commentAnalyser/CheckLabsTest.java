package ru.job4j.btcmp.lfour.commentAnalyser;

/**
 * Created by bondarenko.n on 30.07.2018.
 */
public class CheckLabsTest {

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer textanalyser: analyzers) {
              Label lab = textanalyser.processText(text);
              if (lab != Label.OK) {
                  return lab;
              }
        }
        return Label.OK;
    }

    public static void main(String[] args) {
        String[] spams = {"credit", "money", "ecommerce", "traiding", "forex"};
        int maxLen = 20;
        TextAnalyzer[] textAnalyzers1 = { new TooLongTextAnalyzer(maxLen),
                                          new SpamAnalyzer(spams),
                                          new NegativeTextAnalyzer()};
        String text1 = "bad coment";
        System.out.println(new CheckLabsTest().checkLabels(textAnalyzers1, text1));
    }


}
