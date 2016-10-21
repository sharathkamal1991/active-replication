package edu.cmu.rds749.lab2;

import edu.cmu.rds749.common.BankAccountStub;

/**
 * Created by sharath on 17/9/16.
 */
public class Server {

    private long Id;
    private BankAccountStub serverObject;


    public Server( BankAccountStub serverObject)
    {
        this.serverObject = serverObject;


    }


    public long getId()
    {
        return Id;
    }

    public void setId(long id)
    {
        Id = id;
    }

    public void beginReadBalance(int reqid) throws BankAccountStub.NoConnectionException
    {
        serverObject.beginReadBalance(reqid);
    }


    public void beginChangeBalance(int reqid,int balance) throws BankAccountStub.NoConnectionException
    {
        serverObject.beginChangeBalance(reqid,balance);
    }

}