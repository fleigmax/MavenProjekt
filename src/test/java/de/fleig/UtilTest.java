package de.fleig;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilTest
{
    @Test
    public void testIstErstesHalbjahrIn()
    {
        for (int i = 1; i < 7; ++i)
        {
                assertTrue("Month " + i + " should be inside.", Util.istErstesHalbjahr(i));
        }
    }

    @Test
    public void testIstErstesHalbjahrOut()
    {
        for (int i = 7; i < 13; ++i)
        {
                assertFalse("Month " + i + " should be outside", Util.istErstesHalbjahr(i));
        }
    }

    @Test
    public void testIstErstesHalbjahrException()
    {
        try
        {
                Util.istErstesHalbjahr(0);
                fail("Exception should be thrown");
        } catch (IllegalArgumentException e) {
        }

        try
        {
                Util.istErstesHalbjahr(13);
                fail("Exception should be thrown");
        } catch (IllegalArgumentException e) {
        }
    }
}






/*package de.fleig;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilTest
{

	@Test
	public void ErstesHalbjahrIn()
	{
		for(int i = 1; i < 7; ++i)
		{
			assertTrue("TEST: Der Monat "+ i +" ist im ersten Halbjahr!",Util.istErstesHalbjahr(i));
		}

	}


	@Test
	public void ErstesHalbjahrOut()
	{
		for(int i = 7; i <= 12; ++i)
		{
			assertFalse("TEST: Der Monat "+ i +" ist im zweiten Halbjahr!",Util.istErstesHalbjahr(i));
		}
	}


	@Test
	public void ErstesHalbjahrException()
	{
		try
		{
			Util.istErstesHalbjahr(0);
			fail("TEST: Exception erwartet - Monat kleiner als 1");
		}
		catch (IllegalArgumentException e){}

		try
		{
			Util.istErstesHalbjahr(13);
			fail("TEST: Exception erwartet - Monat ist größer als 12");
		}
		catch (IllegalArgumentException e){}
	}

}
*/
