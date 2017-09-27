/**
 * CalculadoraService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package operaciones;

public interface CalculadoraService extends javax.xml.rpc.Service {
    public java.lang.String getCalculadoraAddress();

    public operaciones.Calculadora getCalculadora() throws javax.xml.rpc.ServiceException;

    public operaciones.Calculadora getCalculadora(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
