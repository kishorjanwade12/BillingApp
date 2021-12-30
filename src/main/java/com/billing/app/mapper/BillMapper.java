package com.billing.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.billing.app.domain.MyBill;

@Mapper
public interface BillMapper {

	@Select("select * from mybills")
	public List<MyBill> getAll();

	@Insert("insert into mybills values(#{myBill.id},#{myBill.companyName},#{myBill.modelName},"
			+ "#{myBill.ram},#{myBill.storage},#{myBill.availableQty},#{myBill.price},"
			+ "#{myBill.gstPercentage},#{myBill.discount},#{myBill.totalPrice})")
	public int saveBills(@Param("myBill") MyBill myBill);

	@Select("select * from mybills where companyName=#{companyName}")
	public List<MyBill> getByCompanyName(@Param("companyName") String companyName);

	@Select("select * from mybills where modelName=#{modelName}")
	public List<MyBill> getByModelName(@Param("modelName") String modelName);

	@Select("select * from mybills where price between #{startPrice} and #{endPrice}")
	public List<MyBill> getByPriceRange(@Param("startPrice") Double startPrice,@Param("endPrice") Double endPrice);

	@Update("update mybills set companyName=#{myBill.companyName},modelName=#{myBill.modelName},"
			+ "ram=#{myBill.ram},storage=#{myBill.storage},availableQty=#{myBill.availableQty},"
			+ "price=#{myBill.price},gstPercentage=#{myBill.gstPercentage},"
			+ "discount=#{myBill.discount},totalPrice=#{myBill.totalPrice} where id=#{myBill.id}")
	public int updateBill(@Param("myBill") MyBill myBill);
}
