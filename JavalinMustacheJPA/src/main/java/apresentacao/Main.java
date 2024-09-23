/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import negocio.Endereco;
import negocio.Pessoa;

/**
 *
 * @author iapereira
 */
public class Main {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MeuPU");
    
    public static void main(String[] args) {        
        EntityManager entityManager = entityManagerFactory.createEntityManager();        
        entityManager.getTransaction().begin();
        Pessoa igor = new Pessoa();
        igor.setNome("Igor");
        Endereco igorEnd = new Endereco();
        igorEnd.setBairro("IgorBairro");
        entityManager.persist(igorEnd);
        igor.setEndereco(igorEnd);
        entityManager.persist(igor);
        entityManager.getTransaction().commit();
        entityManager.close();    
        
    }
}