package com.api.restfull.ecommerce.application.request.product;

import jakarta.persistence.Column;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductRequest(

        Long id,

        @NotBlank
        String name,

        @NotBlank
        String description,

        @NotNull
        Integer quantityStock,

        @NotNull(message = "O preço é obrigatório.")
        @DecimalMin(value = "0.01", message = "O preço deve ser maior que zero.")
        BigDecimal price,

        @Column(nullable = true)
        Boolean active,

        @NotNull
        Long categoryId) {

}

