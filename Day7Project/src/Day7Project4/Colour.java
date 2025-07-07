package Day7Project4;

 class Colour {
          
	protected Colour getColour()
	{
		Colour c = new Colour();
		return c;
	}
	
	
	// CHILD CLASS 
	class Red extends Colour{
		
		@Override
		protected Red getColour()
		{
			Red c = new Red();
			return c;
		}
	}
	
	// CHILD CLASS 
	class Blue extends Colour{
		
		@Override
		protected Blue getColour()
		{
			Blue c = new Blue();
			return c;
		}
	
}
	
	
	
	
 }
