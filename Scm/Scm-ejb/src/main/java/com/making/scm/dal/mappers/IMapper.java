/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.dal.mappers;

import com.making.scm.dto.Dto;
import com.making.scm.persistencia.EntityObject;

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
    public Dto entityToDto(EntityObject entityObject);
    
    /**
     *
     * @param dto
     * @return 
     */
    public EntityObject dtoToEntity(Dto dto);
}
