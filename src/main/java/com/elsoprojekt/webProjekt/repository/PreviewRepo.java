package com.elsoprojekt.webProjekt.repository;

import com.elsoprojekt.webProjekt.Model.Preview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PreviewRepo extends JpaRepository<Preview, Long> {

}
