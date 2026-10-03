n = int(input())
words = input().split(",")
pattern = input()
found = 0
for word in words:
    abbr = ""
    for ch in word:
        if ch.isupper():
            abbr += ch
    p = 0
    for ch in abbr:
        if p < len(pattern) and ch == pattern[p]:
            p += 1
    if p == len(pattern):
        print(word)
        found = 1
if found == 0:
    print("No match found")
