package core;

import persistence.DBWorker;

import java.sql.Connection;

public class teste {
    
    public static void main(String[] args) {
        
        
        DBWorker dbW;
        
        try (Connection sc = DBWorker.getConnection()){
            System.out.println("Sucesso");
            DBWorker.getConnection();
        } catch (Exception e) {
            System.out.println("Erro");
            e.printStackTrace();
        }
        
         try (dbW.Desconnection()){
            System.out.println("Desconectado com Sucesso");
        } catch (Exception e) {
            System.out.println("Erro");
            e.printStackTrace();
        }
    }
}
