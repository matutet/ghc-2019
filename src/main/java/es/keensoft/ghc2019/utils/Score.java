package es.keensoft.ghc2019.utils;

import es.keensoft.ghc2019.model.Photo;
import es.keensoft.ghc2019.model.Slide;

import java.util.Iterator;
import java.util.Set;

public class Score {

    public int calculateCommonTags(Slide slide1, Slide slide2) {
        int result = 0;
        Set<String> tags1 = slide1.getTags();
        for (Iterator<String> it = tags1.iterator(); it.hasNext(); ) {
            String tag = it.next();
            result = slide2.getTags().contains(tag) ? result++ : result;
        }
        return result;
    }

    public int calculateMinTags(Slide slide1, Slide slide2) {
        int result = 0;
        Set<String> tags1 = slide1.getTags();
        for (Iterator<String> it = tags1.iterator(); it.hasNext(); ) {
            String tag = it.next();
            result = slide2.getTags().contains(tag) ? result : result++;
        }
        return result;
    }

}