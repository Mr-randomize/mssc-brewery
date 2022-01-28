package com.iviberberi.msscbrewery.web.mappers;

import com.iviberberi.msscbrewery.domain.Customer;
import com.iviberberi.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto dto);
}
