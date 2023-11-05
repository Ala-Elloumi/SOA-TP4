package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="CalculatriceWS")
public class CalculatriceWS {

    @WebMethod(operationName="Somme")
    public double somme(@WebParam(name = "a")double a ,@WebParam(name = "b")double b)
    {
        return a+b;
    }
}

