package high.skill.girl.project.advert_board.controller;

import high.skill.girl.project.advert_board.dto.Advert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class AdvertBoardController {

    @GetMapping
    public String getTest() {
        return "success";
    }

    @PostMapping("/create")
    public void postAdvert(Advert advert) {

    }

    @GetMapping("/getAllByUserId")
    public List<Advert> getAllAdvertsByUserId(UUID userId) {
        return null;
    }

    @GetMapping("/getById")
    public Advert getAdvertById(UUID advertId) {
        return null;
    }

    @GetMapping("/getAllByCity")
    public List<Advert> getAllAdvertsFromCity(String city) {
        return null;
    }
}
