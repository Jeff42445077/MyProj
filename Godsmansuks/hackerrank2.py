    # a = [x1,y1]
    # b = [x2,y2]
    # c = [x3,y3]
    # p = [xp,yp]
    # q = [xq,yq]
    
    # # check triangle
            #  # Calculate area of triangle ABC
        # A = area (x1, y1, x2, y2, x3, y3)
    
        # # Calculate area of triangle PBC
        # A1 = area (xp, yp, x2, y2, x3, y3)
        
        # # Calculate area of triangle PAC
        # A2 = area (x1, y1, xp, yp, x3, y3)
        
        # # Calculate area of triangle PAB
        # A3 = area (x1, y1, x2, y2, xp, yp)
        
        
        
        # # Calculate area of triangle qBC
        # B1 = area (xq, yq, x2, y2, x3, y3)
        
        # # Calculate area of triangle qAC
        # B2 = area (x1, y1, xq, yq, x3, y3)
        
        # # Calculate area of triangle qAB
        # B3 = area (x1, y1, x2, y2, xq, yq)
        
        # # Check if sum of A1, A2 and A3
        # # is same as A
        # if(A == A1 + A2 + A3) and (A != B1 + B2 + B3):  return 1
        # elif(A != A1 + A2 + A3) and (A == B1 + B2 + B3):  return 2
        # elif(A == A1 + A2 + A3) and (A == B1 + B2 + B3):  return 3
        # elif(A != A1 + A2 + A3) and (A != B1 + B2 + B3):  return 4

        # # else:
        # #     return False
        
        
def is_point_inside_triangle(x1, y1, x2, y2, x3, y3, xp, yp, xq, yq):
    # Calculate the area of the triangle using vertices (x1, y1), (x2, y2), and (x3, y3)
    def triangle_area(x1, y1, x2, y2, x3, y3):
        return 0.5 * abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)))

    # Calculate the total area of the triangle
    total_area = triangle_area(x1, y1, x2, y2, x3, y3)

    # Calculate the areas of the triangles formed by replacing one vertex with the point P and Q
    area1 = triangle_area(xp, yp, x2, y2, x3, y3)
    area2 = triangle_area(x1, y1, xp, yp, x3, y3)
    area3 = triangle_area(x1, y1, x2, y2, xp, yp)

    # Calculate the remaining area when P and Q are removed from the triangle
    remaining_area = total_area - area1 - area2 - area3

    # If the sum of the areas of the sub-triangles equals the total area, P and Q are inside the triangle
    return remaining_area == 0

# Example usage:
x1, y1 = 0, 0
x2, y2 = 4, 0
x3, y3 = 0, 3
xp, yp = 2, 1
xq, yq = 1, 2

result_p = is_point_inside_triangle(x1, y1, x2, y2, x3, y3, xp, yp, xq, yq)
result_q = is_point_inside_triangle(x1, y1, x2, y2, x3, y3, xq, yq, xp, yp)

print(f"Point P is inside the triangle: {result_p}")
print(f"Point Q is inside the triangle: {result_q}")
