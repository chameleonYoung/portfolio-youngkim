package com.youngkim.portfolio.domain.entity

import jakarta.persistence.MappedSuperclass

@MappedSuperclass //이 클래스를 상속 받는 엔티티 클래스가 여기 안에 있는 필드들을 해당 엔티티에 있는 테이블의 컬럼과 맵핑 할 수가 있습니다
abstract class BaseEntity