package com.youngkim.portfolio.domain.repository

import com.youngkim.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Project, Long>