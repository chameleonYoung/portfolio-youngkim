package com.youngkim.portfolio.domain.repository

import com.youngkim.portfolio.domain.entity.ProjectSkill
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface ProjectSkillRepository : JpaRepository<ProjectSkill, Long>{


    // select * form project_skill where project_id = ? projectId and skill_id = ?
    fun findByProjectIdAndSkillId(projectId: Long, skillId: Long): Optional<ProjectSkill>
}