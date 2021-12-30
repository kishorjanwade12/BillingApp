package com.billing.app.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.billing.app.dao.BillDao;
import com.billing.app.domain.MyBill;
import com.billing.app.mapper.BillMapper;

@Component
public class BillDaoImpl implements BillDao {

	@Autowired
	
	BillMapper mapper;
	
	@Override
	public List<MyBill> getAll() {
		// TODO Auto-generated method stub
		return mapper.getAll();
	}

	@Override
	public int saveBills(MyBill myBill) {
		// TODO Auto-generated method stub
		return mapper.saveBills(myBill);
	}

	@Override
	public List<MyBill> getByCompanyName(String companyName) {
		// TODO Auto-generated method stub
		return mapper.getByCompanyName(companyName);
	}

	@Override
	public List<MyBill> getByModelName(String modelName) {
		// TODO Auto-generated method stub
		return mapper.getByModelName(modelName);
	}

	@Override
	public List<MyBill> getByPriceRange(Double startPrice, Double endPrice) {
		// TODO Auto-generated method stub
		return mapper.getByPriceRange(startPrice,endPrice);
	}

	@Override
	public int updateBills(MyBill myBill) {
		// TODO Auto-generated method stub
		return mapper.updateBill(myBill);
	}

}
