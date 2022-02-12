package egovframework.let.hospital.domain;

import egovframework.com.cmm.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "hospital")
@Builder
public class HospitalEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hospitalNo;

    private String hospitalName;

    private String hospitalInfo;

}
