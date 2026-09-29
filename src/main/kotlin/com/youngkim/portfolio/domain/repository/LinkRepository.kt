package com.youngkim.portfolio.domain.repository

import com.youngkim.portfolio.domain.entity.Achievement
import com.youngkim.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long>{

    fun findAllByIsActive(isActive: Boolean): List<Link>
}