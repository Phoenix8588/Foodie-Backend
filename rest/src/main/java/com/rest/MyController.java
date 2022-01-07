package com.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.rest.Rest;

@RestController
public class MyController {

	private static final Float NULL = null;
	@Autowired
	RestRepository restRepository;
	
	@GetMapping("/all")
	public List<Rest> getRest() {
		return (List<Rest>) restRepository.findAll();
	}


	@PostMapping("/add")
	public Rest saveRest(@RequestBody Rest res) {
		return restRepository.save(res);
	}

}
