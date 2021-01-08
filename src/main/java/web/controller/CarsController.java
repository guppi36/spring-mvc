package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(required = false) Integer count, ModelMap model) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Audi", "1321asd2", 1200));
        carsList.add(new Car("BMW", "1231dsa9", 3200));
        carsList.add(new Car("Samovar", "2168eqs7", 11200));
        carsList.add(new Car("Lada", "9658dfs4", 23200));
        carsList.add(new Car("Reno", "8547lkj1", 5200));

        if(count == null) count = 5;
        CarService carService = new CarService(carsList);
        carsList = carService.getCarsList(count);

        model.addAttribute("cars", carsList);
        return "cars";
    }
}
