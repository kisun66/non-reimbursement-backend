package egovframework.let.hospital.web;

import egovframework.let.hospital.domain.HospitalInfoEntity;
import egovframework.let.hospital.service.HospitalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("hospitalInfo")
public class HospitalInfoController {

    @Autowired
    HospitalInfoService hospitalInfoService;

    @GetMapping("findAllPages")
    public Page<HospitalInfoEntity> findAllPages(Pageable pageable) {
        return hospitalInfoService.findAllPages(pageable);
    }

    @GetMapping("getNearByHospitals")
    public List<Object[]> getNearByHospitals(
            @RequestParam(value = "xPos") double xPos,
            @RequestParam(value = "yPos") double yPos,
            @RequestParam(value = "distance") int distance) {
        return hospitalInfoService.getNearByHospitals(xPos, yPos, distance);
    }

}
