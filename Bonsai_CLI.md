To create brain:
* bonsai brain create -n <your-brain_name>

To define inkling to use for brain:
* bonsai brain version update-inkling -f <your-inkling_name>.ink -n <your-brain_name>

in case you have not defined your environment keys go to ".env" file and define the following
* SET SIM_WORKSPACE=<your-workspace-id>
* SET SIM_ACCESS_KEY=<your-access-key>

note that you will need a new access key if one has not already been previously saved
alternatively you can use the command below for a more interactive setup
* python main.py --config-setup

bonsai simulator unmanaged connect -b <brain_name> -a Train -c BalancePole --simulator-name Cartpole