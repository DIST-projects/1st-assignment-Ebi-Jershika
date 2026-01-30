from xmlrpc.server import SimpleXMLRPCServer
import math

def to_upper(text):
    return text.upper()

def array_sum(arr):
    return sum(arr)

def square_root(num):
    return math.sqrt(num)

server = SimpleXMLRPCServer(("0.0.0.0", 8000))
print("RPC Server running on port 8000...")

server.register_function(to_upper, "to_upper")
server.register_function(array_sum, "array_sum")
server.register_function(square_root, "square_root")

server.serve_forever()
