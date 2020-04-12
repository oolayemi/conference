package com.olayemi.service;

import com.olayemi.model.Speaker;
import com.olayemi.repository.HibernateSpeakerRepositoryImpl;
import com.olayemi.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl (SpeakerRepository speakerRepository){
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }


    public void setRepository(SpeakerRepository repository){
        this.repository=repository;
    }
}
