package com.tecsup.negocio;

import java.util.ArrayList;
import java.util.Collection;

import com.tecsup.excepcion.DAOExcepcion;
import com.tecsup.modelo.Categoria;

public class GestionCategorias {

	static Collection<Categoria> categorias = new ArrayList<Categoria>(); 
	
	static {
		categorias.add(new Categoria(1,"Electrónica", "Descripción Electrónica"));
		categorias.add(new Categoria(2,"Libros", "Descripción Libros"));
		categorias.add(new Categoria(3,"Deportes", "Descripción Deportes"));
	}
	
	
	public Collection<Categoria> listar() throws DAOExcepcion {
		// TODO Auto-generated method stub
		return categorias;
	}

	
}

