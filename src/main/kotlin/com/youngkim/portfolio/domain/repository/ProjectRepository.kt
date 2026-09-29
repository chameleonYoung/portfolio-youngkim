package com.youngkim.portfolio.domain.repository

import com.youngkim.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface ProjectRepository : JpaRepository<Project, Long>{

    //1:다 의 관계를 갖는 엔티티
    fun findByIsActive(isActive: Boolean): List<Project>

    override fun findById(id: Long): Optional<Project>
}