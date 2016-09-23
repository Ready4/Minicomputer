public class MiniComputer {
	final int number = 256;
	public Instruction[] mem = new Instruction[number];
	// an array of type Instruction
	private final VSP vsp = new VSP(); // an object of type VSP

	public MiniComputer() {
		// TODO Auto-generated constructor stub
	}

	// calls the reset from the vsp object
	public void reset() {

		// for(int i = 0; i < 8; i++){
		// this.mem[i].change("", 0, 0, 0);
		// }
		this.vsp.reset(); // the reset from the vsp is called

	}

	// calls the execute from the vsp
	public void execute() {
		// loops util the halt flag is set to true
		while (!this.vsp.isHalt())
			this.vsp.execute(mem[this.vsp.getpc()]);

	}

	// return the register at the index n, from the vsp object
	public int read(int n) {
		return this.vsp.re[n];
	}

}