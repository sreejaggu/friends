# friends
monitor friends service and send logs to elastic cloud


Please follow below given simple instructions to run the application.

1. Extract  the downloaded 'friends.zip' file to a folder in your machine, you will see a folder 'friends' extracted out of zip file.
2. 'friends' folder has agent file here:  'agent\elastic-apm-agent-1.17.0.jar'. This is the agent available from elastic.co in Maven repository.
3. Edit application.properties file inside 'friends' folder to enter actual values to hostname, port(if different than default mysql port), databasename, username and password to connect to a mysql server in your environment.
4. Open a command prompt and navigate to the 'friends' folder.
5. Copy the command from 'instrument-app-cmd.txt' inside the 'friends' folder and paste it in the command prompt and press enter.

Later open the elastic cloud APM page to see the 'friends' service listed under services and many other metrics available at transaction level, at JVM level etc.,
Please find attached a word document 'Friends-ElasticCloudKibana.docx' containing screeshots of different metrics from 'friends' service.The elastic APM agent sends the metrics to elastic cloud.

Block diagram:


![MonitorFriends](https://user-images.githubusercontent.com/53043095/126027662-0c9f696a-d2a2-40b1-be13-e330e07a0231.png)
