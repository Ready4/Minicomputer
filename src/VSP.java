public class VSP {

	private int pc; // program counter
	private final int num = 8;
	int[] re = new int[num]; // an array with registers
	private boolean flag = false; // flag
	private boolean halt = false; // halt

	// resets all members
	public void reset() {
		this.pc = 0; // sets PC to 0
		re = new int[num]; // reallocates memory
		this.setFlag(false); // flag is set to false
		this.halt = false; // halt is set to false
	}

	public void execute(Instruction instruction) {

		int first = instruction.getFirst(); // gets the first field
		int second = instruction.getSecond(); // gets the second field
		int third = instruction.getThird(); // gets the third field

		String in = instruction.getOpcode(); // gets the instruction name

		if (in.equals("NOP")) { // if the instruction name is
			this.setpc(this.getpc() + 1); // otherwise increments the PC
			this.setFlag(false);// set flag to false
		} else if (in.equals("MOVE")) { // if the instruction name is
			this.re[first] = third;
			this.setpc(this.getpc() + 1); // otherwise increments the PC
			this.setFlag(false); // set flag to false
		} else if (in.equals("ADD")) { // if the instruction name is
			this.re[first] = re[second] + re[third];
			this.setpc(this.getpc() + 1); // otherwise increments the PC
			this.setFlag(false); // set flag to false
		} else if (in.equals("SUB")) { // if the instruction name is
			this.re[first] = re[second] - re[third];
			this.setpc(this.getpc() + 1); // otherwise increments the PC
			this.setFlag(false); // set flag to false
		} else if (in.equals("CMP")) { // if the instruction name is
			if (re[third] == re[second]) { // if the 2 registers are equal
				this.setFlag(true); // set flag to true
			} else {
				this.setFlag(false); // set flag to false
			}
			this.setpc(this.getpc() + 1); // otherwise increments the PC
		} else if (in.equals("JMP")) { // if the instruction name is
			this.pc = third; // sets the value is the flag is true
			this.setFlag(false); // set flag to false
		} else if (in.equals("JMPC")) { // if the instruction name is JMPC
			if (flag) {
				this.pc = third; // sets the value is the flag is true
			} else {
				this.setpc(this.getpc() + 1); // otherwise increments the PC
			}
			this.setFlag(false);
		} else if (in.equals("HALT")) { // if the instruction name is Halt
			// the program is finished
			this.setHalt(true); // set halt to true
			this.setFlag(false); // set flag to false
		}

	}

	public int getpc() { // gets the PC state
		return pc;
	}

	public void setpc(int pC) { // sets the PC
		pc = pC;
	}

	public int[] getre() { // gets the register array
		return re;
	}

	public void setre(int[] r) { // serts the registry array
		re = r;
	}

	public boolean isFlag() { // returns the flag state
		return flag;
	}

	public void setFlag(boolean flag) { // sets the flag
		this.flag = flag;
	}

	public boolean isHalt() { // return the halt state
		return halt;
	}

	public void setHalt(boolean halt) { // sets the halt state
		this.halt = halt;
	}

}