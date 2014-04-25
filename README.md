ServiceTester
=============

Test application services with java and junit or cucumber.
For a proper setup you will need a MongoDb; the default install will suffice. 

Run the FranceDealerAsyncTest it has a complete flow.
Note: You have to run it against a servince. If you dont have one, install Fiddler and run it against localhost:8888


Environment Setup:
You will need java JDK and Maven3.*
Also need a MongoDb.
(Eclipse IDE would also be nice :) )

Test Flow:
*Query db if current test has data saved (Testing environment DB) 
  *(create data and save to db if not)
*Create a XML from data models
*Transform the xml to doc and then to String
*Run a Http Protocol with the data
*Print results from the call
*Query another MongoDB for results (DB to the tested environment)
*Assert results if needed.
*Print results
