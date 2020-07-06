# m09-t01
### Horse race emulator

Implement horse race emulator using XML configuration

Required beans:

-	HorseService for horse management (horses with their riders, breeds and other characteristics should be obtained from the configuration)
-	RaceService for simple getRace() method which generates and returns information about the upcoming race (horses can be chosen randomly)
-	EmulationService for real-time race emulation (it generates data about horses’ positions on the console for every second)

Main domain objects: Horse, Race, Rider, Breed.

Add client code:
-	On start-up application shows the information about upcoming race.
-	User is offered to choose a horse (make a bet) with searching by name, breed, rider’s name
-	After that a race emulation starts
-	Winner announcement is displayed
(Nothing super-fancy in UI, just console application)
