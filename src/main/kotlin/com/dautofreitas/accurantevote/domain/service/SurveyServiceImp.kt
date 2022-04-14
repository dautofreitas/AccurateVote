package com.dautofreitas.accurantevote.domain.service

import com.dautofreitas.accurantevote.domain.entities.dto.SurveyDto
import com.dautofreitas.accurantevote.domain.repositories.SurveyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SurveyServiceImp(
    @Autowired
    val surveyRepository: SurveyRepository
) : SurveyService {

    override fun save(survey: SurveyDto) {
        surveyRepository.save(survey.toDomain())
    }

    override  fun getById(id: Long): SurveyDto? {
        val survey = surveyRepository.findById(id)

        return if (survey.isPresent) {
            SurveyDto(survey.get())
        } else {
            null
        }
    }

    override  fun getAll(): List<SurveyDto> {
        return surveyRepository.findAll().map { SurveyDto(it) }.toList()
    }

    override   fun delete(survey: SurveyDto) {
        surveyRepository.delete(survey.toDomain())
    }
}