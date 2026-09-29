package com.youngkim.portfolio.domain.repository

import com.youngkim.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository : JpaRepository<Experience, Long>{

    fun findAllByIsACtive(isActive: Boolean): List<Experience>
}