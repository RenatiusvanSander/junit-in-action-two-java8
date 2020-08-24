package edu.remad.part2.UsingJettyasanembeddedserver;

import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.jetty.handler.ResourceHandler;

/**
 * Jetty Server example from JUnit in Action 2nd Edition page 89.
 */
public class JettySample {

    /**
     * Method to start a Jetty Server.
     *
     * @param args The arguments array for program parameters.
     * @throws Exception In case of errors when jetty is instantiated.
     */
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        Context root = new Context(server, "/");
        root.setResourceBase("./pom.xml");
        root.setHandler(new ResourceHandler());
        server.start();
    }
}
