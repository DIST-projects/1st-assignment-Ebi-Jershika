import xmlrpc.client

proxy = xmlrpc.client.ServerProxy("http://13.233.108.133:8000/")

print("Uppercase:", proxy.to_upper("cloud computing"))
print("Array Sum:", proxy.array_sum([10, 20, 30]))
print("Square Root:", proxy.square_root(49))
