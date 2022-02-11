package egovframework.com.cmm.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * @EntityListeners
 * 엔티티를 DB에 적용하기 전 또는 후에 커스털 콜백을 요청할 수 있는 어노테이션입니다.
 * Auditing을 사용하기 위해서 넣었습니다.
 * */
@EntityListeners(AuditingEntityListener.class)
/**
 * @MappedSuperClass
 * 엔티티의 공통 매핑 정보가 필요할 때 사용합니다.
 * 부모클래스(엔티티)에 필드를 선언 후 단순히 속성만 받아서 사용하고싶을 때 사용합니다.
 * 현재는 BaseEntity를 생성하고 Auditing 기능이 필요한 엔티티 클래스에서 사용할 예정이기 떄문입니다.
 * */
@MappedSuperclass
@Getter
public class BaseEntity {
    /**
     * @CreatedDate
     * 해당 필드를 선언하면 엔티티가 작성된 날짜, created 된 날짜를 사용할 수 있게 됩니다.
     * @CreatedBy
     * 해당 엔티티가 생성될 때, 생성하는 사람이 누구인지 자동으로 삽입해줍니다.
     * @LastModifiedDate
     * 해당 엔티티가 수정될 때, 수정하는 시각을 자동으로 삽입해줍니다.
     * @LastModifiedBy
     * 해당 엔티티가 수정된 때, 수정하는 사람이 누구인지 자동으로 삽입해줍니다.
     * */
    @CreatedDate
    /**
     * @Column(updatable=false)
     * 해당 BaseEntity를 JPA가 테이블에 접근하는 시점에만 JPA가 사용하도록 하고 싶은데
     * 누군가에 의해 수정이 되면 안되기 때문에 updatable을 false로 설정
     * */
    @Column(updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    @Column(updatable = false)
    private LocalDateTime updatedDate;
}
