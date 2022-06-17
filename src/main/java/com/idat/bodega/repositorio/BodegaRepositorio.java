package com.idat.bodega.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.bodega.model.Bodega;

@Repository
public interface BodegaRepositorio extends JpaRepository<Bodega, Integer> {

}
