package org.example.insti;

//import lombok.*;

import java.util.Objects;

//@Getter @Setter @ToString
//@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor
//@Data
public class Instituto {

  // @NonNull
    private String nombre;
    private String poblacion;


    public void setpoblcion(String poblacion){
        this.poblacion= Objects.requireNonNullElse(poblacion,"Alicante");
    }

}
