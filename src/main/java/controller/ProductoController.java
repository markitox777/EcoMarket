package controller;


import model.Producto;

public class ProductoController {

    public List<Producto> obtenerTodos() {
        return productoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> obtenerPorId(@PathVariable int id) {
        Optional<Producto> producto = productoService.obtenerPorId(id);
        return producto.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    public Producto crearProducto(@RequestBody Producto producto) {
        return productoService.guardar(producto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> actualizarProducto(@PathVariable int id, @RequestBody Producto productoActualizado) {
        Optional<Producto> producto = productoService.actualizar(id, productoActualizado);
        return producto.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable int id) {
        if (productoService.eliminar(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
}

}
