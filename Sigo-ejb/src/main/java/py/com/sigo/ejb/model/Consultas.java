package py.com.sigo.ejb.model;

import java.io.Serializable;

public class Consultas implements Serializable {
    private Long idConsulta;

    private Long idAgendamiento;

    private static final long serialVersionUID = 1L;

    public Long getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Long idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Long getIdAgendamiento() {
        return idAgendamiento;
    }

    public void setIdAgendamiento(Long idAgendamiento) {
        this.idAgendamiento = idAgendamiento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idConsulta=").append(idConsulta);
        sb.append(", idAgendamiento=").append(idAgendamiento);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}