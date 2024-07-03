package com.demo.api.Utils.response;

public class sequenceResponse {

    private int imput;
    private String sequence;

    public sequenceResponse(int imput, String sequence) {
        this.imput = imput;
        this.sequence = sequence;
    }

    public int getImput() {
        return imput;
    }

    public void setImput(int imput) {
        this.imput = imput;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
}
