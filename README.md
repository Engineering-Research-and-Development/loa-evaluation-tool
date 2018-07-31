# LoA Evaluation Tool

## Description of the component

The LoA Evaluation Tool, consists of a sequence of operations, which begins with the identification of the optimal overall LoA (Level Of Automation), using the information recorded during the process of acquiring HTA data, followed by the determination of LoA's high-level tasks, data from the sub-activities of lower level, to conclude with the analysis of the Scenarios related to the costs, base and those of each sub-process, imputable to an organization that intends to obtain an estimate of costs for an optimal level of automation (LoA) possible.

### LoA Evalutation Tool Architecture

### Developer environment

This procedure assumes that you have [Apache Tomcat](https://tomcat.apache.org/download-80.cgi) (version >= **8**), 
[JDK](http://www.oracle.com/technetwork/java/javase/downloads)(version >= **8**) and [PostegreSQL] (https://www.postgresql.org/download/) (version >= **9.5**) installed in your environment.

#### Related components

The LoA Tool communicates with the SAR [semantic-asset-registry](https://github.com/is3labengrd/semantic-asset-registry) component to save the cost items related to the scenario calculation. 
Use the [docker-compose](https://github.com/is3labengrd/loa-evaluation-tool/blob/master/docker-compose.yml) file in your development environment (preferably use a VM with SO CentosOS7 or Ubuntu).

This procedure assumes that you have installed [Docker](https://docs.docker.com/install/) and [docker-compose] (https://docs.docker.com/compose/install/) command in your environment:

• Install and execute docker compose file:

 **A.** Copy the file to a file system directory (make sure the user has full rights to run the file) <br/>
 **B.** Go under the directory and run the following command: # docker-compose up & <br/>
 **C.** Wait for the services to start. 
 
| Service       | Value                                         | 
| ------------- |:---------------------------------------------:| 
| CAM		         | http://localhost:8080/CAM 		 	                |
| CAMService    | http://localhost:8080/CAMService 	            |
| RDF4J		       | http://localhost:8080/rdf4j-workbench         |
| RDF4J		       | http://localhost:8080/rdf4j-server            |
| IDM           | http://IP:800/SAR		                           | 
| OCB  			      | http://IP:1026 							                        |


#### Database Schema

Lo schema del data base del Tool può essere installato tramite questo [Script SQL] (https://github.com/is3labengrd/loa-evaluation-tool/blob/master/loa_evaluation_tool_script.sql). 

• Install data base schema:

	**A.** Copy the SQL file to a file system directory (make sure the user has full rights to run the file)
	**B.** Open shell linux command
	**C.** Execute this command line: psql -U loa_evaluation_tool -h 127.0.0.1 -d loa_evaluation_tool -a -f loa_evaluation_tool_script.sql
 **D.** Verifiy if the schema was correctly imported.



