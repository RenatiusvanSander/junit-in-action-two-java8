package edu.remad.chapter03;

/**
 * The request-handler interface.
 *
 * @author Remy Meier
 */
public interface RequestHandler
{
    Response process( Request request ) throws Exception;
}