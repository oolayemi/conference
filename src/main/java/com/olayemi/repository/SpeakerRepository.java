package com.olayemi.repository;

import com.olayemi.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
