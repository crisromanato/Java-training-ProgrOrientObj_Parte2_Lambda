package ProgramacaoOrientadaObjetos_Parte2_Lambda.HashCode_Equals.entities;

import java.util.Objects;

public class Client_2campos {
    private String name;
    private String email;

    public Client_2campos (String name, String email) {
        this.name  = name;
        this.email = email;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }
/*
Code usado no Eclipe.

    @Override
    public int hashCode () {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null)) ? 0 : name.hashCode ());
        return result;

    @Override
    public boolean equals (Object obj) {
        if ( this == obj )
            return true;
        if (obj == null)
            return false;
        if(getClass () != obj.getClass ())
        return false;
        Client other = (Client) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals (other.name))
            return false;
        return true;
 */

    @Override
    public boolean equals (Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof Client_2campos) ) return false;
        Client_2campos that = ( Client_2campos ) o;
        return getName ().equals (that.getName ()) &&
               getEmail ().equals (that.getEmail ());
    }

    @Override
    public int hashCode () {
        return Objects.hash (getName (), getEmail ());
    }
}





