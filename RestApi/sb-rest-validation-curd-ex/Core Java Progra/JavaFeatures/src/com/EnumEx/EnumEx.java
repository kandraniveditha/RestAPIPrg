package com.EnumEx;

import static java.lang.System.*;
public class EnumEx {
 enum Directions
 {
	 NORTH(5),SOUTH(10),EAST(20),WEST(25);
	 public int value;
	 Directions(int i){
		 value=i;
	 }
	 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(Directions d:Directions.values()) {
	out.println(d+""+d.value);
}
//out.println(Directions.valueOf("NORTH").ordinal());
//out.println(Directions.valueOf("SOUTH").ordinal());
//out.println(Directions.valueOf("WEST").ordinal());
	}

}
