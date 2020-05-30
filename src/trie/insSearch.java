package trie;
import java.util.*;

public class insSearch {
	
//	1
//	8
//	the a there answer any by bye their
//	the
	static class trie{
		trie[] childs = new trie[26];
		String word = "";
		
		public void insert(String word2) {
			// TODO Auto-generated method stub
			trie tmp = root;
			for(char c : word2.toCharArray()) {
				if(tmp.childs[c-'a']==null) {
					tmp.childs[c-'a'] =  new trie();
				}
				tmp = tmp.childs[c-'a'];
			}
			tmp.word = word2;
		}

		public boolean find(String patt) {
			// TODO Auto-generated method stub
			trie tmp = root;
			for(char c : patt.toCharArray()) {
				if(tmp.childs[c-'a']==null) {
					return false;
				}
				tmp = tmp.childs[c-'a'];
			}
			return tmp.word.equals(patt);
		}
		
	}
	static trie root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		while(test-- >0) {
			root = new trie();
			int n = sc.nextInt();
			while(n-- > 0) {
			   String word = sc.next();
			   //System.out.println(" word to insert in trie"+ word);
			   root.insert(word);
			}
			String patt = sc.next();
			
			if(root.find(patt)) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}
	}

}
