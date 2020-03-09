package com.gm.dsadmin.dao;

import com.github.pagehelper.Page;
import com.gm.dsadmin.po.Customer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    //customer
    Page<Customer> search(@Param("username") String username,
                          @Param("realName") String realName,
                          @Param("mobile") String mobile,
                          @Param("email") String email,
                          @Param("status") Byte status);
}