package egovframework.let.hospital.service;

import egovframework.let.hospital.HospitalDTO;
import egovframework.let.hospital.domain.HospitalEntity;
import egovframework.let.hospital.repository.HospitalRepository;
import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService extends EgovAbstractServiceImpl {

    @Autowired
    HospitalRepository hospitalRepository;

    /**
     * 저장
     * */
    public HospitalEntity save(HospitalDTO hospitalDTO) {
        HospitalEntity hospitalEntity = HospitalEntity.builder()
                        .hospitalName(hospitalDTO.getHospitalName())
                        .hospitalInfo(hospitalDTO.getHospitalInfo())
                        .build();
        hospitalRepository.save(hospitalEntity);
        return hospitalEntity;
    }

    /**
     * 모두 조회
     * */
    public List<HospitalEntity> findAll() {
        return hospitalRepository.findAll();
    }

    /**
     * 페이징을 사용하여 조회
     * */
    public Page<HospitalEntity> findAllPages(Pageable pageable) {
        return hospitalRepository.findAll(pageable);
    }

    /**
     * 슬라이스 (ex : 더보기)를 사용하여 조회
     * */
    public Slice<HospitalEntity> findAllSlice(Pageable pageable) {
        return hospitalRepository.findAll(pageable);
    }
}
