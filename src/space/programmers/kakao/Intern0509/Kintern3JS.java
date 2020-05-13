//package space;
//
//public class Kintern3JS {
//    public static int[] solution(String[] gems) {
//        int[] answer ={};
//
//        elements = list(set(gems))
//        taken = [False] *len(elements)
//
//        def solve (taken, first, n, taken_num):
//        if taken[elements.index(gems[n])] is False:
//        taken_num += 1
//        taken[elements.index(gems[n])] = True
//
//        if taken_num == len(taken):
//        return [first + 1, n + 1]
//
//        if (n == len(gems) - 1) and(taken_num < len(taken)):
//        return [0, 999999]
//
//        result = solve(taken, first, n + 1, taken_num)
//
//        return result
//
//        distance = len(gems)
//        answer = []
//
//        for i in range(len(gems) - len(elements)):
//        result = solve(taken, i, i, 0)
//        if (result[1] - result[0]) <distance:
//        distance = result[1] - result[0]
//        answer = result
//        taken = [False] *len(elements)
//
//        return answer
//    }
//
//}