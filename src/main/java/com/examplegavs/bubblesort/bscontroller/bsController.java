package com.examplegavs.bubblesort.bscontroller;

import java.lang.reflect.Array;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examplegavs.bubblesort.bsservice.bsService;
import com.examplegavs.bubblesort.msservice.msService;

@RestController

public class bsController {
	
	@Autowired
	bsService bsservice;

	@GetMapping("/bubblesort")
	public int[] run(@RequestBody int[] array) {
		bsservice.bubblesort(array);
		return array; 
	}

	@GetMapping("/mergesort")
	public int[] msort(@RequestBody int[] array,int l ,int m, int r) {
		msService.merge(array, l, m, r);
		return array; 
	}
	

}


