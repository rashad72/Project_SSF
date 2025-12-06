package com.example.simulation_ssf.nonUser;

public class summaryReport {
    private int sent;
    private int received;
    private int pending;
    private int failed;

    public summaryReport(int sent, int received, int pending, int failed) {
        this.sent = sent;
        this.received = received;
        this.pending = pending;
        this.failed = failed;
    }

    public int getSent() {
        return sent;
    }

    public void setSent(int sent) {
        this.sent = sent;
    }

    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getPending() {
        return pending;
    }

    public void setPending(int pending) {
        this.pending = pending;
    }

    public int getFailed() {
        return failed;
    }

    public void setFailed(int failed) {
        this.failed = failed;
    }

    @Override
    public String toString() {
        return "summaryReport{" +
                "sent=" + sent +
                ", received=" + received +
                ", pending=" + pending +
                ", failed=" + failed +
                '}';
    }
}
