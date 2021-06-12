package pc.procesors;

import pc.Procesors;
import pc.TextReader;

import java.io.FileNotFoundException;

public class I5 implements Procesors {
    public String getName() throws FileNotFoundException {



        return new TextReader().getTextOut("I5.txt");
    }
}
