	package com.cibertec.servicio;
	
	import java.util.List;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	
	import com.cibertec.modelo.Carrito;
	import com.cibertec.modelo.Productos;
	import com.cibertec.repositorio.CarritoRepository;
	
	@Service
	public class CarritoServiceImpl implements CarritoService {
	
	    @Autowired
	    private CarritoRepository carritoRepository;
	
	    @Override
	    public void agregarAlCarrito(Productos producto) {
	        Carrito carrito = obtenerCarrito(); 
	        carrito.getProductos().add(producto);
	        carritoRepository.save(carrito);
	    }
	
	    @Override
	    public List<Productos> obtenerProductosEnCarrito() {
	        Carrito carrito = obtenerCarrito(); 
	        return carrito.getProductos();
	    }
	
	    @Override
	    public double calcularMontoTotal() {
	        Carrito carrito = obtenerCarrito(); 
	        List<Productos> productos = carrito.getProductos();
	        double montoTotal = 0.0;
	        for (Productos producto : productos) {
	            montoTotal += producto.getPrecio();
	        }
	        return montoTotal;
	    }
	
	    @Override
	    public void procesarCompra() {
	        // Implementa la lógica para procesar la compra
	    }
	
	    @Override
	    public void cancelarCompra() {
	        // Implementa la lógica para cancelar la compra
	    }
	
	    @Override
	    public Productos obtenerProductoPorId(Integer id) {
	        // Implementa la lógica para obtener un producto por su ID
	        // Esto podría implicar buscar en la base de datos o en la lista de productos en el carrito
	        return null; // Cambia esto con la lógica real
	    }
	
	    private Carrito obtenerCarrito() {
	        // Implementa la lógica para obtener el carrito
	        // Si no hay autenticación de usuario, esto puede ser simplemente una nueva instancia de Carrito
	        return new Carrito(); 
	    }
	}
