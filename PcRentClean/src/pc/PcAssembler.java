package pc;

import java.io.File;
import java.io.FileNotFoundException;

public class PcAssembler implements PC {
    public Procesors procesors;


    public PcAssembler(Procesors procesors) {
        this.procesors = procesors;
    }


    public String getProcesor() throws FileNotFoundException{
       return procesors.getName();
    }
}
