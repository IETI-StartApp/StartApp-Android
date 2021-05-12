package com.ieti.startapp_android.model;

import java.util.Date;

public class Finance {
    private static final long serialVersionUID = 2L;
    
    private long value;
    private int investorNumber;
    private long valuation;
    private long minimumInvestment;
    private Date startDate;
    private Date endDate;

    public Finance(long value, int investorNumber, long valuation, long minimumInvestment, Date startDate, Date endDate) {
        this.value = value;
        this.investorNumber = investorNumber;
        this.valuation = valuation;
        this.minimumInvestment = minimumInvestment;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public int getInvestorNumber() {
        return investorNumber;
    }

    public void setInvestorNumber(int investorNumber) {
        this.investorNumber = investorNumber;
    }

    public long getValuation() {
        return valuation;
    }

    public void setValuation(long goal) {
        this.valuation = goal;
    }

    public long getMinimumInvestment() {
        return minimumInvestment;
    }

    public void setMinimumInvestment(long minimumInvestment) {
        this.minimumInvestment = minimumInvestment;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
