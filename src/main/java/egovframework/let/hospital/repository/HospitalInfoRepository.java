package egovframework.let.hospital.repository;

import egovframework.let.hospital.domain.HospitalInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalInfoRepository extends JpaRepository<HospitalInfoEntity, String> {

    @Query(value = "SELECT a.hosId" +
                   "  FROM hospital_info a" +
                   " WHERE ST_DISTANCE_SPHERE(POINT(:latitude, :longitude), a.hosPoint) < :distance")
    List<Object[]> test(
            @Param(value = "longitude") double longitude,
            @Param(value = "latitude") double latitude,
            @Param(value = "distance") double distance
    );

}
