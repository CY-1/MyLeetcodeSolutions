class Node:
    def __init__(self, val=None, next=[], isEnd=False):
        self.val = val
        self.next = {i.val: i for i in next }
        self.isEnd = isEnd
class Trie:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.a=Node()


    def insert(self, word: str) -> None:
        """
        Inserts a word into the trie.
        """
        current = self.a
        for i in word:
            
            if i not in current.next:
                current.next[i]=Node(i)
            current=current.next[i]
            
        current.isEnd=True


    def search(self, word: str) -> bool:
        """
        Returns if the word is in the trie.
        """
        tmp = self.a
        for i in word[:-1]:
            if i not in tmp.next:
                return False
            tmp = tmp.next[i]
        if word[-1] not in tmp.next:
            return False
        if tmp.next[word[-1]].isEnd:
            return True
        return False
        

    def startsWith(self, prefix: str) -> bool:
        """
        Returns if there is any word in the trie that starts with the given prefix.
        """
        tmp = self.a
        for i in prefix:
            if i not in tmp.next:
                return False
            tmp = tmp.next[i]
        return True
