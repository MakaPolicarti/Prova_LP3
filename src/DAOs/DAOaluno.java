/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Entidades.Aluno;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Usuario
 */
public class DAOaluno implements Serializable {

    public static EntityManager em = Persistence.createEntityManagerFactory("UP").createEntityManager();

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DAOaluno)) {
            return false;
        }
        DAOaluno other = (DAOaluno) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAOs.DAOaluno[ id=" + id + " ]";
    }

    public void criar(Aluno aluno) {

        //Aluno qualquercoisa = em.find(Aluno.class, aluno.getRa()); //procura o aluno pelo ra
        em.getTransaction().begin();//inicia uma transação

        /**
         * if (null == qualquercoisa) {
         */
        em.persist(aluno);

        /*} else {
                throw new Exception("aluno ja existente");
            }*/
        em.getTransaction().commit(); // salva a transação

    }

    public void atualizar(Aluno aluno) {

        em.getTransaction().begin();
        Aluno qualquercoisa = em.find(Aluno.class, aluno.getRa());

        qualquercoisa.setNome(aluno.getNome());
        qualquercoisa.setCursoNomeCurso(aluno.getCursoNomeCurso());
        qualquercoisa.setEmail(aluno.getEmail());
        qualquercoisa.setTelefone(aluno.getTelefone());

        
            em.merge(qualquercoisa);
        
        em.getTransaction().commit();

    }

    public void deletar(int ra) {

        Aluno qualquercoisa = em.find(Aluno.class, ra);

        
            em.getTransaction().begin();
            em.remove(qualquercoisa);
            em.getTransaction().commit();
        
    }

    public Aluno consultar(int ra) {
        Aluno qualquercoisa = null;

        qualquercoisa = em.find(Aluno.class, ra);


        return qualquercoisa;
    }

    public List<Aluno> consultarnome(String nome) {
        List<Aluno> qualquercoisa = null;

        TypedQuery<Aluno> query = em.createQuery(
                "SELECT a FROM Aluno a WHERE a.nome = :nome", Aluno.class);
        qualquercoisa = query.setParameter("nome", nome).getResultList();

        return qualquercoisa;
    }

    public List<Aluno> findall() {
        return em.createQuery("SELECT a FROM " + Aluno.class.getSimpleName() + " a").getResultList();
    }
    
    public List<Aluno> list() {
        return em.createQuery("SELECT e FROM Aluno e").getResultList();
    }
    public static void main(String[] args) {
        DAOaluno daOaluno = new DAOaluno();
        List<Aluno> listaAluno = daOaluno.list();
        for (Aluno aluno : listaAluno) {
            System.out.println(aluno.getCursoNomeCurso().getNomeCurso());
            
        }
    }

}
