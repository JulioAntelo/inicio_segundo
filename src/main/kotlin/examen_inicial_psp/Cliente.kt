package examen_orob


interface Cliente {
    fun aplicaDescuento(Producto:Producto) : Boolean{
        if (Producto.obtenerDescuento(descuentoProducto = int)>0)
    }
}