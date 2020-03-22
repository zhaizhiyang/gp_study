package com.gp.study.interpreter.calculator;

public class LeftBracketInterpreter extends Interpreter {

    public LeftBracketInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    public int interpret() {
        return this.left.interpret() + this.right.interpret();
    }
}