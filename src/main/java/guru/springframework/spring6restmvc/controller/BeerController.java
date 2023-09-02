package guru.springframework.spring6restmvc.controller;

import java.util.UUID;

import org.springframework.stereotype.Controller;

import guru.springframework.spring6restmvc.model.Beer;
import guru.springframework.spring6restmvc.service.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

    public Beer getBeerById(UUID id) {
        log.debug("Get Beer by Id in Controller");

        return beerService.getBeerById(id);
    }
}
