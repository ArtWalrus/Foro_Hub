package com.challenge.forohub.domain.topicos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RegTopicos(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        int autor,
        @NotBlank
        String curso
) {
}
