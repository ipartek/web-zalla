package com.ipartek.ejemplo.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor()
public class Usuario {
	private long id;
	private String nombre, apellido;
}
