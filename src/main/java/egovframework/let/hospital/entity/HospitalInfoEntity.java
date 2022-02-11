package egovframework.let.hospital.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "hospital_info")
@Builder
public class HospitalInfoEntity {

    @Id
    private String hosId;

    private String hosName;

    private String hosKind;

    private String hosSidoCode;

    private String hosSidoName;

    private String hosCityCode;

    private String hosCityName;

    private String hosTownName;

    private String hosPostalCode;

    private String hosAddr;

    private String hosTel;

    private String hosUrl;

    private String hosOpenDate;

    private String hosDoctorCnt;

    private int hosMedicalPractitionerCnt;

    private int hosMedicalInternCnt;

    private int hosMedicalResidentCnt;

    private int hosMedicalSpecialistCnt;

    private int hosDentalCnt;

    private int hosDentalInternCnt;

    private int hosDentalResidentCnt;

    private int hosDentalSpecialistCnt;

    private int hosOrientalCnt;

    private int hosOrientalInternCnt;

    private int hosOrientalResidentCnt;

    private int hosOrientalSpecialistCnt;

    private double xPos;

    private double yPos;

}
