package com.youngkim.portfolio.domain.repository

import com.youngkim.portfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository

interface HttpInterfaceRepository : JpaRepository<HttpInterface, Long>