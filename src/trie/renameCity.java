package trie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class renameCity {

	static class trie{
		trie[] childs = new trie[26];
		String word = "";
		int count = 0;
		
		public void insert(String word2, List<String> city) {
			// TODO Auto-generated method stub
			trie tmp = root;
			String found = "";
			boolean pre = false;
			for(char c : word2.toCharArray()) {
				found+=c;
				
				if( tmp.childs[c-'a'] == null) {
					if(!pre) {
						city.add(found);
						pre= true;
					}
					
					tmp.childs[c-'a'] =  new trie();
				}
				
				tmp = tmp.childs[c-'a'];
			}
			if(tmp.word.equals(word2)) {
				tmp.count++;
				city.add(word2 + " "+ tmp.count);
			}else {
				tmp.word =  word2;
				if(!pre) {
					city.add(word2);
					pre= true;
				}
				tmp.count++;
			}
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
			List<String> city = new ArrayList<String> ();
			while(n-- > 0) {
			   String word = sc.next();
			  // System.out.println(" word to insert in trie"+ word);
			   
			   
			   root.insert(word, city);
			}
			
			for(String c : city) {
				System.out.println(c);
			}
			
		}
		sc.close();
	
	}

}
