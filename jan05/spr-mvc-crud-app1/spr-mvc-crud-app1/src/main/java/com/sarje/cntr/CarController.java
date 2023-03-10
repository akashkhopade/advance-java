package com.sarje.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sarje.model.Car;
import com.sarje.service.CarService;

@Controller
public class CarController {
	
	@Autowired
	private CarService carService;

	@RequestMapping(value = {"/car_add_form.htm"})
	public String carAddForm(ModelMap model) {
		model.put("car", new Car());
		return "car_add_form";
	}
	
	@RequestMapping(value = {"/car_add.htm"},method = RequestMethod.POST)
	public String carAdd(Car car, ModelMap model) {
		carService.add(car);
		model.put("car", car);
		return "car_add_form";
	}
	
	@RequestMapping(value = {"/car_list.htm"},method = RequestMethod.GET)
	public String carList(ModelMap model) {
		List<Car> lst = carService.getAll();
		model.put("cars", lst);
		return "car_list";
	}
}
