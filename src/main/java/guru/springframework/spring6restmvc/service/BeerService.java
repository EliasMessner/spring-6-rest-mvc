package guru.springframework.spring6restmvc.service;

import java.util.UUID;

import guru.springframework.spring6restmvc.model.Beer;

public interface BeerService {
    Beer getBeerById(UUID id);
}
