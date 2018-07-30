package ru.job4j.btcmp.lfour.commentAnalyser;

/**
 * Created by bondarenko.n on 30.07.2018.
 */
public class TooLongTextAnalyzer implements TextAnalyzer{
    int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length()>maxLength) {
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}
