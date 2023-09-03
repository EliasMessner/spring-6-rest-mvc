package guru.springframework.spring6restmvc.service;

import java.util.List;
import java.util.UUID;

import guru.springframework.spring6restmvc.model.Beer;

public interface BeerService {
    List<Beer> listBeers();

    Beer getBeerById(UUID id);

    Beer saveNewBeer(Beer beer);
}
