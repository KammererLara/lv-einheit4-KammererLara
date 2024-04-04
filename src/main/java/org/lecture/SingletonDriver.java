package org.lecture;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SingletonDriver {

    public static void main(String[] args) {
        ConfigurastionManager configurastionManager1 = ConfigurastionManager.getInstance();
        ConfigurastionManager configurastionManager2 = ConfigurastionManager.getInstance();

        System.out.println("configurastionManager1 username: " + configurastionManager1.getConfiguration("username"));
        System.out.println("configurastionManager2 username: " + configurastionManager2.getConfiguration("username"));
        System.out.println("configurastionManager1 password: " + configurastionManager1.getConfiguration("password"));
        System.out.println("configurastionManager2 password: " + configurastionManager2.getConfiguration("password"));

        configurastionManager1.setConfiguration("server", "example.com");

        System.out.println("configurastionManager1 server: " + configurastionManager1.getConfiguration("server"));
        System.out.println("configurastionManager2 server: " + configurastionManager2.getConfiguration("server"));
    }
}
