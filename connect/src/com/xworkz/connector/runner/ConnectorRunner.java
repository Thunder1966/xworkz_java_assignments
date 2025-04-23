package com.xworkz.connector.runner;

import com.xworkz.connector.external.ConnectorUser;
import com.xworkz.connector.internal.Connector;
import com.xworkz.connector.internal.Connectorimpl;

public class ConnectorRunner {
    public static void main(String[] args) {
        Connector connector = new Connectorimpl();
        ConnectorUser connectorUser = new ConnectorUser(connector);
        connectorUser.execute();
    }
}