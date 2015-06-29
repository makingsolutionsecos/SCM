/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.scm.dal.mappers;

import com.making.scm.dto.Dto;

/**
 *
 * @author camilomarroquin
 */
public interface IMapper {    
    public void entityToDto(Dto dto);
    
    public void dtoToEntity(Object dto);
}
