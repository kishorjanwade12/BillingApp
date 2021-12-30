package com.billing.app.dao;

import java.util.List;

import com.billing.app.domain.MyBill;

public interface BillDao {
	public List<MyBill> getAll();

	public int saveBills(MyBill myBill);

	public List<MyBill> getByCompanyName(String companyName);

	public List<MyBill> getByModelName(String modelName);

	public List<MyBill> getByPriceRange(Double startPrice, Double endPrice);

	public int updateBills(MyBill myBill);
}
