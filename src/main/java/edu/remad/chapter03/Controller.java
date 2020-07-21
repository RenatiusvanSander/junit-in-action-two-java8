package edu.remad.chapter03;

/**
 * A controller interface.
 *
 * @author rmeier
 */
public interface Controller
{
    Response processRequest(Request request );

    void addHandler( Request request, RequestHandler requestHandler );
}
