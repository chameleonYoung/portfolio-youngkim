package com.youngkim.portfolio.domain.repository

import com.youngkim.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository : JpaRepository<Achievement, Long> {

}