package br.com.web.tournament.jzsports.service;

import br.com.web.tournament.jzsports.model.entity.Classification;

import java.util.List;

public interface ClassificationService {

    Classification save(Classification classification);
    Classification update(Classification classification);
    Classification findById(Long id);
    List<Classification> findAll();

}
