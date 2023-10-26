	package com.cibertec.repositorio;
	
	import org.springframework.data.jpa.repository.JpaRepository;
	
	import com.cibertec.modelo.Productos;
	
	public interface ProductoRepository extends JpaRepository<Productos, Integer> {
	   
	}
