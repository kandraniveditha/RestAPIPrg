
public class Array10 {
	static int getScore(String str[],String s,int n) {
		int score=0,index=0;
		for(int i=0;i<n;i++) {
			if(str[i]==s) {
				for(int j=0;j<s.length();j++) {
					score +=s.charAt(j);
					index=i+1;
					break;
				}
			}
		}
		score=score*index;
		return score ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str[]= {"Niveditha","Kalpana","Ujjwal"};
String s="Kalpana";
int n=str.length;
int score=getScore(str,s,n);
System.out.println(score);
	}

}
