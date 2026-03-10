package org.example.Colecciones.TareasFuncionario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


public class Informe {
    private int codigo;
    private Descripcion descripcion;


    public Informe(int codigo,Descripcion descripcion){
        this.codigo=codigo;
        this.descripcion=descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Descripcion descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Informe: " +
                "con codigo codigo = " + codigo +
                " y descripcion = " + descripcion +
                '.';
    }


}
