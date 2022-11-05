class Solution {
    
    static class Trie {
        static class Node {
            String word;
            Node[] children = new Node[26];
            int childrenCount = 0;
            
            Node get(char c) {
                return children[c - 'a'];
            }
            
            void put(char c, Node n) {
                children[c - 'a'] = n;
                childrenCount++;
            }
            
            void remove(char c) {
                children[c - 'a'] = null;
                childrenCount--;
            }
        }
        
        Node root = new Node();
        
        void add(String s) {
            // System.out.println("trie.add " + s);
            int len = s.length();
            Node curr = root;
            for (int i = 0; i < len; i++) {
                char c = s.charAt(i);
                Node child = curr.get(c);
                if (child == null) {
                    child = new Node();
                    curr.put(c, child);
                }
                curr = child;
            }
            curr.word = s;
        }
        
        boolean contains(CharSequence s) {
            int len = s.length();
            Node curr = root;
            for (int i = 0; i < len; i++) {
                char c = s.charAt(i);
                Node child = curr.get(c);
                if (child == null) return false;
                curr = child;
            }
            return true;
        }
    }
    
    char[][] board;
    boolean[][] visited;
    Trie trie = new Trie();
    Set<String> wordsOnBoard;
    
    public List<String> findWords(char[][] board, String[] words) {
        wordsOnBoard = new HashSet<String>(words.length);
        visited = new boolean[board.length][board[0].length];
        this.board = board;
        for (String word : words) {
            trie.add(word);
        }
        findWordsOnBoard();
        return List.copyOf(wordsOnBoard);
    }
    
    void findWordsOnBoard() {
        int height = board.length;
        int width = board[0].length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                findWordFrom(i, j, trie.root);
            }
        }
    }
    
    void findWordFrom(int i, int j, Trie.Node node) {
        if (i < 0 || i >= board.length ||
            j < 0 || j >= board[0].length ||
            visited[i][j]
        ) {
            return;
        }
        char c = board[i][j];
        var child = node.get(c);
        if (child == null) return;
        if (child.word != null) {
            wordsOnBoard.add(child.word);
            
        }
        visited[i][j] = true;
        findWordFrom(i + 1, j, child);
        findWordFrom(i - 1, j, child);
        findWordFrom(i, j - 1, child);
        findWordFrom(i, j + 1, child);
        visited[i][j] = false;
        if (child.childrenCount == 0) {
            node.remove(c);
        }
    }
}