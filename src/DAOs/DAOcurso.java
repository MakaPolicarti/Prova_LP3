/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;



import Entidades.Curso;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */

public class DAOcurso implements Serializable {
    
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
        if (!(object instanceof DAOcurso)) {
            return false;
        }
        DAOcurso other = (DAOcurso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAOs.DAOcurso[ id=" + id + " ]";
    }
    
     public void criar(Curso curso){


       //Aluno qualquercoisa = em.find(Aluno.class, aluno.getRa()); //procura o aluno pelo ra
  
            em.getTransaction().begin();//inicia uma transação

            /**if (null == qualquercoisa) {*/
                em.persist(curso);

            /*} else {
                throw new Exception("aluno ja existente");
            }*/
            em.getTransaction().commit(); // salva a transação
       
    }
    
    public void atualizar (Curso curso) {
        
        Curso qualquercoisa = em.find(Curso.class, curso.getNomeCurso());
        
    
            em.getTransaction().begin();
                em.merge(curso);
            em.getTransaction().commit();            
            
       
    }
    
    public void deletar (String nCurso){
        
        
        Curso qualquercoisa = em.find(Curso.class, nCurso);
        
      
            em.getTransaction().begin();
            em.remove(qualquercoisa);
            em.getTransaction().commit();
      
    }
    
    public Curso consultar (String nCurso){
        Curso qualquercoisa = null;
         
            qualquercoisa = em.find(Curso.class, nCurso);
            
           
            
     
       
        
      return qualquercoisa;  
    }
    
    public List<Curso> findall() {
        return em.createQuery("SELECT a FROM " + Curso.class.getSimpleName() + " a").getResultList();
    }
    
    public List<Curso> list() {
        return em.createQuery("SELECT e FROM Curso e").getResultList();
    }
    public static void main(String[] args) {
        DAOcurso daOcurso = new DAOcurso();
        List<Curso> listaCurso = daOcurso.list();
        for (Curso curso : listaCurso) {
            System.out.println(curso.getNomeCurso());
            
        }
    }
}
