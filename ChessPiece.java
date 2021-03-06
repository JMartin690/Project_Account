
public abstract class ChessPiece {
	
	private Color color;
	private int row1;
	private int col1;
	private int row2;
	private int col2;
	public ChessPiece(Color c){
		color = c;
	}
	
	void Move(String mv)
	{
		String temp=mv.toUpperCase();
        switch(temp.charAt(0))
        {
            case 'A':
                row1=0;
                break;
            case 'B':
                row1=1;
                break;
            case 'C':
                row1=2;
                break;
            case 'D':
                row1=3;
                break;
            case 'E':
                row1=4;
                break;
            case 'F':
                row1=5;
                break;
            case 'G':
                row1=6;
                break;
            case 'H':
                row1=7;
                break;
            default:
                throw new IllegalArgumentException("Invalid Move! Please try again!");
                
        }
        col1=Character.getNumericValue(temp.charAt(1))-1;
        switch(temp.charAt(2))
        {
            case 'A':
                row2=0;
                break;
            case 'B':
                row2=1;
                break;
            case 'C':
                row2=2;
                break;
            case 'D':
                row2=3;
                break;
            case 'E':
                row2=4;
                break;
            case 'F':
                row2=5;
                break;
            case 'G':
                row2=6;
                break;
            case 'H':
                row2=7;
                break;
            default:
                    throw new IllegalArgumentException("Invalid Move! Please try again!");
                
        }
        col2=Character.getNumericValue(temp.charAt(3))-1;
    }
        public int getRow1()
    {
        return row1;
    }
    public int getCol1()
    {
        return col1;
    }
    public int getRow2()
    {
        return row2;
    }
    public int getCol2()
    {
        return col2;
    }
    
	
	abstract boolean parseMove(String mv) throws Exception;
	
	public Color getColor()
	{
		return color;
	}
	
}
