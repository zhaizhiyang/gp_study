package com.gp.study.interpreter.calculator;

public class RightBracketInterpreter extends Interpreter {

    public RightBracketInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    public int interpret() {
        return this.left.interpret() + this.right.interpret();
    }
}