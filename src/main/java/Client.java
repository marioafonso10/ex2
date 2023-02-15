import java.util.ArrayList;

/**
 * this class represents a bank client.
 * */
public class Client {
    private String name;
    private int age;
    private int nChildren;
    private double debt;



    private ArrayList<Account> accounts = new ArrayList<>();


    public Client(String name, int age, int nChildren, double debt) {
        this.name = name;
        this.age = age;
        this.nChildren = nChildren;
        this.debt = debt;
    }
    /**
     * gets the name of the client
     *  */
    public String getName() {
        return name;
    }
/**
* Sets the name of the client
 *
 * @param  name the name of the client
* */
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getnChildren() {
        return nChildren;
    }

    public void setnChildren(int nChildren) {
        this.nChildren = nChildren;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public boolean addAccount(Account... account) {
        for (Account accounts : account) {

            if(! this.accounts.contains(accounts)){
                this.accounts.add(accounts);
            }
            else {
                throw new ArrayStoreException("This account is already associated");
            }
        }
        return true;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }


}
