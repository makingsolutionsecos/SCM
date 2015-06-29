/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.dal.mappers;

import com.making.scm.dto.Dto;

/**
 *
 * @author Camilo Marroquin
 */
public interface IMapper {    

    /**
     *
     * @param entityObject
     * @param dto
     * @return
     */
    public Dto entityToDto(Object entityObject);
    
    /**
     *
     * @param dto
     */
    public void dtoToEntity(Dto dto);
}
