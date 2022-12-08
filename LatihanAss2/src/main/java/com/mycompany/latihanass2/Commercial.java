
package com.mycompany.latihanass2;

public class Commercial extends Aircraft implements Cargo {
    public int passengerSize;

    public Commercial(int passengerSize) {
        this.passengerSize = passengerSize;
    }
    
    public int Commercial(int passengerSize){
        return passengerSize;
    }
    @Override
    public void loadCargo() {
        
    }

    @Override
    public void unloadCargo() {
        
    }
    
    
}
