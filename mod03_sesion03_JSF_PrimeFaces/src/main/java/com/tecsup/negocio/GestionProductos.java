package com.tecsup.negocio;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import com.tecsup.excepcion.DAOExcepcion;
import com.tecsup.modelo.Producto;

public class GestionProductos {
	
	static HashMap<Integer, Collection<Producto>> 
		productosXcategorias = new HashMap<Integer, Collection<Producto>>(); 
	
	static {
		productosXcategorias.put(new Integer(1), 
					Arrays.asList(new Producto(10,"Smartphone","Descripción Smartphone","phone",100),
								  new Producto(11,"Tablet","Descripción Tablet","tablet",200)));
		productosXcategorias.put(new Integer(2), 
				Arrays.asList(new Producto(20,"La Casa Verde","Descripción La Casa Verde","verde",300),
							  new Producto(21,"El Capitan Grant","Descripción El Capitan Grant","capitan",400)));
		productosXcategorias.put(new Integer(3), 
				Arrays.asList(new Producto(30,"Futbol","Descripción Futbol","futbol",500),
							  new Producto(31,"Voley","Descripción Voley","voley",600)));
	
	}
	
	public Collection<Producto> listarPorCategoria(int idCategoria) throws DAOExcepcion {
		// TODO Auto-generated method stub
		return productosXcategorias.get(idCategoria);
	}

	
}
