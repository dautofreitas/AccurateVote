package com.dautofreitas.accurantevote.domain.repositories

import com.dautofreitas.accurantevote.domain.entities.Survey
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface SurveyRepository : CrudRepository<Survey, Long> {

}