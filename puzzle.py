import heapq
goal=((1,2,3),(4,5,6),(7,8,0))
directions=[(0,1),(1,0),(-1,0),(0,-1)]
start=((1,2,3),(0,4,6),(7,5,8))

def find_blank(state):
    for i in range(3):
        for j in range(3):
            if state[i][j]==0:
                return i,j

def h1(state):
    misplaced=0
    for i in range(3):
        for j in range(3):
            if state[i][j]!=0 and state[i][j]!=goal[i][j]:
                misplaced+=1
    return misplaced

def h2(state):
    distance=0
    for i in range(3):
        for j in range(3):
            value=state[i][j]
            if value!=0:
                goal_x=(value-1)//3
                goal_y=(value-1)%3
                distance+=abs(goal_x-i)+abs(goal_y-j)
    return distance

def neighbors(state):
    x,y=find_blank(state)
    result=[]
    for dx,dy in directions:
        nx,ny=x+dx,y+dy
        if 0<=nx<3 and 0<=ny<3:
            temp=[list(row) for row in state]
            temp[x][y],temp[nx][ny]=temp[nx][ny],temp[x][y]
            result.append(tuple(tuple(row) for row in temp))
    return result

def astar(start,heuristic):
    pq=[]
    heapq.heappush(pq,(0,start))
    visited=set()
    g_cost={start:0}
    nodes_explored=0
    while pq:
        f,state=heapq.heappop(pq)
        nodes_explored+=1
        if state==goal:
            return g_cost[state],nodes_explored
        visited.add(state)
        for next_state in neighbors(state):
            if next_state in visited:
                continue
            new_cost=g_cost[state]+1
            if next_state not in g_cost or new_cost<g_cost[next_state]:
                g_cost[next_state]=new_cost
                f_value=new_cost+heuristic(next_state)
                heapq.heappush(pq,(f_value,next_state))
    return None

depth1,nodes1=astar(start,h1)
depth2,nodes2=astar(start,h2)

print("Using H1 (Misplaced Tiles)")
print("Solution Depth:",depth1)
print("Nodes Explored:",nodes1)
print("\nUsing H2 (Manhattan Distance)")
print("Solution Depth:",depth2)
print("Nodes Explored:",nodes2)