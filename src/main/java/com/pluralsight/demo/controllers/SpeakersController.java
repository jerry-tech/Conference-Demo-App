/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pluralsight.demo.controllers;

import com.puralsight.demo.models.Session;
import com.puralsight.demo.models.Speakers;
import com.puralsight.demo.repositories.SpeakerRepository;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping("/api/v1/speakers")
public class SpeakersController {
    
    @Autowired
    private SpeakerRepository speakerRepository;
    
    @GetMapping/** method used for getting all speakers record */
    public List<Speakers> list(){
        return speakerRepository.findAll();
    }
    /** method used for getting a single speaker record */
    @GetMapping
    @RequestMapping("{id}")
    public Speakers get(@PathVariable Long id){
        return speakerRepository.getOne(id);
    }
    
    /** method used for adding a speaker record */
    @PostMapping
    public Speakers create(@RequestBody final Speakers speaker){
        return speakerRepository.saveAndFlush(speaker);
    }
    
    /** method used for deleting a speaker record */
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        speakerRepository.deleteById(id);
    }
    
    /** method used for updating a speaker record */
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Speakers update(@PathVariable Long id, @RequestBody Speakers speaker){
        Speakers existingSpeakers = speakerRepository.getOne(id);
        BeanUtils.copyProperties(speaker, existingSpeakers, "speaker_id");
        return speakerRepository.saveAndFlush(existingSpeakers);
    }
}
