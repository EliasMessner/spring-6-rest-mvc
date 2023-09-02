package guru.springframework.spring6restmvc.controller;

import org.springframework.stereotype.Controller;

import guru.springframework.spring6restmvc.service.BeerService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;
}
