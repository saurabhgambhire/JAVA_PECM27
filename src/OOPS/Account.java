package OOPS;

class Account 
{
	private String bank;
	private String name;
	private long accno;
	private String ifsc;
	private String email;
	private String branch;
	private int pin;
	double balance;

	public String getBank()
	{
		return bank;
	}
	public String getname()
	{
		return name;
	}
	public long getAccno()
	{
		return accno;
	}
	public String getIfsc()
	{
		return ifsc;
	}
	public String getMail()
	{
		return email;
	}

	public void setEmail(String oldmail, String newmail)
	{
		if (oldmail == email)
		{
			email = newmail;
			System.out.println("Email updated ");

		}
		else
		{
			System.out.println("Incorrect details");
		}
	}

	public String getBranch()
	{
		return branch;
	}

	public void setPin(int oldPin, int newPin)
	{
		if (oldPin == newPin)
		{
			pin = newPin;
			System.out.println("Pin Updated....  :) ");
		}
		else
		{
			System.out.println("Incorrect pin ");
		}
	}

	public double getBalance(long accno, int pin)
	{
		if (accno == this.accno && this.pin == pin)
		{
			return balance;
		}
		else
		{
			System.out.println("Incorrect Details :(");
			return 0;
		}
	}

	public void deposit(long accno, int pin, int amount)
	{
		if (this.accno == accno && this.pin == pin)
		{
			balance = balance + amount;
			System.out.println("updated balance "+balance);
		}
		else
		{
			System.out.println("incorrect details");
		}
	}

	public void withdraw(long accno, int pin, double amount)
	{
		if (this.accno == accno && this.pin == pin)
		{
			if (amount>=1)
			{
				if (this.balance - amount > 2000)
				{
					balance = balance - amount;
					System.out.println(this.balance);
				}
				else
				{
					System.out.println("Insufficient balance... Need Account ");
				}

			}
			else
			{
				System.out.println("Enter amount greater than 1");
			}
		}
		else
		{
			System.out.println("Inccorrect details");
		}
	}

	Account()
	{}

	Account(String name , long accno, String ifsc, String email, String branch,	int pin, double balance ,
			String bank)
	{
		this.name = name;
		this.accno = accno;
		this.ifsc = ifsc;
		this.email = email;
		this.branch = branch;
		this.pin = pin;
		this.balance = balance;
		this.bank = bank;

		System.out.println("Mr/ms "+name+" Account created Successfully ... :)");
		System.out.println("==================================================");

	}
}

