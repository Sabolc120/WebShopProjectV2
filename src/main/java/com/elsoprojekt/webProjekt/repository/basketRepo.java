package com.elsoprojekt.webProjekt.repository;

import com.elsoprojekt.webProjekt.Model.BasketModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface basketRepo extends JpaRepository<BasketModel, Long> {
}
