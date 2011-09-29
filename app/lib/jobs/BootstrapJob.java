package lib.jobs;

import play.i18n.Lang;
import play.jobs.Job;
import play.test.Fixtures;

//@OnApplicationStart
public class BootstrapJob extends Job {

	@Override
	public void doJob() {
		Fixtures.deleteAllModels();
		Fixtures.loadModels("data-" + Lang.get() + ".yml");
	}
	
}