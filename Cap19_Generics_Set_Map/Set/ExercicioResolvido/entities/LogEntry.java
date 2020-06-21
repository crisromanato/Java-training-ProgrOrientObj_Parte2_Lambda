package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Set.ExercicioResolvido.entities;

import java.util.Date;

public class LogEntry {
    /*
   atributos
    */
    private String username;
    private Date   moment;
    /*
    construtor
     */
    public LogEntry(String username, Date moment) {
        this.username = username;
        this.moment = moment;
    }
    /*
    getters and setters
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }
    /*
    precisamos definir o criterio para qual entrada de log é
    igaul a outra, como o problema precisa saber quais sao os usuarios
    unicos, vamos usar o nome do usuario,
    VAmos criar um set que nao vai aceitar a entrada de mais de um usuario
    e teremos o total de usuarios no final.
    VAmos gerar o hashcode equals

     */

        @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LogEntry other = (LogEntry) obj;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        return true;
}
}
