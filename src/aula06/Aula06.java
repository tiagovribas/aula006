/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

import aula06.carro.Carro;
import aula06.carro.CarroDao;
import aula06.carro.Marcas;
import aula06.db.Conexao;

/**
 *
 * @author Aluno
 */
public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro uno = new Carro();
        uno.setModelo("uno mille");
        uno.setMarca(Marcas.Fiat);
        uno.setCor("verde escuro");
        uno.setPlaca("asd5648");
        uno.setAnoFabricacao(1952);
        uno.setValor(1500.55);
        
        
        Conexao conexao = new Conexao();
        conexao.conectar();
                
        CarroDao dao = new CarroDao(conexao);
        dao.inserir(uno);
        
        conexao.fechar();
        
        
    }
    
}
