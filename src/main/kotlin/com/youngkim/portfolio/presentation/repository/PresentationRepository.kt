package com.youngkim.portfolio.presentation.repository

import com.youngkim.portfolio.domain.entity.Achievement
import com.youngkim.portfolio.domain.entity.Experience
import com.youngkim.portfolio.domain.entity.Introduction
import com.youngkim.portfolio.domain.entity.Link
import com.youngkim.portfolio.domain.entity.Project
import com.youngkim.portfolio.domain.entity.Skill
import com.youngkim.portfolio.domain.repository.AchievementRepository
import com.youngkim.portfolio.domain.repository.ExperienceRepository
import com.youngkim.portfolio.domain.repository.IntroductionRepository
import com.youngkim.portfolio.domain.repository.LinkRepository
import com.youngkim.portfolio.domain.repository.ProjectRepository
import com.youngkim.portfolio.domain.repository.SkillRepository
import org.springframework.stereotype.Repository

@Repository
class PresentationRepository(
    private val achievementRepository: AchievementRepository,
    private val introductionRepository: IntroductionRepository,
    private val linkRepository: LinkRepository,
    private val skillRepository: SkillRepository,
    private val projectRepository: ProjectRepository,
    private val experienceRepository: ExperienceRepository

) {

    fun getActiveAchievements(): List<Achievement> {
        return achievementRepository.findAllByIsActive(true)
    }

    fun getActiveExperiences(): List<Experience> {
        return experienceRepository.findAllByIsActive(true)
    }
    fun getActiveIntroductions(): List<Introduction> {
        return introductionRepository.findAllByIsActive(true)
    }
    fun getActiveLinks(): List<Link> {
        return linkRepository.findAllByIsActive(true)
    }
    fun getActiveProjects(): List<Project> {
        return projectRepository.findAllByIsActive(true)
    }
    fun getActiveSkills(): List<Skill> {
        return skillRepository.findAllByIsActive(true)
    }
}