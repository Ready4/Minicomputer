# Create a MiniComputer with a small program memory and a very simple processor (VSP) which has 8 registers, a program counter and a halt status register. The instruction's opcode can be:
-NOP(no operation)
-ADD(add the values of 2 registers and store the result into a 3rd one), 
-SUB(substract the values of 2 registers and store the result into a 3rd one)
-MOVE(insert a value in one register)
-JMP(program count<- the value specified from one register)
-JMPC(program count <- the value specified if flag is true otherwise program counter is incemented)
-CMP(flag<-true if the 2 values from the 2 registers were equal, otherwise flag<-false)
-HALT(program counter stops, halt becomes true).

