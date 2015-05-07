Semester Scrum Project: Physics Calculator
-------------------------------------------

This project requires several things as per described in the Maven project file.
The project can be cloned into a local repository and opened with Netbeans. Once open, run:
Build & Clean
Run

This will launch a local instance of the Physics Calculator in your web browser. (Note: you may have to configure a local web server such as Tomcat or Glassfish in order to get the local instance to deploy properly.)

Once the project is at a satisfactory state, the build in heroku tools can be used for deployment. Simply run `heroku deploy:war --war target<name-of-war-file>.war --app <heroku-app-name>`

This will compile the necessary files and upload them straight to heroku.
