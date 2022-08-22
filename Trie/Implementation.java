// trie is used to store bunch of Strings like we do in dictionary.
// T.C. os search of string in trie is O(l) where l is length of String;
// remove String and insert string in trie takes O(l).

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class TrieNode{
    char data;
    TrieNode child[]=new TrieNode [26];
    boolean isTerminal;
    TrieNode(char data){
        this.data=data;
    }
}
class Trie{
    public TrieNode root;
    Trie(){
        root=new TrieNode('\0');
    }
    void insert(String s){
        insertUtil(root, s);
    }
    void insertUtil(TrieNode node,String word){
        if(word.length()==0){
            node.isTerminal=true;
            return;
        }
        TrieNode child;
        if(node.child[word.charAt(0)-'A'] !=null){
            child=node.child[word.charAt(0)-'A'];
        }else{
            child=new TrieNode(word.charAt(0));
            node.child[word.charAt(0)-'A']=child;
        }
        insertUtil(child,word.substring(1,word.length()));
    }
    boolean search(String word){
        return searchUtil(root,word);
    }
    boolean searchUtil(TrieNode node,String word){
        if(word.length()==0){
            return node.isTerminal;
        }
        if(node.child[word.charAt(0)-'A']!=null){
            return searchUtil(node.child[word.charAt(0)-'A'],word.substring(1,word.length()));
        }
        return false;
    }
    void remove(String s){
        removeUtil(root,s,0);
    }
    
    TrieNode removeUtil(TrieNode node,String word,int depth){
        if(node==null) return null;
        if(depth==word.length()-1){
            if(node.isTerminal) node.isTerminal=false;
            if(isEmpty(node)) return null;
            return node;
        }
        
        node.child[word.charAt(depth)-'A']=removeUtil(node.child[word.charAt(depth)-'A'],word,depth+1);
        
        if(isEmpty(node) && !node.isTerminal) return null;
        return root;
        
    }
    
    boolean isEmpty(TrieNode node){
        for(int i=0;i<26;i++){
            if(node.child[i]!=null) return false;
        }
        return true;
    }
    
}
class HelloWorld {
    public static void main(String[] args) {
        Trie t=new Trie();
        t.insert("ALARM");
        t.insert("ALAMR");
        t.insert("MARS");
        System.out.println(t.search("MARS"));
        t.remove("MARS");
        System.out.println(t.search("MARS"));
    }
}
