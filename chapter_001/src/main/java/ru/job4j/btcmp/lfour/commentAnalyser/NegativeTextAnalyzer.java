package ru.job4j.btcmp.lfour.commentAnalyser;

/**
 * Created by bondarenko.n on 30.07.2018.
 */
public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private final String[] smileWords = {":(", "=(", ":|"};

    @Override
    protected String[] getKeywords() {
        return smileWords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
