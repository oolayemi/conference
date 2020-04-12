package com.olayemi.repository;

import com.olayemi.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){

        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Olayemi");
        speaker.setLastName("Olaomo");

        speakers.add(speaker);

        return speakers;
    }

}
