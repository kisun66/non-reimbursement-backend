package egovframework.let.hospital;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HospitalDTO {

    private Long hospitalNo;
    private String hospitalName;
    private String hospitalInfo;

}
