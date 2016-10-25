package helloWorld;

import log.Log;

/**
 * @author Xavi Torrens
 */

public class HelloWorld {

    private String name;
    private String cognom;

    private Log log;

    public void setLog(Log log){
        this.log = log;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        log.logInfo("Spring 3 : Hello ! " + name + " " + cognom);
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
}