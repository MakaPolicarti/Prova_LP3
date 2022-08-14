/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "disciplina")
@NamedQueries({
    @NamedQuery(name = "Disciplina.findAll", query = "SELECT d FROM Disciplina d")})
public class Disciplina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "nome_disc")
    private String nomeDisc;
    @Id
    @Basic(optional = false)
    @Column(name = "cod_disc")
    private String codDisc;
    @JoinColumn(name = "turma_codigo", referencedColumnName = "codigo")
    @ManyToOne
    private Turma turmaCodigo;

    public Disciplina() {
    }

    public Disciplina(String codDisc) {
        this.codDisc = codDisc;
    }

    public Disciplina(String codDisc, String nomeDisc) {
        this.codDisc = codDisc;
        this.nomeDisc = nomeDisc;
    }

    public String getNomeDisc() {
        return nomeDisc;
    }

    public void setNomeDisc(String nomeDisc) {
        this.nomeDisc = nomeDisc;
    }

    public String getCodDisc() {
        return codDisc;
    }

    public void setCodDisc(String codDisc) {
        this.codDisc = codDisc;
    }

    public Turma getTurmaCodigo() {
        return turmaCodigo;
    }

    public void setTurmaCodigo(Turma turmaCodigo) {
        this.turmaCodigo = turmaCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDisc != null ? codDisc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Disciplina)) {
            return false;
        }
        Disciplina other = (Disciplina) object;
        if ((this.codDisc == null && other.codDisc != null) || (this.codDisc != null && !this.codDisc.equals(other.codDisc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Disciplina[ codDisc=" + codDisc + " ]";
    }
    
}
