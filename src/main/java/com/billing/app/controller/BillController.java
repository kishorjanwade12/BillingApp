package com.billing.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billing.app.domain.MyBill;
import com.billing.app.service.BillService;

@RestController
@RequestMapping("/myBills")
public class BillController {
	
	@Autowired
	BillService service;
	
	@GetMapping("/getAll")
	public List<MyBill> getAll(){
		
		return service.getAll();
	}

	@PostMapping("/saveBill")
	public int saveBill(@RequestBody MyBill myBill) {
		return service.saveBill(myBill);
	}
	
	@PostMapping("/updateBill")
	public int updateBill(@RequestBody MyBill myBill) {
		return service.saveBill(myBill);
	}
	
	@GetMapping("/getByCompanyName/{companyName}")
	public List<MyBill> getByCompanyName(@PathVariable("companyName") String companyName){
		return service.getByCompanyName(companyName);
	}
	
	@GetMapping("/getByModelName/{modelName}")
	public List<MyBill> getByModelName(@PathVariable("modelName") String modelName){
		return service.getByModelName(modelName);
	}
	
	@GetMapping("/getByPriceRange/{startPrice}/{endPrice}")
	public List<MyBill> getByPriceRange(@PathVariable("startPrice") Double startPrice,@PathVariable("endPrice") Double endPrice){
		return service.getByPriceRange(startPrice,endPrice);
	}
	
}
