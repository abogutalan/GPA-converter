import unittest

#
# This example unittest test case runs some tests on the string operations
#

class TestStringMethods(unittest.TestCase):

    def test_upper(self):
        print("Hello!")
        self.assertEqual('foo'.upper(), 'FOO')

    def test_isupper(self):
        print("split")
        self.assertTrue('FOO'.isupper())
        self.assertFalse('Foo'.isupper())

    def test_split(self):
        s = 'hello world'
        print(s.split())
        self.assertEqual(s.split(), ['hello', 'world'])
        # check that s.split fails when the separator is not a string
        with self.assertRaises(TypeError):
            s.split(2)

if __name__ == '__main__':
    unittest.main()
