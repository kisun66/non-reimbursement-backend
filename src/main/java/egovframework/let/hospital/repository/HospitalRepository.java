package egovframework.let.hospital.repository;

import egovframework.let.hospital.entity.HospitalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<HospitalEntity, Long> {

}
