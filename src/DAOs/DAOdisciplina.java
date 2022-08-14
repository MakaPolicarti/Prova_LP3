/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;


import Entidades.Disciplina;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;

/**
 *
 * @author Usuario
 */

public class DAOdisciplina implements Serializable {
    
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
        if (!(object instanceof DAOdisciplina)) {
            return false;
        }
        DAOdisciplina other = (DAOdisciplina) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAOs.DAOdisciplina[ id=" + id + " ]";
    }
    
    public void criar(Disciplina disc){


       //Aluno qualquercoisa = em.find(Aluno.class, aluno.getRa()); //procura o aluno pelo ra
  
            em.getTransaction().begin();//inicia uma transação

            /**if (null == qualquercoisa) {*/
                em.persist(disc);

            /*} else {
                throw new Exception("aluno ja existente");
            }*/
            em.getTransaction().commit(); // salva a transação
       
    }
    
    public void atualizar (Disciplina disc){
        
        Disciplina qualquercoisa = em.find(Disciplina.class, disc.getCodDisc());
        
       
            em.getTransaction().begin();
            
           
                em.merge(disc);
            
            em.getTransaction().commit();            
            
     
    }
    
    public void deletar (String codDisc){
        
        
        Disciplina qualquercoisa = em.find(Disciplina.class, codDisc);
        
       
            em.getTransaction().begin();
            em.remove(qualquercoisa);
     
    }
    
    public Disciplina consultar (String codDisc){
        Disciplina qualquercoisa = null;
         
            qualquercoisa = em.find(Disciplina.class, codDisc);
            
          
     
       
        
      return qualquercoisa;  
    }
    
    public List<Disciplina> findall() {
        return em.createQuery("SELECT a FROM " + Disciplina.class.getSimpleName() + " a").getResultList();
    }
}
