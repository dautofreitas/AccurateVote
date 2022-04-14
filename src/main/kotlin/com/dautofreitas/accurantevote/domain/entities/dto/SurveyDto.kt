package com.dautofreitas.accurantevote.domain.entities.dto

import com.dautofreitas.accurantevote.domain.entities.Alternative
import com.dautofreitas.accurantevote.domain.entities.StatusType
import com.dautofreitas.accurantevote.domain.entities.Survey
import javax.persistence.*

data class SurveyDto (
    val id : Long? = null,
    val status: StatusType,
    val title: String,
    val altrernatives: Set<AlternativeDto> = emptySet()
    )
{
    constructor(survey: Survey) : this(
        survey.id,
        survey.status,
        survey.title,
        survey.altrernatives.map { AlternativeDto(it.id, it.image, it.title, it.selected, it.rate, it.alternativeType) }
            .toSet()
    )

    fun toDomain(): Survey {
        val survey = Survey(id, title, status)
        survey.altrernatives = altrernatives.map {
            Alternative(
                it.id,
                it.image,
                it.title,
                it.selected,
                it.rate,
                it.alternativeType,
                survey
            )
        }.toSet()

        return survey
    }

}