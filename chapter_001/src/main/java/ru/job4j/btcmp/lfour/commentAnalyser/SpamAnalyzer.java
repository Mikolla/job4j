package ru.job4j.btcmp.lfour.commentAnalyser;

import java.security.Key;

/**
 * Created by bondarenko.n on 30.07.2018.
 */
public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] smamWords;

    public SpamAnalyzer(String[] smamWords) {
        this.smamWords = smamWords;
    }

    @Override
    protected String[] getKeywords() {
        return smamWords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
