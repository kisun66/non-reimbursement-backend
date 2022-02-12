package egovframework.let.hospital.web;

import egovframework.let.hospital.domain.HospitalEntity;
import egovframework.let.hospital.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("hospital")
public class HospitalController {

    @Autowired
    HospitalService hospitalService;

    /**
     * 병원 저장
     * */
    @PostMapping("save")
    public HospitalEntity save(HospitalEntity hospitalEntity) {
        return hospitalService.save(hospitalEntity);
    }

    /**
     * 모든 병원 목록 조회
     * */
    @GetMapping("findAll")
    public List<HospitalEntity> findAll() {
        return hospitalService.findAll();
    }

    /**
     * 페이징을 사용하여 병원 목록 조회
     * */
    @GetMapping("findAllPages")
    public Page<HospitalEntity> findAllPages(Pageable pageable) {
        return hospitalService.findAllPages(pageable);
    }

    /**
     * 슬라이스 (ex : 더보기)를 사용하여 병원 목록 조회
     * */
    @GetMapping("findAllSlice")
    public Slice<HospitalEntity> findAllSlice(Pageable pageable) {
        return hospitalService.findAllSlice(pageable);
    }

}
