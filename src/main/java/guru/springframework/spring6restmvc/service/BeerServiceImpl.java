package guru.springframework.spring6restmvc.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.spring6restmvc.model.Beer;
import guru.springframework.spring6restmvc.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID id) {
        log.debug("Get Beer Id - in Service " + id.toString());

        return Beer.builder()
                .id(id)
                .version(1)
                .beerName("Sternburg")
                .beerStyle(BeerStyle.EXPORT)
                .upc("12345")
                .price(new BigDecimal("0.59"))
                .quantityOnHand(122)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
    }
}
