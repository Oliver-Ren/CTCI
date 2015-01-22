typedef struct Node
{
	ElementType data;
	struct Node * next;
}Node, *NodePtr;

typedef struct
{
	Node * head;
	Node * tail;
	int len;
}Spqueue;

Status Enqueue(Spqueue * Q, ElementType ele)
{
	Node * s = (Node *)malloc( sizeof( Node ) );
	if (!s)
		exit(OVERFLOW);
	s->data = ele;
	s->next = NULL;  //you should consider carefully
	Q->tail->next = s;
	Q->tail = Q->tail->next;
	return OK;
}

Status Dequeue(Spqueue * Q, ElementType * ele)
{
	if (Q->head == Q->tail) 
		return ERROR;
	Node * temp = Q->head->next;  //care about the dummy head
	*ele = temp->data;
	Q->head->next = temp->next;
	if (Q->tail == temp)
	       Q->tail = Q->head;   //consider carefully about the one element considition, this time the dummy head makes use.	
	free(temp);
	Q->head = Q->head->next;
	return OK;
}
