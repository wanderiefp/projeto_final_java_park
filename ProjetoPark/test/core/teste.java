package core;

import DAO.DBWorker;

import java.sql.Connection;

public class teste {
    
    public static void main(String[] args) {
        
        try (Connection sc = DBWorker.getConnection()){
            System.out.println("Sucesso");
            
        } catch (Exception e) {
            System.out.println("Erro");
            e.printStackTrace();
        }
    }
}
