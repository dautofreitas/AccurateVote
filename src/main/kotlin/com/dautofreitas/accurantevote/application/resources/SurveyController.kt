package com.dautofreitas.accurantevote.application.resources


import com.dautofreitas.accurantevote.domain.entities.dto.SurveyDto
import com.dautofreitas.accurantevote.domain.service.SurveyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("survey")
class SurveyController(
    @Autowired
    val surveyService: SurveyService
) {
    @GetMapping("/")
    fun getAll(): ResponseEntity<List<SurveyDto>>
    {
        val surveys = surveyService.getAll()
       return ResponseEntity.ok(surveys)
    }
    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): ResponseEntity<SurveyDto>
    {
        val survey = surveyService.getById(id)
        return ResponseEntity.ok(survey)
    }
    @PostMapping
    fun create(@RequestBody survey: SurveyDto) {

        surveyService.save(survey)
    }
}