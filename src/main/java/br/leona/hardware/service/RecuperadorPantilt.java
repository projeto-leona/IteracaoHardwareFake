/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.leona.hardware.service;

import br.leona.hardware.model.Servico;
/**
 *
 * @author Admin
 */
public final class RecuperadorPantilt implements RecuperadorServico{
        
    public RecuperadorPantilt(){}
    
    @Override
    public Servico getServico() {  
                      
        Servico servico = new Servico();
        
        servico.setNome("Pantilt");
      
        servico.setStatus("Inativo");
         
        return servico;       
        
    }
    
}