package com.yapro.task1.Controller;


import com.yapro.task1.Data.Promo;
import com.yapro.task1.Exceptions.NotFoundEception;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("promo")
public class PromoController {
    private int counter = 1;

    public List<Promo> promos = new ArrayList();
//    public List<Promo> promos = new ArrayList(){{
//        add(new Promo(1, "Одуванчик", "бла бла"));
//        add(new Promo(2, "Лакричка", "бла бла"));
//    }}; для тестов

    @PostMapping
    public Promo create(@RequestBody Promo promo) {
        promo.setId(counter++);

        promos.add(promo);
        return promo;
    }

    @GetMapping
    public List<Promo> list(){
        return promos;
    }

    @GetMapping("{id}")
    public Promo getOne(@PathVariable String id) {
        return getPromo(id);
    }

    private Promo getPromo(String id) {
        int i = Integer.parseInt(id);
        return promos.stream()
                .filter(promo -> i == promo.getId())
                .findFirst()
                .orElseThrow(NotFoundEception::new);
    }

    // не успел протестировать
    @PutMapping("{id}")
    public Promo update(@PathVariable String id, @RequestBody Promo promo) {
        Promo promoFromDb = getPromo(id);

        promoFromDb.setName(promo.getName());
        promoFromDb.setDescription(promo.getDescription());
        promoFromDb.setId(Integer.parseInt(id));

        return promoFromDb;
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        Promo promo = getPromo(id);

        promos.remove(promo);
    }
}
