package com.vscode.experiments;

 interface InterfaceOne {
    default void print(){
        System.out.println("In InterfaceOne::print");
    }
}
 interface InterfaceTwo {
    default void print(){
        System.out.println("In InterfaceTwo::print");
    }
}
public class Diamond implements InterfaceOne,InterfaceTwo{
    @Override
    public void print() {
        System.out.println("Override of Diamond::print");
        InterfaceOne.super.print();
        InterfaceTwo.super.print();
    }
    public static void main(String[] args) {
        Diamond diamond = new Diamond();
        diamond.print();
    }
}
