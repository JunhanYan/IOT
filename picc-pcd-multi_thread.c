#include<stdio.h>
#include<pthread.h>
#include<time.h>
#include<stdlib.h>
#define MAX_SLOTS 15

pthread_t pcd_thread[MAX_SLOTS], picc_thread[MAX_SLOTS];
int token=0;
typedef enum picc_status 
{
	IDLE, REQUESTED, DECLARED, HALT	
} picc_status;
typedef struct command
{
	enum type
	{
		REQB, WUPB, SLOT_MARKER, ATTRIB, HLTB
	} com_type;
	int N;
	int slot_num;
	int AFI;
	int CID;
} *command;
//struct command pcd_com;
struct command pcd_com[15];
typedef struct ATQB
{
	int PUPI;
} ATQB;
//ATQB atqb[15];
int get_random_num(int n)
{
	srand((unsigned) time(0));
	int rand_num;
	rand_num = rand()%n+1;
	return rand_num;
}

void send_ATQB(char *picc, int sPUPI)
{

	ATQB atqb;
	atqb.PUPI = sPUPI;
	printf("%s send ATQB to PCD with PUPI = %d\n",picc,atqb.PUPI);
}
void wait_for_ATTRIB_or_HLTB(char *picc, picc_status *status,int i)
{

	for(;;)
	{
		if(pcd_com[i].com_type==ATTRIB)
		{
			printf("Receive CID = %d\n",pcd_com[i].CID);
			printf("%s send answer to ATTRIB\n",picc);
			printf("Now the %s state is Active\n",picc);
			break;
		}else if(pcd_com[i].com_type==HLTB)
		{
			printf("%s send answer to HLTB\n",picc);
			break;
		}
		else
		{
			usleep(5000);
		}
	}
	*status=HALT;
}
void wait_for_marker(int R, char *picc, int i,int sPUPI)
{
	for(;;)
	{
		if((token==0)&&(pcd_com[i].slot_num==R)&&(pcd_com[i].com_type==SLOT_MARKER))
		{
			token = 1;
			send_ATQB(picc,sPUPI);
			
			break;
		}else{
			printf("%s get R= %d\n",picc,R);
			usleep(5000);
		}
	}
}

void wait_for_REQB_or_WUPB(char *picc, picc_status *status, int i, int sPUPI,int internal_app)
{
	int R;

		for(;;)
		{	
		//	printf("state ---%d",*status);
		//	printf("com ---%d",pcd_com[i].com_type);
			if((*status==IDLE||*status==REQUESTED||*status==DECLARED)&&(pcd_com[i].com_type==REQB||pcd_com[i].com_type==WUPB))
			{
				if(pcd_com[i].AFI==0||pcd_com[i].AFI==internal_app)
				{
					if(pcd_com[i].N==1)
					{
						send_ATQB(picc,sPUPI);
						wait_for_ATTRIB_or_HLTB(picc,status, i);				
						break;
					}else
					{
						R = get_random_num(pcd_com[i].N);
						printf("%s Select random number R = %d\n",picc,R);
						if(R==1)
						{

							send_ATQB(picc,sPUPI);
							wait_for_ATTRIB_or_HLTB(picc,status, i);				
							break;
							
						}else
						{
							wait_for_marker(R, picc,i,sPUPI);
							wait_for_ATTRIB_or_HLTB(picc,status, i);											
							token =0;
						}
						
					}

				}else
				{
					continue;
				}
			}else if((*status==HALT)&&(pcd_com[i].com_type==WUPB))
			{
					
				
				if(pcd_com[i].AFI==0||pcd_com[i].AFI==internal_app)
				{
					if(pcd_com[i].N==1)
					{
						send_ATQB(picc,sPUPI);
						wait_for_ATTRIB_or_HLTB(picc,status, i);				
						break;
					}else
					{
						R = get_random_num(pcd_com[i].N);
						printf("%s Select random number R = %d\n",picc,R);
						if(R==1)
						{

							send_ATQB(picc,sPUPI);
							wait_for_ATTRIB_or_HLTB(picc,status, i);				
							break;
							
						}else
						{
							wait_for_marker(R, picc,i,sPUPI);

							wait_for_ATTRIB_or_HLTB(picc,status, i);											
							token =0;
						}
						
					}

				}else
				{
					printf("%s Can't match AFI! Wait for REQB or WUPB\n",picc);
					continue;
				}
			}else
			{
				usleep(5000);
			}
		}
}

