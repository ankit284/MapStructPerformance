package com.home.mapper;

import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-01T09:37:03+0530",
    comments = "version: 1.4.0.Final, compiler: javac, environment: Java 1.8.0_121 (Oracle Corporation)"
)
public class ClothesMapperImpl implements ClothesMapper {

    @Override
    public ClothesDTO clothesToClothesDTO(Clothes clothes) {
        if ( clothes == null ) {
            return null;
        }

        ClothesDTO clothesDTO = new ClothesDTO();

        clothesDTO.setPogId( clothes.getPogId() );
        clothesDTO.setSupc( clothes.getSupc() );
        clothesDTO.setBrand( clothes.getBrand() );
        clothesDTO.setDescription( clothes.getDescription() );
        clothesDTO.setSize( clothes.getSize() );
        clothesDTO.setCategory( clothes.getCategory() );
        clothesDTO.setSubCategory( clothes.getSubCategory() );
        clothesDTO.setPrice( clothes.getPrice() );
        clothesDTO.setQuantity( clothes.getQuantity() );
        clothesDTO.setCountry( clothes.getCountry() );
        clothesDTO.setSellerCode( clothes.getSellerCode() );
        clothesDTO.setCreationtime( clothes.getCreationtime() );
        clothesDTO.setStock( clothes.getStock() );

        return clothesDTO;
    }
}
