/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_extra_5.Entidades;

/**
 *
 * @author droa
 */
public class meses {
    //Atributos
    private static final String[] mes={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto;
    private boolean acertado;

    //Constructores
    public meses() {
        this.mesSecreto=mes[5];
        this.acertado=false;
    }
  
    public meses(boolean acertado) {
        this.mesSecreto=mes[5];
        this.acertado = acertado;
    }
   
    //Metodos

    public boolean esAcertado() {
        return acertado;
    }
    
    public String getMesSecreto(){
        return mesSecreto;
    }
        
    public void setAcertado(boolean acertado) {
        this.acertado = acertado;
    }
    
    
    
    
   
    
}
