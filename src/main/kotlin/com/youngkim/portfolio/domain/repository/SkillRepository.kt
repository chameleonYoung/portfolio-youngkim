package com.youngkim.portfolio.domain.repository

import com.youngkim.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long>