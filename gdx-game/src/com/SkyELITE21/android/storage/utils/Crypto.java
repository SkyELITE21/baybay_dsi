package com.SkyELITE21.android.storage.utils;

public class Crypto
{
	public Crypto()
	{}
	public String encrypt(String str)
	{
		Hash h = new Hash();
		return h.HASHED_STRING(str);
	}
	public String decrypt(String str)
	{
		Hash h = new Hash();
		return h.HASHED_STRING(str);
	}
	public class Hash
	{
		public String HASHED_STRING;

		public Hash()
		{}
		public String HASHED_STRING(String str)
		{
			return mergerAndEncoder(str);
		}
		private String subString(String str,int i, int i2)
		{
			return str.substring(i,i2);
		}
		private String subString(String str,int i)
		{
			return str.substring(i);
		}
		private String mergerAndEncoder(String str)
		{
			String result = "",a = "",b = "";
			int length = str.length(), i =0;
			while(i<length)
			{
				if(i == length-1)
				{
					a = subString(str,i);
					b = CAPS(a);
					b = SMALLCAPS(b);
					b = NUMERIC(b);
					result = append(result,b);
					i++;
				}
				else if(result.length() > 0)
				{
					a = subString(str,i,i+1);
					b = CAPS(a);
					b = SMALLCAPS(b);
					b = NUMERIC(b);
					result = append(result,b);
					i++;
				}
				else
				{
					a = subString(str,i,i+1);
					b = CAPS(a);
					b = SMALLCAPS(b);
					b = NUMERIC(b);
					result = b;
					i++;
				}
			}
			return result;
		}
		private String append(String str1, String str2)
		{
			return str1 + str2;
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
}
