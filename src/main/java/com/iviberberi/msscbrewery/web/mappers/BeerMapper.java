package com.iviberberi.msscbrewery.web.mappers;

import com.iviberberi.msscbrewery.domain.Beer;
import com.iviberberi.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
