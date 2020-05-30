package trie;

import java.util.Scanner;


public class camelCase {

	static class trie{
		trie[] childs = new trie[26];
		//String word = "";
		
		public void insert(String word2) {
			// TODO Auto-generated method stub
			trie tmp = root;
			for(char c : word2.toCharArray()) {
				if(Character.isUpperCase(c)) {
					if(tmp.childs[c-'A']==null) {
						tmp.childs[c-'A'] =  new trie();
					}
					tmp = tmp.childs[c-'A'];
				}
			}
			//tmp.word = word2;
		}

		public boolean find(String patt) {
			// TODO Auto-generated method stub
			trie tmp = root;
			for(char c : patt.toCharArray()) {
				if(tmp.childs[c-'A']==null) {
					return false;
				}
				tmp = tmp.childs[c-'A'];
			}
			return true;
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
