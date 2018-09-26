package py.com.sigo.ejb.model;

import java.io.Serializable;

public class Procedimientos implements Serializable {
    private Long idProcedimiento;

    private Long idClinica;

    private String nombre;

    private Long costo;

    private static final long serialVersionUID = 1L;

    public Long getIdProcedimiento() {
        return idProcedimiento;
    }

    public void setIdProcedimiento(Long idProcedimiento) {
        this.idProcedimiento = idProcedimiento;
    }

    public Long getIdClinica() {
        return idClinica;
    }

    public void setIdClinica(Long idClinica) {
        this.idClinica = idClinica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getCosto() {
        return costo;
    }

    public void setCosto(Long costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idProcedimiento=").append(idProcedimiento);
        sb.append(", idClinica=").append(idClinica);
        sb.append(", nombre=").append(nombre);
        sb.append(", costo=").append(costo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}