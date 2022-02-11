package egovframework.let.hospital.service;

import egovframework.let.hospital.entity.HospitalInfoEntity;
import egovframework.let.hospital.repository.HospitalInfoRepository;
import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class HospitalInfoService extends EgovAbstractServiceImpl {

    @Autowired
    HospitalInfoRepository hospitalInfoRepository;

    public Page<HospitalInfoEntity> findAllPages(Pageable pageable) {
        return hospitalInfoRepository.findAll(pageable);
    }

}
