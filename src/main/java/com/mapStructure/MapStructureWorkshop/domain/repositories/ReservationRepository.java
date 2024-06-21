package com.mapStructure.MapStructureWorkshop.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapStructure.MapStructureWorkshop.domain.entities.Reservation;
@Repository
public interface ReservationRepository extends JpaRepository <Reservation, String>{

}
