package com.example.gof.behavioral_patterns.visitor.computer_part;

import com.example.gof.behavioral_patterns.visitor.ComputerPartVisitor;

public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
