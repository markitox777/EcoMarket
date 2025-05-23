package controller;

import model.Cliente;
import model.Producto;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class ProductoController {

    public List<Producto> ListaProducto = new ArrayList<Producto>();

    public boolean agregarProducto(Producto newProducto) {
            return ListaProducto.add(newProducto);
    }


    public List<Producto> obtenerTodos() {
        return ListaProducto;
    }

    //Actualizar
    public boolean actualizarProducto(int id, int stock, String nombre, String categoria, float precio, Producto productoActualizado) {
        for (int i = 0; i < ListaProducto.size(); i++) {
            Producto producto = ListaProducto.get(i);
            if (producto.getIdProducto() == id) {
                ListaProducto.set(i, productoActualizado);
                producto.setIdProducto(id);
                producto.setStockProducto(stock);
                producto.setNombreProducto(nombre);
                producto.setCategoriaProducto(categoria);
                producto.setPrecioProducto(precio);
                return true;
            }
        }
        return false; // Si no se encuentra, retornamos false
    }

    public boolean eliminarProducto(int id) {
        for (int i = 0; i < ListaProducto.size(); i++) {
            Producto producto = ListaProducto.get(i);
            if (producto.getIdProducto() == id) {
                ListaProducto.remove(i);
                return true;
            }
        }
        return false;
    }
}
