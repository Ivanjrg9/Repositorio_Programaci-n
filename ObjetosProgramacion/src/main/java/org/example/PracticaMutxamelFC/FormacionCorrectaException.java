package org.example.PracticaMutxamelFC;

public class FormacionCorrectaException extends RuntimeException {
    public FormacionCorrectaException() {
        super("Error: La formacion debe ser en el formato N-N-N...");
    }
}
