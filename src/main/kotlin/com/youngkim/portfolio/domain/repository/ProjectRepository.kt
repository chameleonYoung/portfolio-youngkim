package com.youngkim.portfolio.domain.repository

import com.youngkim.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.Optional

interface ProjectRepository : JpaRepository<Project, Long>{

    //1:다 의 관계를 갖는 엔티티
    @Query("select p from Project p left join fetch p.skills s left join fetch s.skill where p.isActive = :isActive")
    fun findByIsActive(isActive: Boolean): List<Project>

    @Query("select p from Project p left join fetch p.details where p.id = :id")
    override fun findById(id: Long): Optional<Project>
}