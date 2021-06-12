package pc.procesors;

import pc.Procesors;
import pc.TextReader;

import java.io.FileNotFoundException;

public class I7 implements Procesors {

    public String getName() throws FileNotFoundException {



        return new TextReader().getTextOut("I7.txt");
    }
}
