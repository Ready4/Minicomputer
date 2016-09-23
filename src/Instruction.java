public class Instruction {

	private String opcode; // string containing the name of the insturction
	private int first; // first field
	private int second; // second field
	private int third; // third field

	// constructor for the Instruction
	public Instruction(String newopcode, int first, int second, int third) {
		if (!newopcode.equals("MOVE") && !newopcode.equals("ADD") && !newopcode.equals("SUB")
				&& !newopcode.equals("CMP") && !newopcode.equals("JMP") && !newopcode.equals("JMPC")
				&& !newopcode.equals("HALT")) {
			// checks if the inserted string is not a command
			this.opcode = "NOP";
		} else {
			this.opcode = newopcode;
		}
		this.first = first; // set first field
		this.second = second; // set second field
		this.third = third; // set third field
	}

	// changes the members of the class, resseting them
	public void change(String newopcode, int first, int second, int third) {
		this.opcode = newopcode;
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public String getOpcode() { // returns Instruciton name
		return opcode;
	}

	public void setOpcode(String opcode) { // sets Instruciton name
		this.opcode = opcode;
	}

	public int getFirst() { // returns first field
		return first;
	}

	public void setFirst(int first) { // sets first field
		this.first = first;
	}

	public int getSecond() { // returns second field
		return second;
	}

	public void setSecond(int second) { // sets second field
		this.second = second;
	}

	public int getThird() { // returns third field
		return third;
	}

	public void setThird(int third) { // sets third field
		this.third = third;
	}

}
