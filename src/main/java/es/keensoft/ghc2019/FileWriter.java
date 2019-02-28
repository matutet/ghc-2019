import java.io.FileWriter;
import java.io.BufferedWriter;

package es.keensoft.ghc2019;

public class FileWriter {

    private BufferedWriter writer;

    public FileWriter() {

    }

    private initWriter(String path) {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
    }

    private writeFile(Slideshow: slideshow){
        writer.f

    }

    private closeFile(){
        this.writer.close();
    }

}
