package md.tekwill.lectia25;

import java.io.FileNotFoundException;

class DemoThrowsException {
    public void readFile(String file) throws FileNotFoundException {
        if (file = null)
            throw new NullPointerException(); //genereaza o exceptie care nu este declarata dupa throws
        boolean found = findFile(file);
        if (!found)
            throw new FileNotFoundException("Missing file");
        else {
            // code to read file}
        }
    }

    boolean findFile(String file) {
        // code to return true if file can be located
    }

}
