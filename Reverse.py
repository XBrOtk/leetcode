class Solution(object):
    def reverse_worng(self, x):
        """
        :type x: int
        :rtype: int
        """
        rev=0
        if x >= 2**31-1 or x <= -2**31:
            print("eee")
            return 0
        while(x != 0):
            pop = x % 10
            print(pop)
            x = x / 10
            print(x)
            if (int(rev) >= 2**31-1 or int(rev) <= -2**31):
                print("eee")
                return 0
            else:
                rev = rev * 10 + pop
        return rev

    def reverse(self,x):
        if x >= 2**31-1 or x<= -2**31:
            return 0
        else:
            strnew = str(x)
            if x >= 0:
                rev = strnew[::-1]
                rev = int(rev)

            else:
                temp = strnew[1:]
                rev = temp[::-1]
                print(rev)
                while rev[0] == "0":
                        rev = rev[1:]
                rev =  "-" + rev
                rev = int(rev)

            if rev >= 2**31-1 or rev <= -2**31:
                return 0
            else:
                return rev

if __name__ == '__main__':
    x = Solution()
    print(x.reverse(120))
