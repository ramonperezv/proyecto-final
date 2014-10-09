/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.clases;

/**
 *
 * @author ramon
 */
public class articulos {
    
  
  public articulos() {
   }
        
    
    
    private int      id              = 0;
    private String   marca           = null;
    private String   categoria       = null;
    private String   descripcion     = null;
    private String   modelo          = null;
    private int      precio          = 0;
    private int      usuario_id      = 0;
    
    public articulos(int id, 
                    String marca, 
                    String categoria, 
                    String descripcion, 
                    String modelo, 
                    int    precio,  
                    int    usuario_id){
        
        this.id             = id;
        this.marca          = marca;
        this.categoria      = categoria;
        this.descripcion    = descripcion;
        this.modelo         = modelo;
        this.precio         = precio;
        this.usuario_id     = usuario_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getUsuario_id() {
        return usuario_id;
    }
    
    
    
    
}
