class MyQueue:
    def __init__(self, max_size):
        self.queue = []
        self.count = 0
        self.max_size = max_size

    def add(self, element):
        if self.count != self.max_size:
            self.queue.append(element)
            self.count += 1
            return True
        else:
            raise OverflowError("Queue is full")

    def offer(self, element):
        if self.count != self.max_size:
            self.queue.append(element)
            self.count += 1
            return True
        else:
            return False

    def remove(self):
        if self.count != 0:
            element = self.queue[0]
            for count in range(1, self.count):
                self.queue[count-1] = self.queue[count]
            self.count -= 1
            return element
        else:
            raise OverflowError("Queue is empty")

    def poll(self):
        if self.count != 0:
            element = self.queue[0]
            for count in range(1, self.count):
                self.queue[count-1] = self.queue[count]
            self.count -= 1
            return element
        else:
            return None

    def element(self):
        if self.count != 0:
            return self.queue[0]
        else:
            raise OverflowError("Queue is empty")

    def peek(self):
        if self.count != 0:
            return self.queue[0]
        else:
            return None