package com.rafalstefanski.randomlistgenerator.controller.dog;

import com.fasterxml.jackson.databind.JsonNode;
import com.rafalstefanski.randomlistgenerator.model.dog.DogFact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/dog-gui")
public class FactsFromExternalApiController {

    public FactsFromExternalApiController() {
    }

    private DogFact getDogFact() {
        RestTemplate restTemplate = new RestTemplate();

        // getting facts from external API, below one with dog facts from https://dukengn.github.io/Dog-facts-API/
        DogFact[] forObject = restTemplate
                .getForObject("https://dog-facts-api.herokuapp.com/api/v1/resources/dogs?number=1",
                        DogFact[].class);

        // getting single data from API using JsonNode, used to get only image from JSON
        JsonNode jsonNodeImage = restTemplate.getForObject("https://dog.ceo/api/breeds/image/random", JsonNode.class).get("message");


        forObject[0].setSrc(jsonNodeImage.asText());
        forObject[0].setInfo(String.valueOf(forObject[0].getAdditionalProperties().values()));

        return forObject[0];
    }

    @GetMapping
    public String get(Model model) {
        model.addAttribute("dogFactImg", getDogFact());
        return "dog-gui/dogView";
    }


}
