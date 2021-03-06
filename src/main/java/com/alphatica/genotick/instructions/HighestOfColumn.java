package com.alphatica.genotick.instructions;

import com.alphatica.genotick.processor.Processor;

import java.io.Serializable;

public class HighestOfColumn extends RegRegInstruction implements Serializable {

    @SuppressWarnings("unused")
    private static final long serialVersionUID = -7922049215420858405L;

    @SuppressWarnings("unused")
    public HighestOfColumn() {

    }

    public HighestOfColumn(HighestOfColumn highestOfColumn) {
        this.setRegister1(highestOfColumn.getRegister1());
        this.setRegister2(highestOfColumn.getRegister2());
    }

    @Override
    public void executeOn(Processor processor) {
        processor.execute(this);
    }

    @Override
    public Instruction copy() {
        return new HighestOfColumn(this);
    }
}
