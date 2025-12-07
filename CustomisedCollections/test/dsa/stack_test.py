import unittest

from dsa.my_stack import MyStack

class TestStack(unittest.TestCase):
    def test_stack_is_empty_upon_creation(self):
        stack = MyStack(5)
        self.assertTrue(stack.is_empty())

    def test_push_into_stack(self):
        stack = MyStack(5)
        stack.push("eniife")
        self.assertFalse(stack.is_empty())

    def test_pop_from_stack(self):
        stack = MyStack(5)
        stack.push("eniife")
        self.assertEqual(stack.pop(), "eniife")

    def test_pop_from_empty_stack(self):
        stack = MyStack(5)
        with self.assertRaises(OverflowError):
            stack.pop()

    def test_push_into_full_stack(self):
        stack = MyStack(5)
        stack.push("eniife")
        stack.push("eniif")
        stack.push("iif")
        stack.push("ife")
        stack.push("if")
        with self.assertRaises(OverflowError):
            stack.push("25")

    def test_peek(self):
        stack = MyStack(5)
        stack.push("eniife")
        stack.push("eniif")
        stack.push("iif")
        self.assertEqual(stack.peek(), "iif")

    def test_peek_empty_stack(self):
        stack = MyStack(5)
        with self.assertRaises(OverflowError):
            stack.peek()

    def test_is_full(self):
        stack = MyStack(5)
        stack.push("eniife")
        stack.push("eniif")
        stack.push("if")
        stack.push("ife")
        stack.push("life")
        self.assertTrue(stack.is_full())




