import operator

class BestSeller:
	def findBestSeller(self, items):
		dict_list = {}
		for item in items:
			if item not in dict_list:
				count = 0
				for element in items:
					if element == item:
						count = count + 1 
				dict_list[item] = count
		max = 0
		for key in sorted(dict_list.iterkeys()):
		    if dict_list[key] > max:
				max = dict_list[key]
				top_item = key
		return top_item