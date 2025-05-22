package model;

public class Producto {
    //Atributos
    private int idProducto;
    private int StockProducto;
    private String nombreProducto;
    private String categoriaProducto;
    private float precioProducto;

    //get obtener
    public int getIdProducto() {
        return idProducto;
    }

    public int getStockProducto() {
        return StockProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    //Set cambiar
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setStockProducto(int stockProducto) {
        StockProducto = stockProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }
}

