package egovframework.let.hospital.repository;

import egovframework.let.hospital.entity.HospitalInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalInfoRepository extends JpaRepository<HospitalInfoEntity, String> {
}
