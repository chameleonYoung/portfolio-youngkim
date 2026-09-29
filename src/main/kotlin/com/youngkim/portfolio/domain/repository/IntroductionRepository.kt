package com.youngkim.portfolio.domain.repository

import com.youngkim.portfolio.domain.entity.Achievement
import com.youngkim.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction, Long> {

    fun findAllByIsActive(isActive: Boolean): List<Introduction>

}