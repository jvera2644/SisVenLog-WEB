/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author admin
 */
@Embeddable
public class BoletasDetPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_empr")
    private short codEmpr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nro_boleta")
    private long nroBoleta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "cod_instr")
    private String codInstr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_banco")
    private short codBanco;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "nro_cheque")
    private String nroCheque;

    public BoletasDetPK() {
    }

    public BoletasDetPK(short codEmpr, long nroBoleta, String codInstr, short codBanco, String nroCheque) {
        this.codEmpr = codEmpr;
        this.nroBoleta = nroBoleta;
        this.codInstr = codInstr;
        this.codBanco = codBanco;
        this.nroCheque = nroCheque;
    }

    public short getCodEmpr() {
        return codEmpr;
    }

    public void setCodEmpr(short codEmpr) {
        this.codEmpr = codEmpr;
    }

    public long getNroBoleta() {
        return nroBoleta;
    }

    public void setNroBoleta(long nroBoleta) {
        this.nroBoleta = nroBoleta;
    }

    public String getCodInstr() {
        return codInstr;
    }

    public void setCodInstr(String codInstr) {
        this.codInstr = codInstr;
    }

    public short getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(short codBanco) {
        this.codBanco = codBanco;
    }

    public String getNroCheque() {
        return nroCheque;
    }

    public void setNroCheque(String nroCheque) {
        this.nroCheque = nroCheque;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codEmpr;
        hash += (int) nroBoleta;
        hash += (codInstr != null ? codInstr.hashCode() : 0);
        hash += (int) codBanco;
        hash += (nroCheque != null ? nroCheque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BoletasDetPK)) {
            return false;
        }
        BoletasDetPK other = (BoletasDetPK) object;
        if (this.codEmpr != other.codEmpr) {
            return false;
        }
        if (this.nroBoleta != other.nroBoleta) {
            return false;
        }
        if ((this.codInstr == null && other.codInstr != null) || (this.codInstr != null && !this.codInstr.equals(other.codInstr))) {
            return false;
        }
        if (this.codBanco != other.codBanco) {
            return false;
        }
        if ((this.nroCheque == null && other.nroCheque != null) || (this.nroCheque != null && !this.nroCheque.equals(other.nroCheque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidad.BoletasDetPK[ codEmpr=" + codEmpr + ", nroBoleta=" + nroBoleta + ", codInstr=" + codInstr + ", codBanco=" + codBanco + ", nroCheque=" + nroCheque + " ]";
    }
    
}
