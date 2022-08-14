/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "curso")
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c")})
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nome_curso")
    private String nomeCurso;
    @Basic(optional = false)
    @Column(name = "duracao")
    private int duracao;
    @Basic(optional = false)
    @Column(name = "coordenador")
    private String coordenador;
    @OneToMany(mappedBy = "cursoNomeCurso")
    private List<Aluno> alunoList;
    @OneToMany(mappedBy = "cursoNomeCurso")
    private List<Turma> turmaList;

    public Curso() {
    }

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Curso(String nomeCurso, int duracao, String coordenador) {
        this.nomeCurso = nomeCurso;
        this.duracao = duracao;
        this.coordenador = coordenador;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

    public List<Turma> getTurmaList() {
        return turmaList;
    }

    public void setTurmaList(List<Turma> turmaList) {
        this.turmaList = turmaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nomeCurso != null ? nomeCurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.nomeCurso == null && other.nomeCurso != null) || (this.nomeCurso != null && !this.nomeCurso.equals(other.nomeCurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Curso[ nomeCurso=" + nomeCurso + " ]";
    }
    
}
