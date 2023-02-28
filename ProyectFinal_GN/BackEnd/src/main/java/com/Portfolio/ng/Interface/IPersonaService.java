package com.Portfolio.ng.Interface;

import com.Portfolio.ng.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Para traer una lista de personas
    public List<Persona> getPersona();
    
    //Para Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminamos un objeto que lo buscamos por Id
    public void deletePersona(Long Id);
    
    //Buscmos una persona por Id
    public Persona findPersona(Long Id);
}
