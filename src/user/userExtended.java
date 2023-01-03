package user;

public class userExtended extends foreignCurrency{
    private Integer isDebt;
    private Integer salary;
    private Integer budget;
    private Integer isDebtAmount;

    private morgateType morgeType;

    public void userExtended(){
        System.out.println("cari islemler");
    }

    public void setIsDebt(Integer debt)
    {

        this.isDebt = debt;
    }

    public void setMorgeType(String morgeType)
    {

        this.morgeType = morgateType.valueOf(morgeType);
    }

    public void setSalary(Integer salary)
    {

        this.salary = salary;
    }

    public void setBudget(Integer budget)
    {

        this.budget = budget;
    }
    public void setIsDebtAmount(Integer budget)
    {

        this.isDebtAmount = isDebtAmount;
    }


    public Integer getIsDebt()
    {

        return this.isDebt;
    }

    public Integer getSalary()
    {

        return this.salary;
    }

    public Integer getBudget()
    {

        return this.budget;
    }

    public void getIsDebtAmount(Integer budget)
    {

        this.isDebtAmount = isDebtAmount;
    }


}
