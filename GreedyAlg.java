package xyz;

public class GreedyAlg {
	static class Transport
	{
		String name;
		int time;
		int cost;
		Transport(String name,int time,int cost)
		{
			this.name=name;
			this.time=time;
			this.cost=cost;
		}
	}

	public static void main(String[] args) {
		Transport[] options= {
				new Transport("fight",1,5000),
				new Transport("train",15,1000),
				new Transport("Bus",30,500)
		};
		Transport best=options[0];
		for(int i=1;i<options.length;i++)
		{
			if(options[i].time < best.time)
			{
				best=options[i];
			}
		}
		System.out.println(best.time+"-time:"+best.time+"hours,cost:"+best.cost);

	}

}