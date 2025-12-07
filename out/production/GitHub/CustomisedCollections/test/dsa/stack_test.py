import unittest

from dsa.my_stack import MyStack


class TestStack(unittest.TestCase):
    def test_stack_is_empty_upon_creation(self):
        stack = MyStack()
        self.assertTrue(stack.is_empty())

