
# INITIALIZE THE LOCAL FOLDER FOR GIT TRACKING
1. `git -v \ git --version` - to get installed version of git OR to check if git is installed
2. `git init` - to initialize a project folder on local
3. `git status` - to check the status of the project folder
4. `git add .` - to start tracking all the items in the directory
5. `git commit -m "<your_message>"` - to commit to local git repo. If you add -m then type your message in `"<your_message>"`
6. OPTIONAL: type `git status` to check if files are locally committed

# INITIALIZE NEW GITHUB REPOSITORY
1. GO TO GITHUB AND CREATE A NEW REPOSITORY AND COPY ITS LINK that ends with .git
2. `git remote add origin <your_repository_link.git>` this tells git "My repo is at GitHub and i will call it origin"
3. `git push -u origin master` this will push your code to the repository, to the master branch by default so next time you just have to type `git push` to push the code to github to its master branch