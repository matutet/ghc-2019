package es.keensoft.ghc2019.algorithims;

import es.keensoft.ghc2019.model.Photo;
import es.keensoft.ghc2019.model.Slide;
import es.keensoft.ghc2019.model.Slideshow;
import es.keensoft.ghc2019.utils.Score;

import java.util.List;

public class AlgV1 implements Algorithm {

    private Score score = new Score();

    public Slideshow doit(List<Photo> photos) {
        final Slideshow slideshow = new Slideshow();
        int totalScore = 0;

        Slide slide1 = new Slide();
        Slide slide2 = new Slide();

        boolean firstSlide = true;

        System.out.println("There are " + photos.size() + " photos");
        for (Photo photo : photos) {
            if (!slide1.isFull()) {
                if (slide1.canBeAdded(photo)) {
                    slide1.addPhoto(photo);
                } else {
                    System.out.println("!!!! photo discarded: " + photo.getId() + ", " + photo.getTags());
                }
            } else if (!slide2.isFull()) {
                if (slide2.canBeAdded(photo)) {
                    slide2.addPhoto(photo);
                } else {
                    System.out.println("!!!! photo discarded: " + photo.getId() + ", " + photo.getTags());
                }
            }

            if (slide1.isFull() && slide2.isFull()) {
                int score = scoreSlides(slide1, slide2);
                if (score > 0) {
                    if (firstSlide) {
                        slideshow.getSlides().add(slide1);
                        firstSlide = false;
                    }
                    slideshow.getSlides().add(slide2);

                    slide1 = slide2;
                    totalScore += score;
                }
                slide2 = new Slide();
            }
        }

        System.out.println("Total score: " + totalScore);

        return slideshow;
    }

    private int scoreSlides(Slide slide1, Slide slide2) {
        final int result = score.getResult(slide1, slide2);
        //System.out.println("Score: " + result + " for " + slide1 + " vs " + slide2);
        return result;
    }
}
