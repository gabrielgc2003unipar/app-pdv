package com.mycompany.app.pdv.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EntityManagerUtil {
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    public static EntityManagerFactory getEntityManagerFactory(){
        if(emf == null){
            emf = Persistence
                    .createEntityManagerFactory("DesktopPU");      
            System.out.println("Conexão aberta");
        }
        return emf;
    }
    public static EntityManager getManager(){
        if(em == null || !em.isOpen()){
            em = getEntityManagerFactory().createEntityManager();
            System.out.println("COnexão aberta");
        }
        return em;
    }
    public static void closeEntityManagerFactory(){
        if(emf != null && emf.isOpen()){
            emf.close();
            System.out.println("Conexão Fechada!");
        }
    }
    
}


