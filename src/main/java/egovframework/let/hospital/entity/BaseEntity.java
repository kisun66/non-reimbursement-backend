package egovframework.let.hospital.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;

/**
 * @EntityListeners
 * 엔티티를 DB에 적용하기 전 또는 후에 커스털 콜백을 요청할 수 있는 어노테이션입니다.
 * Auditing을 사용하기 위해서 넣었습니다.
 * */
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
}