void *picc0()
{
	picc_status  *status, tmp;
	tmp = IDLE;
    status = &tmp;
	int internal_app = 2;
	int sPUPI  = 123;
	int i;
	char *picc="PICC0";

	for(;;)
	{

		 wait_for_REQB_or_WUPB(picc,status,0,sPUPI,internal_app);
	}
}

void *picc1()
{

	picc_status  *status, tmp;
	tmp = IDLE;
    status = &tmp;
	int internal_app = 2;
	int sPUPI  = 123;
	int i;
	char *picc="PICC1";

	for(;;)
	{

		 //wait_for_REQB_or_WUPB(picc,status,0,sPUPI,internal_app);
		 wait_for_REQB_or_WUPB(picc,status,1,sPUPI,internal_app);
	}

}
void *picc2()
{

	picc_status  *status, tmp;
	tmp = IDLE;
    status = &tmp;
	int internal_app = 2;
	int sPUPI  = 123;
	int i;
	char *picc="PICC2";

	for(;;)
	{

		 wait_for_REQB_or_WUPB(picc,status,2,sPUPI,internal_app);
		// wait_for_REQB_or_WUPB(picc,status,0,sPUPI,internal_app);
	}

}

void *pcd0()
{
	int i;

	for(;;)
	{

		pcd_com[0].com_type=REQB;
		pcd_com[0].AFI=0;
		pcd_com[0].N=1;
		
		pcd_com[0].com_type=REQB;
		pcd_com[0].AFI=5;
		pcd_com[0].N=1;
		
		pcd_com[0].com_type=WUPB;
		pcd_com[0].AFI=0;
		pcd_com[0].N=15;
		
		pcd_com[0].com_type=SLOT_MARKER;
		for(i=0;i<15;i++)
			pcd_com[0].slot_num=i+1;

		pcd_com[0].com_type=ATTRIB;
		pcd_com[0].CID=3;
		
		pcd_com[0].com_type=HLTB;
	}

}

void *pcd1()
{
		
	int i;

	for(;;)
	{

		pcd_com[1].com_type=REQB;
		pcd_com[1].AFI=0;
		pcd_com[1].N=1;
		
		pcd_com[0].com_type=REQB;
		pcd_com[0].AFI=5;
		pcd_com[0].N=1;
		
		pcd_com[1].com_type=WUPB;
		pcd_com[1].AFI=0;
		pcd_com[1].N=15;
		
		pcd_com[1].com_type=SLOT_MARKER;
		for(i=0;i<15;i++)
			pcd_com[1].slot_num=i+1;

		pcd_com[1].com_type=ATTRIB;
		pcd_com[1].CID=0;
		
		pcd_com[1].com_type=HLTB;
	}
}
void *pcd2()
{

	int i;

	for(;;)
	{

		pcd_com[2].com_type=REQB;
		pcd_com[2].AFI=0;
		pcd_com[2].N=1;
		
		pcd_com[0].com_type=REQB;
		pcd_com[0].AFI=5;
		pcd_com[0].N=1;
		
		pcd_com[2].com_type=WUPB;
		pcd_com[2].AFI=0;
		pcd_com[2].N=15;
		
		pcd_com[2].com_type=SLOT_MARKER;
		for(i=0;i<15;i++)
			pcd_com[2].slot_num=i+1;

		pcd_com[2].com_type=ATTRIB;
		pcd_com[2].CID=2;
		
		pcd_com[2].com_type=HLTB;
	}
}
void create_thread()
{
	pthread_create(&pcd_thread[0],NULL,pcd0,NULL);
	printf("create pcd0\n");
	pthread_create(&pcd_thread[1],NULL,pcd1,NULL);
	printf("create pcd1\n");
	pthread_create(&pcd_thread[2],NULL,pcd2,NULL);
	printf("create pcd2\n");
	pthread_create(&picc_thread[0],NULL,picc0,NULL);
	printf("create picc0\n");
	pthread_create(&picc_thread[1],NULL,picc1,NULL);
	printf("create picc1\n");
	pthread_create(&picc_thread[2],NULL,picc2,NULL);
	printf("create picc2\n");
}
void join_thread()
{
	pthread_join(picc_thread[0],NULL);
	printf("picc0 end\n");
	pthread_join(picc_thread[1],NULL);
	printf("picc1 end\n");
	pthread_join(picc_thread[2],NULL);
	printf("picc2 end\n");
	pthread_join(pcd_thread[0],NULL);
	printf("pcd0 end\n");
	pthread_join(pcd_thread[1],NULL);
	printf("pcd1 end\n");
	pthread_join(pcd_thread[2],NULL);
	printf("pcd2 end\n");
}
int main()
{

	create_thread();
	join_thread();
	sleep(3);
	printf("main thread end\n");
	return 0;
}
