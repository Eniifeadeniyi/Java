import unittest

from dsa.my_queue import MyQueue


class QueueTest(unittest.TestCase):

    def test_add(self):
        queue = MyQueue(5)
        self.assertTrue(queue.add(1))

    def test_offer(self):
        queue = MyQueue(5)
        self.assertTrue(queue.offer(1))

    def test_that_add_raises_error_if_full(self):
        queue = MyQueue(5)
        queue.add(1)
        queue.add(2)
        queue.add(3)
        queue.add(4)
        queue.add(5)
        with self.assertRaises(OverflowError):
            queue.add(6)

    def test_offer_returns_false_if_full(self):
        queue = MyQueue(5)
        queue.offer(1)
        queue.offer(2)
        queue.offer(3)
        queue.offer(4)
        queue.offer(5)
        self.assertFalse(queue.offer(6))

    def test_remove(self):
        queue = MyQueue(5)
        queue.add(1)
        queue.add(2)
        queue.add(3)
        self.assertEqual(1,queue.remove())

    def test_remove_raises_error_if_empty(self):
        queue = MyQueue(5)
        with self.assertRaises(OverflowError):
            queue.remove()


    def test_poll(self):
        queue = MyQueue(5)
        queue.add(1)
        queue.add(2)
        queue.add(3)
        self.assertEqual(1,queue.poll())

    def test_poll_returns_None_if_empty(self):
        queue = MyQueue(5)
        self.assertIsNone(queue.poll())

    def test_element(self):
        queue = MyQueue(5)
        queue.add(1)
        queue.add(2)
        queue.add(3)
        self.assertEqual(1,queue.element())

    def test_element_raises_error_if_empty(self):
        queue = MyQueue(5)
        with self.assertRaises(OverflowError):
            queue.element()

    def test_peek(self):
        queue = MyQueue(5)
        queue.add(1)
        queue.add(2)
        queue.add(3)
        self.assertEqual(1,queue.peek())

    def test_peek_returns_None_if_empty(self):
        queue = MyQueue(5)
        self.assertIsNone(queue.peek())

