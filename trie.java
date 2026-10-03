import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class trie {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }

    private static final TrieNode root = new TrieNode();

    public static void insert(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();
            }
            curr = curr.children[idx];
        }
        curr.isEnd = true;
    }

    public static boolean search(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (idx < 0 || idx >= 26 || curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.isEnd;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        String line1 = br.readLine();
        if (line1 == null) return;
        int n = Integer.parseInt(line1.trim());

        
        String line2 = br.readLine();
        if (line2 == null) return;
        
        
        String[] keys = line2.trim().split(",");
        for (String key : keys) {
            if (!key.trim().isEmpty()) {
                insert(key.trim());
            }
        }

        
        String target = br.readLine();
        if (target != null) {
            target = target.trim();
            System.out.println(search(target) ? 1 : 0);
        }
    }
}
