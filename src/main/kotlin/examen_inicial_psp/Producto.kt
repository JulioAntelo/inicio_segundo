package examen_orob

abstract class Producto(Titulo: String, precio: Float, Año_publicacion: Int, descuentoProducto: Int = 0) {
    open fun obtenerDescuento(descuentoProducto: Int):Int{
        return descuentoProducto
    }
}
