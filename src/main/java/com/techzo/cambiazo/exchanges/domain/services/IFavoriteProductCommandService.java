package com.techzo.cambiazo.exchanges.domain.services;

import com.techzo.cambiazo.exchanges.domain.model.commands.CreateFavoriteProductCommand;
import com.techzo.cambiazo.exchanges.domain.model.entities.FavoriteProduct;

import java.util.Optional;

public interface IFavoriteProductCommandService {
    Optional<FavoriteProduct> handle(CreateFavoriteProductCommand command);

    boolean handleDeleteFavoriteProductByUserIdAndProductId(Long userId, Long productId);

    boolean handleDeleteFavoriteProductById(Long id);
}
