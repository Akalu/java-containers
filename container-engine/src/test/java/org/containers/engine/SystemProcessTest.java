package org.containers.engine;

import java.nio.file.Paths;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SystemProcessTest {
	private static final Logger log = LoggerFactory.getLogger(SystemProcessTest.class);

	@Test
	public void functionalTest() {
		Command cmd = Command.Builder.init().addArg("dir").addArg(System.getenv("tmp")).build();
		log.debug("cmd1: {}", cmd.params());
		SystemProcess proc = new SystemProcess(Paths.get(System.getenv("tmp")), cmd);
		proc.exec();
		proc.printStat();
	}

}
