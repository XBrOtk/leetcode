class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        LCP = ""
        b = min(strs)
        print(b)
        if strs == "":
            return 0
        for i in range(len(min(strs))):
            c = strs[0][i]
            if all(a[i] == c for a in strs):
                LCP = LCP + c
            else:
                return LCP
        return LCP
        




if __name__ == '__main__':
    x = Solution()
    print(x.longestCommonPrefix(["leb","leble","le"]))