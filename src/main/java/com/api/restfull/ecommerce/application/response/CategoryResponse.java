package com.api.restfull.ecommerce.application.response;

import com.api.restfull.ecommerce.domain.entity.Category;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryResponse {

    private Long id;
    private String nome;
    private String descricao;
    @Enumerated(EnumType.STRING) @Column(nullable = false)
    private boolean ativo;
    // Datas de criação e última atualização
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private LocalDate dataCriacao;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private LocalDate dataUltimaAtualizacao;

    public static CategoryResponse fromEntityToResponse(Category category) {
        return CategoryResponse.builder()
                .id(category.getId())
                .nome(category.getNome())
                .descricao(category.getDescricao())
                .ativo(category.isAtivo())
                .dataCriacao(category.getDataCriacao() != null ? category.getDataCriacao() : LocalDate.now())
                .dataUltimaAtualizacao(category.getDataUltimaAtualizacao() != null ? category.getDataUltimaAtualizacao() : LocalDate.now())
                .build();
    }
}
