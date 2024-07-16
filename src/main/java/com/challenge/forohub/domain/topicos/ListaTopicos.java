package com.challenge.forohub.domain.topicos;

public record ListaTopicos(
        Long id,
        String titulo,
        String mensaje,
        String fecha
) {

    public ListaTopicos (Topicos topicos) {
        this(topicos.getId(), topicos.getTitulo(), topicos.getMensaje(), topicos.getFecha());
    }

}
