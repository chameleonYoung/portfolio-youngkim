package com.youngkim.portfolio.domain.repository

import com.youngkim.portfolio.domain.entity.ProjectSkill
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectSkillRepository : JpaRepository<ProjectSkill, Long>