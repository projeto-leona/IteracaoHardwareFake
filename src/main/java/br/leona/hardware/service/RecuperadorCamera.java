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
public final class RecuperadorCamera implements RecuperadorServico{
        
    public RecuperadorCamera(){}
    
    @Override
    public Servico getServico() {  
                      
        Servico servico = new Servico();
        
        servico.setNome("Camera");
      
        servico.setStatus("Inativo");
         
        return servico;       
        
    }
    
}

