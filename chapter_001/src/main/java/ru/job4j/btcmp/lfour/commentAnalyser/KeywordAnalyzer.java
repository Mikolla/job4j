package ru.job4j.btcmp.lfour.commentAnalyser;

/**
 * Created by bondarenko.n on 30.07.2018.
 */
public abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {
        String[] keyWords = getKeywords();
        for (String keyWord : keyWords) {
            if (text.contains(keyWord)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
