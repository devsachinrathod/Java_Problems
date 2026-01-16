# # a = 7
# # range_start = 1
# # range_end = 10
# # for i in range(range_start, range_end + 1):
# #     if i % a == 0:
# #         print(f"{i} is a multiple of {a}")
# #     else:
# #         print(f"{i} is not a multiple of {a}")

# # for i in range(1, 11):
# #    if i ==10:
# #        print(f"{i} is the last number in the range");
# #    else:
# #        print(f"{i} is not the last number in the range");


# class Node :
#     def __init__(self, value):
#         self.value = value
#         self.next = None

#     def print_list(self):
#         current = self
#         while current:
#             print(current.value)
#             current = current.next
        


# def check_last_number(num, end):
#     if(num != end):
#         return False
#         print("This will never be printed")
#     else:
#         return True
    
# check_last_number(5, 20)

def find_maximum_value(head):
    if head is None:
        return None

    max_value = head.value
    current = head.next

    while current:
        if current.value > max_value:
            max_value = current.value
        current = current.next

    return max_value

def print_the_parameter(param):
    print(param)
    while(param < 10):
        param += 1
        print(param)
    return param
for i in range(3):
    print(i)
    


print_the_parameter(5)