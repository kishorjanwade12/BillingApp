package com.billing.app.service;

import java.util.List;

import com.billing.app.domain.MyBill;

public interface BillService {
	public List<MyBill> getAll();

	public int saveBill(MyBill myBill);

	public List<MyBill> getByCompanyName(String companyName);

	public List<MyBill> getByModelName(String modelName);

	public List<MyBill> getByPriceRange(Double startPrice, Double endPrice);
}
