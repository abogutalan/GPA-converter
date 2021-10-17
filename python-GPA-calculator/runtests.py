import unittest
import gpa_calculator

#
# This unittest evaluates the highest,lowest and midrange value for each letter grade the system supports
#


def evaluate_grade_to_letter(self,expected_letter, grade):

    actual_letter = gpa_calculator.gpa_converter.getLetterForNumericGrade(grade)

    self.assertEqual(actual_letter, expected_letter)
    

class TestStringMethods(unittest.TestCase):

    # testing grade A+

    def test100percent(self):
        grade = 100
        evaluate_grade_to_letter(self,"A+", grade)

    def test95percent(self):
        grade = 95
        evaluate_grade_to_letter(self,"A+", grade)

    def test90percent(self):
        grade = 90
        evaluate_grade_to_letter(self,"A+", grade)

    # testing grade A

    def test89percent(self):
        grade = 89
        evaluate_grade_to_letter(self,"A", grade)

    def test87percent(self):
        grade = 87
        evaluate_grade_to_letter(self,"A", grade)

    def test85percent(self):
        grade = 85
        evaluate_grade_to_letter(self,"A", grade)

    # testing A-

    def test84percent(self):
        grade = 84
        evaluate_grade_to_letter(self,"A-", grade)

    def test82percent(self):
        grade = 82
        evaluate_grade_to_letter(self,"A-", grade)

    def test80percent(self):
        grade = 80
        evaluate_grade_to_letter(self,"A-", grade)

    # testing B+ 77,79

    def test79percent(self):
        grade = 79
        evaluate_grade_to_letter(self,"B+", grade)

    def test78percent(self):
        grade = 78
        evaluate_grade_to_letter(self,"B+", grade)

    def test77percent(self):
        grade = 77
        evaluate_grade_to_letter(self,"B+", grade)

    # testing B 73,76

    def test76percent(self):
        grade = 76
        evaluate_grade_to_letter(self,"B", grade)

    def test74_5percent(self):
        grade = 74.5
        evaluate_grade_to_letter(self,"B", grade)

    def test73percent(self):
        grade = 73
        evaluate_grade_to_letter(self,"B", grade)

    # testing B- 70,72

    def test72percent(self):
        grade = 72
        evaluate_grade_to_letter(self,"B-", grade)

    def test71percent(self):
        grade = 71
        evaluate_grade_to_letter(self,"B-", grade)

    def test70percent(self):
        grade = 70
        evaluate_grade_to_letter(self,"B-", grade)

    # testing C+ 67,69

    def test69percent(self):
        grade = 69
        evaluate_grade_to_letter(self,"C+", grade)

    def test68percent(self):
        grade = 68
        evaluate_grade_to_letter(self,"C+", grade)

    def test67percent(self):
        grade = 67
        evaluate_grade_to_letter(self,"C+", grade)

    # testing C 63,66

    def test66percent(self):
        grade = 66
        evaluate_grade_to_letter(self,"C", grade)

    def test64_5percent(self):
        grade = 64.5
        evaluate_grade_to_letter(self,"C", grade)

    def test63percent(self):
        grade = 63
        evaluate_grade_to_letter(self,"C", grade)

    # testing C- 60,62

    def test62percent(self):
        grade = 62
        evaluate_grade_to_letter(self,"C-", grade)

    def test61percent(self):
        grade = 61
        evaluate_grade_to_letter(self,"C-", grade)

    def test60percent(self):
        grade = 60
        evaluate_grade_to_letter(self,"C-", grade)

    # testing D+ 57,59

    def test59percent(self):
        grade = 59
        evaluate_grade_to_letter(self,"D+", grade)

    def test58percent(self):
        grade = 58
        evaluate_grade_to_letter(self,"D+", grade)

    def test57percent(self):
        grade = 57
        evaluate_grade_to_letter(self,"D+", grade)

    # testing D 53,56

    def test56percent(self):
        grade = 56
        evaluate_grade_to_letter(self,"D", grade)

    def test54_5percent(self):
        grade = 54.5
        evaluate_grade_to_letter(self,"D", grade)

    def test53percent(self):
        grade = 53
        evaluate_grade_to_letter(self,"D", grade)
        
    # testing D- 50,52

    def test52percent(self):
        grade = 52
        evaluate_grade_to_letter(self,"D-", grade)

    def test51percent(self):
        grade = 51
        evaluate_grade_to_letter(self,"D-", grade)

    def test50percent(self):
        grade = 50
        evaluate_grade_to_letter(self,"D-", grade)

    # testing F 0,49

    def test49percent(self):
        grade = 49
        evaluate_grade_to_letter(self,"F", grade)

    def test24_5percent(self):
        grade = 24.5
        evaluate_grade_to_letter(self,"F", grade)

    def test0percent(self):
        grade = 0
        evaluate_grade_to_letter(self,"F", grade)

    
if __name__ == '__main__':
    unittest.main()
