package tech.alvarez.friends.model;

import java.util.List;

/**
 * Created by tony on 04/09/2017.
 */

public class Contactos
{
    private List<Amigo> contacto;
    public Contactos(List<Amigo>contacto)
    {
        this.contacto = contacto;
    }
    public List<Amigo> getContacto()
    {
        return contacto;
    }
    public void setContacto(List<Amigo>contacto)
    {
        this.contacto = contacto;
    }
}
