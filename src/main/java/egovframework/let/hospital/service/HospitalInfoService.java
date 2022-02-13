package egovframework.let.hospital.service;

import egovframework.let.hospital.HospitalInfoDTO;
import egovframework.let.hospital.domain.HospitalInfoEntity;
import egovframework.let.hospital.repository.HospitalInfoRepository;
import lombok.RequiredArgsConstructor;
import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalInfoService extends EgovAbstractServiceImpl {

    @Autowired
    HospitalInfoRepository hospitalInfoRepository;

    public Page<HospitalInfoEntity> findAllPages(Pageable pageable) {
        return hospitalInfoRepository.findAll(pageable);
    }

    public List<Object[]> getNearByHospitals(Double longitude, Double latitude, int distance) {
        return hospitalInfoRepository.getNearByHospitals(longitude, latitude, distance);
    }

}
