package Bank;

import java.util.Scanner;

public class MortgageLoan extends Loan {
        private String realEstateLocation;
        private String realEstateDeed;
    
        public MortgageLoan() {
        }
    
    public MortgageLoan(int loanNum, double amount, String type) {
        super(loanNum, amount, type);
    }
    public MortgageLoan(String realEstateLocation, String realEstateDeed, int loanNum, double amount, String type) {
        super(loanNum, amount, type);
        this.realEstateLocation = realEstateLocation;
        this.realEstateDeed = realEstateDeed;
    }

    public String getRealEstateLocation() {
        return realEstateLocation;
    }

    public void setRealEstateLocation(String realEstateLocation) {
        this.realEstateLocation = realEstateLocation;
    }

    public String getRealEstateDeed() {
        return realEstateDeed;
    }

    public void setRealEstateDeed(String realEstateDeed) {
        this.realEstateDeed = realEstateDeed;
    }

    @Override
    public String toString() {
        return "MortgageLoan{" + "realEstateLocation=" + realEstateLocation + ", realEstateDeed=" + realEstateDeed + '}';
    }
}

    

    

    

   

   
    





