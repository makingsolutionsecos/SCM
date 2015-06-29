package com.making.scm.dto;

/**
 * Clase que representa un rol en el sistema-
 *
 * @author John Dany osorio Ramos
 */
public class RolDto {

    /**
     * Identificador único para el rol.
     */
    private int id;

    /**
     * Nombre del rol.
     */
    private String nombre;

    /**
     * @return the Id
     */
    public int getId() {
        return id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.id = Id;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

}
