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
    public String printWelcome(@RequestParam(required = false) String limit, ModelMap model) {

        List<String> messages = new ArrayList<>();

        CarService carService = new CarService();
        List<Car> carList;

        if (limit != null) {
            carList = carService.getCarList(Integer.valueOf(limit));
        } else {
            carList = carService.getCarList();
        }

        messages.add("Cars List");
        model.addAttribute("pageTitle", "car list page");
        model.addAttribute("carList", carList);
        model.addAttribute("messages", messages);

        return "cars";
    }

}
