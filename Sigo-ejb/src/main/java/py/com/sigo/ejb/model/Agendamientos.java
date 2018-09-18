package py.com.sigo.ejb.model;

import java.io.Serializable;
import java.util.Date;

public class Agendamientos implements Serializable {
    private Long idAgendamiento;

    private Long idProfesional;

    private Long idPaciente;

    private Date fecha;

    private static final long serialVersionUID = 1L;

    public Long getIdAgendamiento() {
        return idAgendamiento;
    }

    public void setIdAgendamiento(Long idAgendamiento) {
        this.idAgendamiento = idAgendamiento;
    }

    public Long getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(Long idProfesional) {
        this.idProfesional = idProfesional;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idAgendamiento=").append(idAgendamiento);
        sb.append(", idProfesional=").append(idProfesional);
        sb.append(", idPaciente=").append(idPaciente);
        sb.append(", fecha=").append(fecha);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}