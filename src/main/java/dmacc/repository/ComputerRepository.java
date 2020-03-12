package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Computer;

@Repository
public interface ComputerRepository extends JpaRepository<Computer, Long>{

}
