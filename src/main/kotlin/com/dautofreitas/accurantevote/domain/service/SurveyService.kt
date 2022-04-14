package com.dautofreitas.accurantevote.domain.service

import com.dautofreitas.accurantevote.domain.entities.dto.SurveyDto
import org.springframework.stereotype.Service

interface SurveyService {
    fun save(survey: SurveyDto)
    fun getById(id: Long): SurveyDto?
    fun getAll(): List<SurveyDto>
    fun delete(survey: SurveyDto)
}