class FlightUnavalible extends RuntimeException
{
	FlightUnavalible(String flightinfo)
	{
		super(flightinfo);
	}
}
