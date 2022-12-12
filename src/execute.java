// Jython
import java.io.IOException;

import org.python.util.PythonInterpreter;

public class execute{
    public static void main(String[] args) throws IOException{
        try (PythonInterpreter pythonInterpreter = new PythonInterpreter()) {
            pythonInterpreter.execfile("./src/main.py");
        }
    }
}
