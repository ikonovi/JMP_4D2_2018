package com.epm.jmp.d2.y2018.m01.t06;

public class ComplexClassA {

    private int field1;
    private boolean field2;
    private char field3;

    public ComplexClassA(int field1, boolean field2, char field3) {
        super();
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public int getField1() {
        return field1;
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public boolean isField2() {
        return field2;
    }

    public void setField2(boolean field2) {
        this.field2 = field2;
    }

    public char getField3() {
        return field3;
    }

    public void setField3(char field3) {
        this.field3 = field3;
    }

    @Override
    public String toString() {
        return "ComplexClassA [field1=" + field1 + ", field2=" + field2 + ", field3=" + field3
                + "]";
    }

}
