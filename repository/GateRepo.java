package repository;

import exception.GateNotFoundException;
import model.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepo {
    private Map<Integer,Gate> gateMap;



    public GateRepo() {
        this.gateMap = new HashMap<>();
    }

    public Gate getGate(int gateId){
        if(!gateMap.containsKey(gateId)){
            throw new GateNotFoundException("Gate not found");
        }
        Gate gate = gateMap.get(gateId);
        return gate;
    }

    public void putGate(Gate gate){
        gateMap.put(gate.getId(),gate);
        System.out.println("Gate added successfully. Gate Type : "+ gate.getGateType() + " Gate No. : " + gate.getGateNumber());

    }
}
