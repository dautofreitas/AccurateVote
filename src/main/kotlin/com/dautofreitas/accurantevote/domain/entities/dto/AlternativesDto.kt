package com.dautofreitas.accurantevote.domain.entities.dto

import com.dautofreitas.accurantevote.domain.entities.AlternativeType

data class AlternativeDto(
    val id: Long?,
    val image:String? = null,
    val title: String,
    val selected: Boolean? = null,
    val rate: Int? = null,
    val alternativeType: AlternativeType
)

