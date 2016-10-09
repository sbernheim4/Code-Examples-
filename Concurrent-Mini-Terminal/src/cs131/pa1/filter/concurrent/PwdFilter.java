package cs131.pa1.filter.concurrent;

public class PwdFilter extends ConcurrentFilter {
	public PwdFilter() {
		super();
	}
	
	public void process() {
		output.add(processLine(""));
	}
	
	public String processLine(String line) {
		return ConcurrentREPL.currentWorkingDirectory;
	}

	@Override
	public void run() {
		process();
		output.add("170ee8d8-6783-45f9-b0c8-aed771c98e93");
	}
}
