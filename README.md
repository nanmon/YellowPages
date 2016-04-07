# YellowPages
The following examples show how to use the Yellow Pages service provided by the DF (Directory Facilitator) agent.

DFRegisterAgent

Description:
This example shows how to register an application specific service in the Yellow Pages catalogue managed by the DF Agent so that other agents can dynamically discover it. In this case in particular we register a “Weather-forecast” service for Italy. The name of this service is specified as a command line argument.This example should be used together with the DFSearchAgent and the DFSubscribeAgent as described below.

Start the JADE runtime (with the management GUI) and launch a DFRegisterAgent on it. Also specify a name for the service to register (e.g. “my-forecast”) as an argument. The command line could be
java jade.Boot -gui provider:examples.yellowPages.DFRegisterAgent(my-forecast)
Then, from another window (or from the management GUI), launch a DFSearchAgent.
java jade.Boot -container searcher:examples.yellowPages.DFSearchAgent
The DFSearchAgent should find the service registered by the DFRegisterAgent.
After that, from another window (or from the management GUI), launch a DFSubscribeAgent.
java jade.Boot -container subscriber:examples.yellowPages.DFSubscribeAgent
The DFSubscribeAgent should immediately be notified about the service registered by the DFRegisterAgent.
Finally, from another window (or from the management GUI), launch another DFRegisterAgent.
java jade.Boot -container provider-1:examples.yellowPages.DFRegisterAgent(“forecast-1″)
The DFSubsribeAgent should automatically be notified about the newly registered service.
