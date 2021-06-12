package pc.procesors;

import pc.Procesors;
import pc.TextReader;

import java.io.FileNotFoundException;

public class I3 implements Procesors {

    public I3(){

    }


    public String getName() throws FileNotFoundException {



        return new TextReader().getTextOut("I3.txt");
    }
}
