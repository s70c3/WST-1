package com.ifmo.wst.standalone;


import javax.xml.ws.Endpoint;

public class App {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8080/StationService";
        Endpoint.publish(url, new StationWebService());
    }
}