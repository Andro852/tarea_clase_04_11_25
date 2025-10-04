
package com.mycompany.ejercicio_clase_04_10_25;

/**
 *
 * @author Jonatan
 */
public class cliente {
    private Integer codigo;
    private Integer edad;
    private String nombre;

    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    public Cliente(int codigo, String nombre, int edad) {
        this.codigo = codigo;
        this.edad = edad;
        this.nombre = nombre;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the edad
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
       
}
    
}
