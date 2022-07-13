package study.querydsl.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * Querydsl 검증용 Entity
 */

@Entity
@Getter @Setter
public class Hello {

    @Id @GeneratedValue
    private Long id;
}
