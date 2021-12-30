package com.billing.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.app.dao.BillDao;
import com.billing.app.domain.MyBill;
import com.billing.app.service.BillService;

@Service
public class BillServiceImpl implements BillService{

	@Autowired
	BillDao dao;
	
	@Override
	public List<MyBill> getAll() {
		// TODO Auto-generated method stub
		
		
		return dao.getAll();
	}

	@Override
	public int saveBill(MyBill myBill) {
		// TODO Auto-generated method stub
		double totalPrice=(myBill.getPrice()+((myBill.getPrice()/100)*myBill.getGstPercentage())-myBill.getDiscount());
		myBill.setTotalPrice(totalPrice);
		
		List<MyBill> list=dao.getAll();
		int flag=0;
		
		for(MyBill billList:list) {
			if( billList.getCompanyName().toLowerCase().equals(myBill.getCompanyName().toLowerCase())&&
				billList.getModelName().toLowerCase().equals(myBill.getModelName().toLowerCase()) &&
				billList.getRam()==myBill.getRam() && 
				billList.getStorage()==myBill.getStorage()) 
				{
						myBill.setId(billList.getId());
						myBill.setAvailableQty(myBill.getAvailableQty()+billList.getAvailableQty());
						//return dao.updateBills(myBill);
						flag=1;
						break;
				}
		}
		
		if(flag==1) {
			return dao.updateBills(myBill);
		}else {
			return dao.saveBills(myBill);
		}

		
		
	}

	@Override
	public List<MyBill> getByCompanyName(String companyName) {
		// TODO Auto-generated method stub
		return dao.getByCompanyName(companyName);
	}

	@Override
	public List<MyBill> getByModelName(String modelName) {
		// TODO Auto-generated method stub
		return dao.getByModelName(modelName);
	}

	@Override
	public List<MyBill> getByPriceRange(Double startPrice, Double endPrice) {
		// TODO Auto-generated method stub
		return dao.getByPriceRange(startPrice,endPrice);
	}

}
