package com.SkyELITE21.sdf;

public class Hash
{
	public String HASHED_STRING;
	public Long HASHED_LONG;

	public Hash(String toBeHashed)
	{
		String a[] = substringAll(toBeHashed),b[] = {"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",
			"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",
			"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",
			"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""
			,"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};;
		int length = a.length,i = 0;
		String sc,c;
		while(i < length)
		{
			if(i == length - 1)
			{

				c = CAPS(a[i]);
				sc = SMALLCAPS(c);
				b[i] = NUMERIC(sc);
				this.HASHED_STRING = mergeArray(b);
			}
			else
			{
				c = CAPS(a[i]);
				sc = SMALLCAPS(c);
				b[i] = NUMERIC(sc);
				i++;
			}
		}
	}
	public Hash(Long toBeHashed)
	{
		String str = toBeHashed.toString();
		String n1 = null,n2 = null,n3 = null,n4 = null,n5 = null,n6 = null,n7 = null,n8 = null,n9 = null,n10 = null;
		if(str.length()==10)
		{
			String array[] = {str.substring(0,1),str.substring(1,2),str.substring(2,3),str.substring(3,4),str.substring(4,5),str.substring(5,6),str.substring(6,7),str.substring(7,8),str.substring(8,9),str.substring(9)};
			n1 = NUMERIC(array[0]);
			n2 = NUMERIC(array[1]);
			n3 = NUMERIC(array[2]);
			n4 = NUMERIC(array[3]);
			n5 = NUMERIC(array[4]);
			n6 = NUMERIC(array[5]);
			n7 = NUMERIC(array[6]);
			n8 = NUMERIC(array[7]);
			n9 = NUMERIC(array[8]);
			n10 = NUMERIC(array[9]);
			this.HASHED_STRING = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
			this.HASHED_LONG = Long.valueOf(this.HASHED_STRING);
		}
		else if(str.length()==9)
		{
			String array[] = {str.substring(0,1),str.substring(1,2),str.substring(2,3),str.substring(3,4),str.substring(4,5),str.substring(5,6),str.substring(6,7),str.substring(7,8),str.substring(8)};
			n1 = NUMERIC(array[0]);
			n2 = NUMERIC(array[1]);
			n3 = NUMERIC(array[2]);
			n4 = NUMERIC(array[3]);
			n5 = NUMERIC(array[4]);
			n6 = NUMERIC(array[5]);
			n7 = NUMERIC(array[6]);
			n8 = NUMERIC(array[7]);
			n9 = NUMERIC(array[8]);
			this.HASHED_STRING = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9;
			this.HASHED_LONG = Long.valueOf(this.HASHED_STRING);
		}
		else if(str.length()== 8)
		{
			String array[] = {str.substring(0,1),str.substring(1,2),str.substring(2,3),str.substring(3,4),str.substring(4,5),str.substring(5,6),str.substring(6,7),str.substring(7)};
			n1 = NUMERIC(array[0]);
			n2 = NUMERIC(array[1]);
			n3 = NUMERIC(array[2]);
			n4 = NUMERIC(array[3]);
			n5 = NUMERIC(array[4]);
			n6 = NUMERIC(array[5]);
			n7 = NUMERIC(array[6]);
			n8 = NUMERIC(array[7]);
			this.HASHED_STRING = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8;
			this.HASHED_LONG = Long.valueOf(this.HASHED_STRING);
		}
		else if(str.length()== 7)
		{
			String array[] = {str.substring(0,1),str.substring(1,2),str.substring(2,3),str.substring(3,4),str.substring(4,5),str.substring(5,6),str.substring(6)};
			n1 = NUMERIC(array[0]);
			n2 = NUMERIC(array[1]);
			n3 = NUMERIC(array[2]);
			n4 = NUMERIC(array[3]);
			n5 = NUMERIC(array[4]);
			n6 = NUMERIC(array[5]);
			n7 = NUMERIC(array[6]);
			this.HASHED_STRING = n1 + n2 + n3 + n4 + n5 + n6 + n7;
			this.HASHED_LONG = Long.valueOf(this.HASHED_STRING);
		}
		else if(str.length()== 6)
		{
			String array[] = {str.substring(0,1),str.substring(1,2),str.substring(2,3),str.substring(3,4),str.substring(4,5),str.substring(5)};
			n1 = NUMERIC(array[0]);
			n2 = NUMERIC(array[1]);
			n3 = NUMERIC(array[2]);
			n4 = NUMERIC(array[3]);
			n5 = NUMERIC(array[4]);
			n6 = NUMERIC(array[5]);
			this.HASHED_STRING = n1 + n2 + n3 + n4 + n5 + n6;
			this.HASHED_LONG = Long.valueOf(this.HASHED_STRING);
		}
		else if(str.length()== 5)
		{
			String array[] = {str.substring(0,1),str.substring(1,2),str.substring(2,3),str.substring(3,4),str.substring(4)};
			n1 = NUMERIC(array[0]);
			n2 = NUMERIC(array[1]);
			n3 = NUMERIC(array[2]);
			n4 = NUMERIC(array[3]);
			n5 = NUMERIC(array[4]);
			this.HASHED_STRING = n1 + n2 + n3 + n4 + n5;
			this.HASHED_LONG = Long.valueOf(this.HASHED_STRING);
		}
		else if(str.length()== 4)
		{
			String array[] = {str.substring(0,1),str.substring(1,2),str.substring(2,3),str.substring(3)};
			n1 = NUMERIC(array[0]);
			n2 = NUMERIC(array[1]);
			n3 = NUMERIC(array[2]);
			n4 = NUMERIC(array[3]);
			this.HASHED_STRING = n1 + n2 + n3 + n4;
			this.HASHED_LONG = Long.valueOf(this.HASHED_STRING);
		}
		else if(str.length()== 3)
		{
			String array[] = {str.substring(0,1),str.substring(1,2),str.substring(2,3)};
			n1 = NUMERIC(array[0]);
			n2 = NUMERIC(array[1]);
			n3 = NUMERIC(array[2]);
			this.HASHED_STRING = n1 + n2 + n3;
			this.HASHED_LONG = Long.valueOf(this.HASHED_STRING);
		}
		else if(str.length()== 2)
		{
			String array[] = {str.substring(0,1),str.substring(1)};
			n1 = NUMERIC(array[0]);
			n2 = NUMERIC(array[1]);
			this.HASHED_STRING = n1 + n2;
			this.HASHED_LONG = Long.valueOf(this.HASHED_STRING);
		}
		else
		{
			String array[] = {str.substring(0)};
			n1 = NUMERIC(array[0]);
			this.HASHED_STRING = n1;
			this.HASHED_LONG = Long.valueOf(this.HASHED_STRING);
		}
	}
	private String mergeArray(String s[])
	{
		int length =  s.length, i = 0;
		String merge = null;
		while(i < length)
		{
			if(i == length - 1)
			{
				merge = merge + s[i];
				break;
			}
			else
			{
				merge = merge + s[i];
				i++;
				continue;
			}
		}
		return merge;
	}
	private String[] substringAll(String s)
	{
		String array[] = {"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",
			"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",
			"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",
			"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""
			,"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
		int length,i =0;
		length = s.length();
		while(i < length)
		{
			if(i == length-1)
			{
				array[i] = s.substring(i);
				return array;
			}
			else
			{
				array[i]= s.substring(i,i+1);
				i++;
			}
		}
		return array;
	}
	private boolean isCaps(String s)
	{
		boolean bool = false;
		String CAPS[] = {"A","B","C","D","E","F","G","H",
			"I","J","K","L","M","N","O","P","Q","R","S","T",
			"U","V","W","X","Y","Z"};
		int i = 0;
		while(i < 26)
		{
			if(s.contains(CAPS[i]) && i < 26)
			{
				return bool = true;
			}
			else if(s.contains(CAPS[i]) != true && i < 26 && i != 25)
			{
				i++;
			}
			else return bool = false;
		}
		return bool;
	}
	private boolean isSmallCaps(String s)
	{
		boolean bool = false;
		String SMALLCAPS[] = {"a","b","c","d","e","f","g","h",
			"i","j","k","l","m","n","o","p","q","r","s","t",
			"u","v","w","x","y","z"};
		int i = 0;
		while(i < 26)
		{
			if(s.contains(SMALLCAPS[i]) && i < 26)
			{
				return bool = true;
			}
			else if(s.contains(SMALLCAPS[i]) != true && i < 26 && i != 25)
			{
				i++;
			}
			else return bool = false;
		}
		return bool;
	}
	private boolean isNumeric(String s)
	{
		boolean bool = false;
		String NUMERIC[] = {"0","1","2","3","4","5","6","7","8","9"};
		int i = 0;
		while(i < 26)
		{
			if(s.contains(NUMERIC[i]) && i < 26)
			{
				return bool = true;
			}
			else if(s.contains(NUMERIC[i]) != true && i < 26 && i != 25)
			{
				i++;
			}
			else return bool = false;
		}
		return bool;
	}
	private String CAPS(String string)
	{
		String str2 = string;
		if(string.contains("A"))
		{
			str2 = string.replace("A","F");
		}
		if(string.contains("B"))
		{
			str2 = string.replace("B","E");
		}
		if(string.contains("C"))
		{
			str2 = string.replace("C","D");
		}
		if(string.contains("D"))
		{
			str2 = string.replace("D","C");
		}
		if(string.contains("E"))
		{
			str2 = string.replace("E","B");
		}
		if(string.contains("F"))
		{
			str2 = string.replace("F","A");
		}
		if(string.contains("G"))
		{
			str2 = string.replace("G","Z");
		}
		if(string.contains("H"))
		{
			str2 = string.replace("H","Y");
		}
		if(string.contains("I"))
		{
			str2 = string.replace("I","X");
		}
		if(string.contains("J"))
		{
			str2 = string.replace("J","W");
		}
		if(string.contains("K"))
		{
			str2 = string.replace("K","V");
		}
		if(string.contains("L"))
		{
			str2 = string.replace("L","U");
		}
		if(string.contains("M"))
		{
			str2 = string.replace("M","T");
		}
		if(string.contains("N"))
		{
			str2 = string.replace("N","S");
		}
		if(string.contains("O"))
		{
			str2 = string.replace("O","R");
		}
		if(string.contains("P"))
		{
			str2 = string.replace("P","Q");
		}
		if(string.contains("Q"))
		{
			str2 = string.replace("Q","P");
		}
		if(string.contains("R"))
		{
			str2 = string.replace("R","O");
		}
		if(string.contains("S"))
		{
			str2 = string.replace("S","N");
		}
		if(string.contains("T"))
		{
			str2 = string.replace("T","M");
		}
		if(string.contains("U"))
		{
			str2 = string.replace("U","L");
		}
		if(string.contains("V"))
		{
			str2 = string.replace("V","K");
		}
		if(string.contains("W"))
		{
			str2 = string.replace("W","J");
		}
		if(string.contains("X"))
		{
			str2 = string.replace("X","I");
		}
		if(string.contains("Y"))
		{
			str2 = string.replace("Y","H");
		}
		if(string.contains("Z"))
		{
			str2 = string.replace("Z","G");
		}
		return str2;
	}
	private String SMALLCAPS(String string)
	{
		String str2 = string;
		if(string.contains("a"))
		{
			str2 = string.replace("a","n");
		}
		if(string.contains("b"))
		{
			str2 = string.replace("b","o");
		}
		if(string.contains("c"))
		{
			str2 = string.replace("c","p");
		}
		if(string.contains("d"))
		{
			str2 = string.replace("d","q");
		}
		if(string.contains("e"))
		{
			str2 = string.replace("e","r");
		}
		if(string.contains("f"))
		{
			str2 = string.replace("f","s");
		}
		if(string.contains("g"))
		{
			str2 = string.replace("g","t");
		}
		if(string.contains("h"))
		{
			str2 = string.replace("h","u");
		}
		if(string.contains("i"))
		{
			str2 = string.replace("i","v");
		}
		if(string.contains("j"))
		{
			str2 = string.replace("j","w");
		}
		if(string.contains("k"))
		{
			str2 = string.replace("k","x");
		}
		if(string.contains("l"))
		{
			str2 = string.replace("l","y");
		}
		if(string.contains("m"))
		{
			str2 = string.replace("m","z");
		}
		if(string.contains("n"))
		{
			str2 = string.replace("n","a");
		}
		if(string.contains("o"))
		{
			str2 = string.replace("o","b");
		}
		if(string.contains("p"))
		{
			str2 = string.replace("p","c");
		}
		if(string.contains("q"))
		{
			str2 = string.replace("q","d");
		}
		if(string.contains("r"))
		{
			str2 = string.replace("r","e");
		}
		if(string.contains("s"))
		{
			str2 = string.replace("s","f");
		}
		if(string.contains("t"))
		{
			str2 = string.replace("t","g");
		}
		if(string.contains("u"))
		{
			str2 = string.replace("u","h");
		}
		if(string.contains("v"))
		{
			str2 = string.replace("v","i");
		}
		if(string.contains("w"))
		{
			str2 = string.replace("w","j");
		}
		if(string.contains("x"))
		{
			str2 = string.replace("x","k");
		}
		if(string.contains("y"))
		{
			str2 = string.replace("y","l");
		}
		if(string.contains("z"))
		{
			str2 = string.replace("z","m");
		}
		return str2;
	}
	private String NUMERIC(String string)
	{
		String str2 = string;
		if(string.contains("0"))
		{
			str2 = string.replace("0","7");
		}
		if(string.contains("1"))
		{
			str2 = string.replace("1","6");
		}
		if(string.contains("2"))
		{
			str2 = string.replace("2","9");
		}
		if(string.contains("3"))
		{
			str2 = string.replace("3","8");
		}
		if(string.contains("4"))
		{
			str2 = string.replace("4","5");
		}
		if(string.contains("5"))
		{
			str2 = string.replace("5","4");
		}
		if(string.contains("6"))
		{
			str2 = string.replace("6","1");
		}
		if(string.contains("7"))
		{
			str2 = string.replace("7","0");
		}
		if(string.contains("8"))
		{
			str2 = string.replace("8","3");
		}
		if(string.contains("9"))
		{
			str2 = string.replace("9","2");
		}
		return str2;
	}

}
