package com.dautofreitas.accurantevote.domain.entities

import javax.persistence.*

@Entity
class Alternative(
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    val id: Long?,
    val image:String? = null,
    val title: String,
    val selected: Boolean? = null,
    val rate: Int? = null,
    val alternativeType: AlternativeType,
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(nullable = false)
    val survey: Survey
    )