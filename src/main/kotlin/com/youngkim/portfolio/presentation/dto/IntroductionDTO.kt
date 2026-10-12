package com.youngkim.portfolio.presentation.dto

import com.youngkim.portfolio.domain.entity.Introduction

data class IntroductionDTO(
    val content:String
)
{

    constructor(introduction: Introduction): this (
        content = introduction.content
    )
}