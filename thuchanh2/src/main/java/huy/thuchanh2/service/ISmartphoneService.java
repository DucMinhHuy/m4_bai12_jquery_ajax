package huy.thuchanh2.service;

import huy.thuchanh2.model.Smartphone;

import java.util.Optional;

public interface ISmartphoneService {
    Iterable<Smartphone>findAll();
    Optional<Smartphone>findById(Long id);
    Smartphone save(Smartphone smartphone);
    void remove(Long id);
}
