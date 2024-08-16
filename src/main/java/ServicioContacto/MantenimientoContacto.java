/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicioContacto;

import com.mycompany.contactos.Contacto;
import java.util.ArrayList;

/**
 *
 * @author deivt
 */
public class MantenimientoContacto {
    private ArrayList<Contacto> lstContactos = new ArrayList<Contacto>();

    public ArrayList<Contacto> getListaContactos() {
        return lstContactos;
    }
    
    public void guardarContacto(Contacto contacto)
    {
        lstContactos.add(contacto);
    }
    
    public void eliminarContacto(int posicion)
    {
        lstContactos.remove(posicion);
    }
    
    public void modificarContacto(int posicion, Contacto contacto)
    {
        lstContactos.set(posicion, contacto);
    }
}
