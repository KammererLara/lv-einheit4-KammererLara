package org.lecture;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class LoggingDriver {
    public static void main(String[] args) {
        log.atInfo().log();
    }
}
