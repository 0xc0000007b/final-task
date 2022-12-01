using System;
using System.Text.RegularExpressions;

namespace ConsoleApplication2
{
    internal static class Program
    {
        public static void Main(string[] args)
        {
            string[] arr = SortArraysBellowOrThreeDigits();
            
            PrintArr(arr);
        }

        private static string[] SortArraysBellowOrThreeDigits()
        {
            string[] arr = { "Hello", "world", "google", "45", ":-0", "loser" };
            string[] textArr = new String[arr.Length];
            
            
            for (int i = 0; i < arr.Length; i++)
            {
                if (arr[i].Length <= 3)
                {
                    textArr[i] = arr[i];
                }

            }
            return textArr;
        }

        private static void PrintArr(string[] arr)
        {
            for(int i = 0; i < arr.Length; i++) Console.Write(arr[i] + " ");
            Console.WriteLine();
        }
    }
}