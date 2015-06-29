package com.making.scm.dto;

/**
 * Clase que representa un rol en el sistema-
 * @author John Dany osorio Ramos
 */
public class RolDto {
    
    /**
     * Identificador único para el rol.
     */    
    private int Id;
    
    /**
     * Nombre del rol.
     */
    private String Nombre;

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
