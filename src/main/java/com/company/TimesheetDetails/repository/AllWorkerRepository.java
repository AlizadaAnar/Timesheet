package com.company.TimesheetDetails.repository;

import com.company.TimesheetDetails.entity.Workers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllWorkerRepository extends JpaRepository<Workers, Long> {
}
