package py.com.sigo.ejb.model;

import java.io.Serializable;

public class HistorialClinico implements Serializable {
    private Long idHistorialClinico;

    private Long idPaciente;

    private static final long serialVersionUID = 1L;

    public Long getIdHistorialClinico() {
        return idHistorialClinico;
    }

    public void setIdHistorialClinico(Long idHistorialClinico) {
        this.idHistorialClinico = idHistorialClinico;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idHistorialClinico=").append(idHistorialClinico);
        sb.append(", idPaciente=").append(idPaciente);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}