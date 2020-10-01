package com.home.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClothesMapper {
	
	ClothesMapper INSTANCE = Mappers.getMapper( ClothesMapper.class );
	
	@Mapping(source="pogId", target="pogId")
	@Mapping(source="supc", target="supc")
	@Mapping(source="brand", target="brand")
	@Mapping(source="description", target="description")
	@Mapping(source="size", target="size")
	@Mapping(source="category", target="category")
	@Mapping(source="subCategory", target="subCategory")
	@Mapping(source="price", target="price")
	@Mapping(source="quantity", target="quantity")
	@Mapping(source="country", target="country")
	@Mapping(source="sellerCode", target="sellerCode")
	@Mapping(source="creationtime", target="creationtime")
	@Mapping(source="stock", target="stock")
	ClothesDTO clothesToClothesDTO(Clothes clothes);

}
