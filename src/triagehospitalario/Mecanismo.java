/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triagehospitalario;


/**
 *
 * @author Janeth
 */
public class Mecanismo {
    
    private String result = "";
    TriageHospitalario tr;
    String Dolor,Liquido,Sangra="";
    
    
    public Mecanismo(){
    
        tr = new TriageHospitalario();
        tr.BaseConocimiento();
        tr.rules();
    }
    
    public String getResult(){
        
        return result;
        
   }

    public void setResult(String result) {
        this.result = result;
    }
    
    
    
    public String obtRango(String rango){
        tr.getRango().setValue(rango);
        tr.getBaserules().forwardChain();
        result = tr.getResulRango().getValue();
        return result;
    }

    public String obtDato1(String answer) {
        Sangra = answer;
        return result;
       }

    public String obtDato2(String answer3) {
       Dolor = answer3;
        return result;
    }

    public String obtDato3(String answer4) {
        Liquido = answer4;
        return result;
        
     }

    public String resInt(String answer2, String answer3, String answer4) {
        tr.getResulRango().setValue(tr.getResulRango().getValue());
        tr.getSangradoTransv().setValue(answer2);
        tr.getDolor().setValue(answer3);
        tr.getLiquido().setValue(answer4);
        tr.getBaserules().forwardChain();
        result = tr.getResulInter1().getValue();
        return result;
      
    }

    public String obtMovFet(String answer) {
        tr.getResulInter1().setValue(tr.getResulInter1().getValue());
        tr.getMovFetales().setValue(answer);
        tr.getBaserules().forwardChain();
        result = tr.getResulMovFetales().getValue();
        return result;
    }

    public String obtHipArt(String answer) {
        tr.getResulMovFetales().setValue(tr.getResulMovFetales().getValue());
        tr.getPresArterial().setValue(answer);
        tr.getBaserules().forwardChain();
        result = tr.getResPresArterial().getValue();
        return result;
     }

    public String obtFrecCar(String answer7) {
         tr.getResPresArterial().setValue(tr.getResPresArterial().getValue());
        tr.getFrecuenciaCardiaca().setValue(answer7);
        tr.getBaserules().forwardChain();
        result = tr.getResFrecuenciaCardiaca().getValue();
        return result;
    }

    public String obtTemp(String answer8) {
        tr.getResPresArterial().setValue(tr.getResPresArterial().getValue());
        tr.getFrecuenciaCardiaca().setValue(answer8);
        tr.getBaserules().forwardChain();
        result = tr.getResFrecuenciaCardiaca().getValue();
        return result;
    }

    
    
    
    
    
}
