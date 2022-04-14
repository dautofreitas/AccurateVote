package com.dautofreitas.accurantevote.domain.entities

import javax.persistence.*

@Entity
class Survey (
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    val id : Long?,
    val title: String,
    val status: StatusType,
    @OneToMany( fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    var altrernatives: Set<Alternative> = emptySet(),

    )