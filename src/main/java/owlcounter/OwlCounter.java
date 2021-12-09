package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class OwlCounter {

    private List<String> numberOfOwlsByCounty;

    public void readFromFile(Path path) {
        try {
            numberOfOwlsByCounty = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    public int getNumberOfOwls(String county) {
        for (String actual : numberOfOwlsByCounty) {
            String[] temp = actual.split("=");
            if (county.equals(temp[0])) {
                return Integer.parseInt(temp[1]);
            }
        }
        throw new IllegalArgumentException("No such county in Hungary!");
    }

    public int getNumberOfAllOwls() {
        int amount = 0;
        for (String actual : numberOfOwlsByCounty) {
            String[] temp = actual.split("=");
            amount += Integer.parseInt(temp[1]);
        }
        return amount;
    }
}