package egovframework.let.hospital.entity;

import lombok.*;
import org.locationtech.jts.geom.Point;

import javax.persistence.Column;
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

    @Column(nullable = false)
    private String hosName;

    @Column(nullable = false)
    private String hosKind;

    @Column(nullable = false)
    private String hosKindName;

    @Column(nullable = false)
    private String hosSidoCode;

    private String hosSidoName;

    @Column(nullable = false)
    private String hosCityCode;

    @Column(nullable = false)
    private String hosCityName;

    private String hosTownName;

    @Column(nullable = false)
    private String hosPostalCode;

    private String hosAddr;

    private String hosTel;

    private String hosUrl;

    private String hosOpenDate;

    @Column(nullable = false)
    private String hosDoctorCnt;

    @Column(nullable = false)
    private int hosMedicalPractitionerCnt;

    @Column(nullable = false)
    private int hosMedicalInternCnt;

    @Column(nullable = false)
    private int hosMedicalResidentCnt;

    @Column(nullable = false)
    private int hosMedicalSpecialistCnt;

    @Column(nullable = false)
    private int hosDentalCnt;

    @Column(nullable = false)
    private int hosDentalInternCnt;

    @Column(nullable = false)
    private int hosDentalResidentCnt;

    @Column(nullable = false)
    private int hosDentalSpecialistCnt;

    @Column(nullable = false)
    private int hosOrientalCnt;

    @Column(nullable = false)
    private int hosOrientalInternCnt;

    @Column(nullable = false)
    private int hosOrientalResidentCnt;

    @Column(nullable = false)
    private int hosOrientalSpecialistCnt;

    private double xPos;

    private double yPos;

    private Point hosPoint;

}
