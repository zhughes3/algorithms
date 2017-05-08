from collections import Counter, defaultdict
from heapq import heappush, heappop, heapify

def encode(symb2freq):
    """Huffman encode the given dict mapping symbols to weights"""
    heap = [[wt, [sym, ""]] for sym, wt in symb2freq.items()]
    heapify(heap)
    while len(heap) > 1:
        lo = heappop(heap)
        hi = heappop(heap)
        for pair in lo[1:]:
            pair[1] = '0' + pair[1]
        for pair in hi[1:]:
            pair[1] = '1' + pair[1]
        heappush(heap, [lo[0] + hi[0]] + lo[1:] + hi[1:])
    return sorted(heappop(heap)[1:], key=lambda p: (len(p[-1]), p))

filename = "corpus.txt"
total = 0
c = Counter()
with open(filename) as f:
	for line in f:
		for ch in line:
			ch = ch.lower()
			if ch.isalpha():
				c += Counter(ch)
				total += 1

map = {}
sum = 0;

huff = encode(c)
print "Symbol\tWeight\tHuffman Code"
for p in huff:
	map[p[0]] = p[1]
    #print "%s\t%s\t%s" % (p[0], c[p[0]], p[1])

line = """itwillprobablynotsurpriseyoutolearnthatwhenjoeljameswinsanatlantic
coastconferencechampionshiphedoesnottakesmallsouvenirs"""
finalString = ""
for char in line:
	finalString = finalString + str(map[char])

print finalString
