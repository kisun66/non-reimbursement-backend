package egovframework.let.hospital.entity;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "hospital")
@Builder
public class HospitalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hospitalNo;

    private String hospitalName;

    private String hospitalInfo;

}
