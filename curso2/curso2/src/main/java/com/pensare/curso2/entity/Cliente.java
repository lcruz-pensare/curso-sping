package com.pensare.curso2.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name="Clientes") // En bases de datos las tablas van en plural y las clases en java son singular
public class Cliente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;//La etiqueta @Column se puede suprimir si el nombre de la columna es igual al nombre del atributo
    private String apellido;
    private String email;
    @Column(name="creat_at")
    @Temporal(TemporalType.DATE)//Convertir la fecha de la base de datos
    private Date creatAt; //En Java la convencion es separar palabras con mayuscula nombeUsuario, en base de datos  es nombre_usuario

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(Date creatAt) {
        this.creatAt = creatAt;
    }

    private static final long serialVersionUID=1L;// NO se para que es
}
