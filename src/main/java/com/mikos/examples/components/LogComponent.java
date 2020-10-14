package com.mikos.examples.components;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LogComponent {
    private static final Logger LOG = LoggerFactory.getLogger(LogComponent.class);

  @PostConstruct
  public void init() {
	  LOG.info("============> START LOG COMPONENT");
	  LOG.trace("This is a TRACE message log.");
	  LOG.debug("This is a DEBUG message log.");
      LOG.info("This is a INFO message log.");
      LOG.warn("This is a WARN message log.");
      LOG.error("This is an ERROR message log.");
      LOG.info("============> STOP LOG COMPONENT");
  }
}
