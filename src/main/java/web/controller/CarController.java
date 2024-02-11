package web.controller;

import Service.CarServiceImp;
import Transport.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {
    @GetMapping("/cars")

    public String capsPage(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        if (count == null || count > 5 || count < 0) {
            count = 5;
        }
        model.addAttribute("countCars", "Количество выводимых машин = " + count);
        model.addAttribute("cars", CarServiceImp.showCars(count));
        return "cars";
  }

}











