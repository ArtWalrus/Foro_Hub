package com.challenge.forohub.domain.topicos;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity(name = "Topicos")
@Table(name = "topicos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String fecha;
    private Boolean estatus;
    private Integer autor;
    private String curso;

    public Topicos(RegTopicos regTopicos) {
        this.titulo = regTopicos.titulo();
        this.mensaje = regTopicos.mensaje();
        LocalDateTime fechaActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        this.fecha = fechaActual.format(formato);
        this.estatus = true;
        this.autor = regTopicos.autor();
        this.curso = regTopicos.curso();
    }
    public void actualizarTopico(ActualizarTopicos actualizarTopicos) {
        if(actualizarTopicos.titulo() != null) this.titulo = actualizarTopicos.titulo();
        if(actualizarTopicos.mensaje() != null) this.mensaje = actualizarTopicos.mensaje();
    }
    public void eliminarTopico() {
        this.estatus = false;
    }

}
