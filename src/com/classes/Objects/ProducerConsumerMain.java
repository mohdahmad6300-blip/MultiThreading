package com.classes.Objects;

import com.classes.*;

public class ProducerConsumerMain 
{

	public static void main(String[] args) 
	{
		Data data = new Data();

		Producer p = new Producer(data);
		Consumer c = new Consumer(data);
		
		p.start();
	    c.start();
	}

}
