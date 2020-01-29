package com.Biswajit.functions;

public abstract class Calculation {
	
	public static int add( int first, int last)
	{ return first+last;
	
	}
	
	protected final int sub( int first, int last)
	{ return first-last;
	
	}
	synchronized int mul( int first, int last)
	{ return first*last;
	
	}
	private native int div( int first, int last);
//	{ return first/last;
//	
//	}
	
	 abstract int remaining( int first, int last);
//	{ return first+last;
//	
//	}
	
	
	

}
