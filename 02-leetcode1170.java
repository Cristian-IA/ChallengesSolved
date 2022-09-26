//Java
import java.util.*;

class SmallerFrequency {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(Arrays.toString(sl.numSmallerByFrequency(new String[] { "cbd" }, new String[] { "zaaaz" })));
        System.out.println(Arrays.toString(
                sl.numSmallerByFrequency(new String[] { "bbb", "cc" }, new String[] { "a", "aa", "aaa", "aaaa" })));
    }
}

class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {

        int[] result = new int[queries.length];


        int[] query = new int[queries.length];
        int[] word = new int[words.length];

        for (int i = 0; i < queries.length; i++) {
            query[i] = getMinQuery(queries[i]);
        }

        // System.out.println(Arrays.toString(qr));

        for (int i = 0; i < words.length; i++) {
            word[i] = getMinQuery(words[i]);
        }

        // System.out.println(Arrays.toString(wor));

        for (int i = 0; i < query.length; i++) {

            int count = 0;
            for (int j = 0; j < word.length; j++) {

                if (query[i] < word[j]) {
                    count++;
                }
            }

            result[i] = count;
        }

        return result;

    }

    public int getMinQuery(String s) {

        char[] charAr = s.toCharArray();
        Arrays.sort(charAr);

        int minLenQuery = 1;

        for (int i = 1; i < charAr.length; i++) {
            if (charAr[0] == charAr[i]) {
                minLenQuery++;
            }

        }
        return minLenQuery;
    }
}
//Javascript
var numSmallerByFrequency = function(queries, words) {

    let ans = [];

    let qr = [];
    let wor = [];


    for (let i = 0; i < queries.length; i++) {
        qr[i] = getMinQuery(queries[i]);
    }

    for (let i = 0; i < words.length; i++) {
        wor[i] = getMinQuery(words[i]);
    }

    for (let i = 0; i < qr.length; i++) {

        let count = 0;
        for (let j = 0; j < wor.length; j++) {

            if (qr[i] < wor[j]) {
                count++;
            }
        }

        ans[i] = count;
    }

    return ans;
};

var getMinQuery = function(s) {

    let charAr = [...s];
    charAr.sort();

    let minLenQuery = 1;

    for (var i = 1; i < charAr.length; i++) {
        if (charAr[0] == charAr[i]) {
            minLenQuery++;
        }

    }
    return minLenQuery;
}

console.log(numSmallerByFrequency(["cbd"],["zaaaz"]));
console.log(numSmallerByFrequency(["bbb","cc"],["a","aa","aaa","aaaa"]));
//C#
public class Solution
{
    public int[] NumSmallerByFrequency(string[] queries, string[] words)
    {
        int[] result = new int[queries.Length];


        int[] query = new int[queries.Length];
        int[] word = new int[words.Length];

        for (int i = 0; i < queries.Length; i++)
        {
            query[i] = getMinQuery(queries[i]);
        }


        for (int i = 0; i < words.Length; i++)
        {
            word[i] = getMinQuery(words[i]);
        }


        for (int i = 0; i < query.Length; i++)
        {

            int count = 0;
            for (int j = 0; j < word.Length; j++)
            {

                if (query[i] < word[j])
                {
                    count++;
                }
            }

            result[i] = count;
        }

        return result;
    }

    public int getMinQuery(String s)
    {

        char[] charAr = s.ToCharArray(0, s.Length);
        Array.Sort(charAr);

        int minLenQuery = 1;

        for (int i = 1; i < charAr.Length; i++)
        {
            if (charAr[0] == charAr[i])
            {
                minLenQuery++;
            }

        }
        return minLenQuery;
    }
}
