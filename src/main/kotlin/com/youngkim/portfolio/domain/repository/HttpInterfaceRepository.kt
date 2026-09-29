package com.youngkim.portfolio.domain.repository

import com.youngkim.portfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime

interface HttpInterfaceRepository : JpaRepository<HttpInterface, Long>{

    fun countAllByCreatedDateTimeAtBetween(start: LocalDateTime, end: LocalDateTime): Long


}