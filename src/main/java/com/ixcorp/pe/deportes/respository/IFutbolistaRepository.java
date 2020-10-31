package com.ixcorp.pe.deportes.respository;

import com.ixcorp.pe.deportes.domain.Futbolista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFutbolistaRepository extends JpaRepository<Futbolista,Long> {

}
