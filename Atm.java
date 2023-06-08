class Atm 
{
	//states
	String atm_name="PNB";
	String lction="Chennai";
	private double bal=100000;
	//constructors
	Atm()
	{
		//L.I
	}
	//Getter mtdds
	public double getBal()
	{
		return bal;
	}

}
class AtmDriver
{
	public static void main(String []mark)
	{
		Atm r=new Atm();
      //System.out.println("balance "+r.bal);
	    System.out.println("THE ATm BALANCE IS "+r.getBal());
	}
}
