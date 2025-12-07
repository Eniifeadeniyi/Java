class MyStack:
    def __init__(self, max_size):
        self.stack = []
        self.count = 0
        self.max_size = max_size

    def push(self,item):
        if not(self.is_full()):
            self.stack.append(item)
            self.count += 1
        else:
            raise OverflowError("Stack is full")

    def pop(self):
        if self.count > 0:
            element = self.stack[self.count-1]
            self.count -= 1
            return element
        else:
            raise OverflowError("Stack is empty")

    def is_empty(self):
        if self.count == 0:
            return True
        else:
            return False

    def peek(self):
        if self.count > 0:
            return self.stack[self.count-1]
        else:
            raise OverflowError("Stack is empty")

    def is_full(self):
        if self.count == self.max_size:
            return True
        else:
            return False