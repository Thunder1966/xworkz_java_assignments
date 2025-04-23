package com.xworkz.connector.external;
import com.xworkz.connector.internal.Connector;

public class ConnectorUser {

    Connector connector;

    public ConnectorUser(Connector connector){
        System.out.println("Constructor of ConnectorUser");
        this.connector=connector;
    }
    public void execute(){
        System.out.println("Execute in ConnectorUser");
        if(this.connector!=null){
            this.connector.run();
        }
    }
}