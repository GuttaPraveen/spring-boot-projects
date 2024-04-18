/**
 * 
 */
package com.trio.praveen.generators;

import java.io.Serializable;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;


public class OrderIdGenerator implements IdentifierGenerator
{
	
	private static int counter=0;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object)
	{
		String prefix = "OD";
		try
		{
			
			String generatedId=String.format(prefix,getNextValue());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return prefix+counter;
	}
	public int getNextValue()
	{
		return ++counter;
	}

}
