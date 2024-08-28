package org.example.structural.facade;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class DwarvenMineWorker {

	public void goToSleep() {
		log.info("{} goes to sleep.", name());
	}

	public void wakeUp() {
		log.info("{} wakes up.", name());
	}

	public void goHome() {
		log.info("{} goes home.", name());
	}

	public void goToMine() {
		log.info("{} goes to the mine.", name());
	}

	private void action(Action action) {
		switch (action) {
			case GO_TO_SLEEP -> goToSleep();
			case WAKE_UP -> wakeUp();
			case GO_HOME -> goHome();
			case GO_TO_MINE -> goToMine();
			case WORK -> work();
			default -> log.info("Undefined action");
		}
	}

	/**
	 * Perform actions.
	 */
	public void action(Action... actions) {
		Arrays.stream(actions).forEach(this::action);
	}

	public abstract void work();

	public abstract String name();

	enum Action {
		GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
	}
}
